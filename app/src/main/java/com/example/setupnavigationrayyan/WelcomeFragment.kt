package com.example.setupnavigationrayyan

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs

class WelcomeFragment: Fragment(R.layout.fragment_welcome) {

    private val args: WelcomeFragmentArgs by navArgs()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val text_view_username = view.findViewById<TextView>(R.id.text_view_username)
        val text_view_password = view.findViewById<TextView>(R.id.text_view_password)
        val btn_ok = view.findViewById<Button>(R.id.btn_ok)

        text_view_username.text = args.username
        text_view_password.text = args.password

        btn_ok.setOnClickListener{
            val action = WelcomeFragmentDirections.actionWelcomeFragmentToHomeFragment()
            findNavController().navigate(action)
        }
    }
}