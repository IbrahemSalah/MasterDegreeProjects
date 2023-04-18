package com.android.assignment6.ui.contact

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.android.assignment6.R
import com.android.assignment6.databinding.FragmentContactBinding
import com.android.assignment6.ui.base.BaseViewModelFragment
import com.android.assignment6.ui.home.HomeViewModel

class ContactFragment : BaseViewModelFragment<HomeViewModel, FragmentContactBinding>(
    HomeViewModel::class
) {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentContactBinding.inflate(layoutInflater)

        val contacts = ArrayList<Contact>()
        contacts.add(Contact("+1(641)233-9470", "Phone", R.drawable.phone))
        contacts.add(Contact("developer@gmail.com", "Email", R.drawable.envelope))
        contacts.add(
            Contact(
                "https://www.linkedin.com/in/tahaamin/",
                "LinkedIn Website",
                R.drawable.linkedin
            )
        )
        contacts.add(Contact("https://github.com/tahazayed", "GitHub", R.drawable.github))
        contacts.add(Contact("PDF", "Resume PDF", R.drawable.pdf))

        var ad_ob = ContactAdapter(contacts)
        // binding.rcv.layoutManager = GridLayoutManager(getActivity(),2)
        binding.rcv.layoutManager = LinearLayoutManager(activity)
        binding.rcv.adapter = ad_ob
        return binding.root
    }

}