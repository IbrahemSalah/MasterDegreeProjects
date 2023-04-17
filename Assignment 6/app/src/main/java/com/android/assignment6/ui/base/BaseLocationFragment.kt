package com.android.assignment6.ui.base

import android.Manifest
import android.annotation.SuppressLint
import android.app.Activity
import android.content.Context
import android.content.pm.PackageManager
import android.location.Location
import android.location.LocationManager
import android.os.Bundle
import android.os.Looper
import android.util.Log
import android.view.View
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.IntentSenderRequest
import androidx.activity.result.contract.ActivityResultContracts
import androidx.core.content.ContextCompat
import androidx.core.location.LocationManagerCompat
import androidx.fragment.app.Fragment
import com.google.android.gms.common.api.ApiException
import com.google.android.gms.common.api.ResolvableApiException
import com.google.android.gms.location.*

abstract class BaseLocationFragment : Fragment() {

    private lateinit var requestPermissionLauncher: ActivityResultLauncher<Array<String>>
    private lateinit var enableLocationLauncher: ActivityResultLauncher<IntentSenderRequest>

    // bunch of location related apis
    private lateinit var mFusedLocationClient: FusedLocationProviderClient
    private lateinit var mSettingsClient: SettingsClient
    private lateinit var mLocationRequest: LocationRequest
    private lateinit var mLocationSettingsRequest: LocationSettingsRequest

    private var mLocationCallback: LocationCallback? = null
    private var mRequestingLocationUpdates: Boolean = false

    var mCurrentLocation: Location? = null

    override fun onAttach(context: Context) {
        super.onAttach(context)

        requestPermissionLauncher = registerForActivityResult(
            ActivityResultContracts.RequestMultiplePermissions()
        ) { permissions ->
            if (permissions[Manifest.permission.ACCESS_FINE_LOCATION] == true ||
                permissions[Manifest.permission.ACCESS_COARSE_LOCATION] == true
            ) {
                Log.i(TAG, "on permission granted")
                mRequestingLocationUpdates = true
                startLocationUpdates()
            } else {
                Log.i(TAG, "on permission denied")
                onLocationPermissionDenied()
            }
        }
        enableLocationLauncher = registerForActivityResult(
            ActivityResultContracts.StartIntentSenderForResult()
        ) {
            when (it.resultCode) {
                Activity.RESULT_OK -> {
                    //startLocationUpdates()
                    Log.i(TAG, "on location enabled")
                }
                Activity.RESULT_CANCELED -> {
                    onLocationDisabled()
                    mRequestingLocationUpdates = false
                    Log.i(TAG, "on location disabled")
                }
            }
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initObservers()
        initLocation()

    }

    override fun onResume() {
        super.onResume()
        // Resuming location updates depending on button state and
        // allowed permissions
        if (mRequestingLocationUpdates && isPermissionGranted()) {
            startLocationUpdates()
        }
    }

    override fun onPause() {
        super.onPause()
        if (mRequestingLocationUpdates) {
            // pausing location updates
            stopLocationUpdates()
        }
    }

    open fun initObservers() {}

    private fun initLocation() {
        mFusedLocationClient = LocationServices.getFusedLocationProviderClient(requireContext())
        mSettingsClient = LocationServices.getSettingsClient(requireContext())
        mLocationCallback = object : LocationCallback() {
            override fun onLocationResult(locationResult: LocationResult) {
                super.onLocationResult(locationResult)
                // location is received
                mCurrentLocation = locationResult.lastLocation
                onLocationUpdated()
            }
        }
        mRequestingLocationUpdates = false
        mLocationRequest = LocationRequest().apply {
            interval = UPDATE_INTERVAL_IN_MILLISECONDS
            fastestInterval = FASTEST_UPDATE_INTERVAL_IN_MILLISECONDS
            smallestDisplacement = SMALLEST_DISPLACEMENT
            priority = LocationRequest.PRIORITY_HIGH_ACCURACY
        }

        val builder = LocationSettingsRequest.Builder()
        builder.addLocationRequest(mLocationRequest)
        mLocationSettingsRequest = builder.build()
    }

    open fun startLocation() {
        // Requesting ACCESS_FINE_LOCATION

        requestPermissionLauncher.launch(
            arrayOf(
                Manifest.permission.ACCESS_FINE_LOCATION,
                Manifest.permission.ACCESS_COARSE_LOCATION
            )
        )
    }

    /**
     * Starting location updates
     * Check whether location settings are satisfied and then
     * location updates will be requested
     */
    @SuppressLint("MissingPermission")
    private fun startLocationUpdates() {
        mSettingsClient.checkLocationSettings(mLocationSettingsRequest)
            ?.addOnSuccessListener {
                mFusedLocationClient.requestLocationUpdates(
                    mLocationRequest,
                    mLocationCallback, Looper.myLooper()
                )
            }?.addOnFailureListener { e ->
                when ((e as ApiException).statusCode) {
                    LocationSettingsStatusCodes.RESOLUTION_REQUIRED -> {
                        Log.i(
                            TAG,
                            "Location settings are not satisfied. Attempting to upgrade " +
                                    "location settings "
                        )
                        val rae = e as ResolvableApiException
                        val intentSenderRequest =
                            IntentSenderRequest.Builder(rae.resolution).build()

                        enableLocationLauncher.launch(intentSenderRequest)

                    }
                    LocationSettingsStatusCodes.SETTINGS_CHANGE_UNAVAILABLE -> {
                        val errorMessage = "Location settings are inadequate, and cannot be " +
                                "fixed here. Fix in Settings."
                        Log.e(TAG, errorMessage)
                        //todo
                    }
                    LocationSettingsStatusCodes.API_NOT_CONNECTED -> {
                        //todo

                    }
                }
            }

    }

    open fun stopLocationUpdates() {
        // Removing location updates
        mFusedLocationClient.removeLocationUpdates(mLocationCallback)
    }

    fun preCheck(action: () -> Unit) {
        if (isPermissionGranted() && isLocationEnabled()) {
            action.invoke()
        } else {
            startLocation()
        }
    }

    fun isPermissionGranted(): Boolean {
        val finePermissionState: Int = ContextCompat.checkSelfPermission(
            requireContext(),
            Manifest.permission.ACCESS_FINE_LOCATION
        )
        val coarsePermissionState: Int = ContextCompat.checkSelfPermission(
            requireContext(),
            Manifest.permission.ACCESS_COARSE_LOCATION
        )
        return finePermissionState == PackageManager.PERMISSION_GRANTED ||
                coarsePermissionState == PackageManager.PERMISSION_GRANTED
    }

    fun isLocationEnabled(): Boolean {
        val manager = requireContext().getSystemService(Context.LOCATION_SERVICE) as LocationManager
        return LocationManagerCompat.isLocationEnabled(manager)
    }

    abstract fun onLocationUpdated()
    abstract fun onLocationDisabled()
    abstract fun onLocationPermissionDenied()

    companion object {
        const val TAG = "BaseLocationFragment"
        const val FASTEST_UPDATE_INTERVAL_IN_MILLISECONDS: Long = 50000
        const val UPDATE_INTERVAL_IN_MILLISECONDS: Long = 50000
        const val SMALLEST_DISPLACEMENT = 170f // 170 m = 0.1 mile
    }


}