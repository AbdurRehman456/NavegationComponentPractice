package com.hydratech.navegationcomponentpractice

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_second.*
import kotlinx.android.synthetic.main.fragment_welcome.*

class SecondFragment : Fragment(R.layout.fragment_second) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    confirm_button.setOnClickListener {
        val username = edTextUserName.text.toString()
        val password = edPassword.text.toString()
        val action = SecondFragmentDirections.actionSecondFragmentToWelcomeFragment(username, password)
        findNavController().navigate(action)
    }
    }



}