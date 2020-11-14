package com.digitalhouse.desafio2_dh.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.digitalhouse.desafio2_dh.R
import kotlinx.android.synthetic.main.activity_prato.*
import kotlinx.android.synthetic.main.activity_restaurante.*

class PratoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_prato)

        var nomePrato : String = intent.extras?.getString("nomePrato").toString()
        var imgId : Int = intent.extras!!.getInt("img")
        var descrPrato : String = intent.extras?.getString("descrPrato").toString()
        tvNomePrato.text = nomePrato
        tvDescricaoPrato.text = descrPrato
        ivPrato.setImageResource(imgId)

        ivVoltarPrato.setOnClickListener{
            finish()
        }
    }
}