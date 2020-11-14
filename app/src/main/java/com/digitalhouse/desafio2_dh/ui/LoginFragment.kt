package com.digitalhouse.desafio2_dh.ui

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.digitalhouse.desafio2_dh.R
import kotlinx.android.synthetic.main.fragment_login.*
import kotlinx.android.synthetic.main.fragment_login.view.*

class LoginFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_login, container, false)

        view.btnReg.setOnClickListener{
            findNavController().navigate(R.id.action_loginFragment_to_cadastroFragment)
        }

        view.btnLogin.setOnClickListener{
            startActivity(Intent(activity, MainActivity::class.java))
            activity?.finish()
        }

        return view
    }
}