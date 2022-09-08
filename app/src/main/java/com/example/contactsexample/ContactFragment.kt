/*
package com.example.contactsexample

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.activityViewModels
import androidx.viewpager2.widget.ViewPager2
import kotlinx.coroutines.currentCoroutineContext

class ContactFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_contact, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val viewModel:ContactViewModel by activityViewModels()
        val nameTv=view.findViewById<TextView>(R.id.fragment_contact_name)
        val phnTv=view.findViewById<TextView>(R.id.fragment_contact_phone)

        val viewpager=view.findViewById<ViewPager2>(R.id.viewpager)
        //viewModel.currentPosition.value?.let { viewpager.setCurrentItem(it,false) }
        */
/*viewModel.contact.observe(viewLifecycleOwner) {
            //val contact=viewModel.list[viewModel.currentPosition.value!!]
            nameTv.text = it.name//contact.name
            phnTv.text =it.phoneNumber //contact.phoneNumber
        }*//*

        */
/*arguments?.takeIf { it.containsKey("pos") }?.apply {
            //val textView: TextView = view.findViewById(android.R.id.text1)
            nameTv.text = viewModel.list[getInt("pos")].name
            phnTv.text=viewModel.list[getInt("pos")].phoneNumber
        }*//*

    }

}*/
