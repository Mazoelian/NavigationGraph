package com.example.setupnavigationrayyan

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs

class LoginFragment: Fragment(R.layout.fragment_login) {

    private val args: LoginFragmentArgs by navArgs()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val edit_text_username = view.findViewById<EditText>(R.id.edit_text_username)
        val edit_text_password = view.findViewById<EditText>(R.id.edit_text_password)


        val usernameDeepLink = args.username

        edit_text_username.setText(usernameDeepLink)

        val btn_confirm = view.findViewById<Button>(R.id.btn_confirm)
        btn_confirm.setOnClickListener{
            val username = edit_text_username.text.toString()
            val password = edit_text_password.text.toString()

            val action = LoginFragmentDirections.actionLoginFragmentToWelcomeFragment(username, password)
            findNavController().navigate(action)
        }    }
}