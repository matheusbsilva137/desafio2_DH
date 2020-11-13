package com.digitalhouse.desafio2_dh.ui

import android.content.Intent
import android.graphics.BitmapFactory
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import com.digitalhouse.desafio2_dh.R


class SplashDHFoodsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        BitmapFactory.Options().inSampleSize = 52

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_dh_foods)

        Handler().postDelayed({
            startActivity(Intent(this, LoginActivity::class.java))
            finish()
        }, 3000)
    }
}