package com.android.assignment6.util

import android.app.Activity
import android.app.Dialog
import android.content.Context
import android.graphics.Color
import android.graphics.PorterDuff
import android.graphics.drawable.Drawable
import android.os.Build
import android.widget.ProgressBar
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.core.content.res.ResourcesCompat
import com.android.assignment6.R


class CustomProgressDialog {

     var dialog: CustomDialog? = null

    fun show(context: Context): Dialog {
        return show(context, null)
    }

    fun show(context: Context, title: CharSequence?): Dialog {
        val inflater = (context as Activity).layoutInflater
        val view = inflater.inflate(R.layout.progress_dialog_view, null)

        val cp_title:TextView = view.findViewById(R.id.cp_title)
        val cp_cardview: CardView = view.findViewById(R.id.cp_cardview)
        val cp_pbar: ProgressBar = view.findViewById(R.id.cp_pbar)


        // Card Title
        cp_title.text = title
        // Card Color
        cp_cardview.setCardBackgroundColor(Color.parseColor("#70000000"))

        // Progress Bar Color
        setColorFilter(cp_pbar.indeterminateDrawable, ResourcesCompat.getColor(context.resources, R.color.white, null))

        // Text Color
        cp_title.setTextColor(Color.WHITE)

        dialog = CustomDialog(context)
        dialog?.setContentView(view)
        dialog?.show()
        return dialog!!
    }

    private fun setColorFilter(drawable: Drawable, color: Int) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
           // drawable.colorFilter = BlendModeColorFilter(color, BlendMode.SRC_ATOP)
        } else {
            @Suppress("DEPRECATION")
            drawable.setColorFilter(color, PorterDuff.Mode.SRC_ATOP)
        }
    }

    class CustomDialog(context: Context) : Dialog(context, R.style.CustomDialogTheme) {
        init {
            // Set Semi-Transparent Color for Dialog Background
            window?.decorView?.rootView?.setBackgroundResource(R.color.dialogBackground)
            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.KITKAT_WATCH) {
                window?.decorView?.setOnApplyWindowInsetsListener { _, insets ->
                    insets.consumeSystemWindowInsets()
                }
            }
        }
    }
}