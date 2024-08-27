package com.bardaval.lputouch

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.WindowInsetsController
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.WindowInsetsControllerCompat

class Splashscreen : AppCompatActivity() {

    private val SPLASH_DISPLAY_LENGTH: Long =2000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splashscreen)

        Handler().postDelayed({

            val mainIntent = Intent(this, MainActivity::class.java)
            startActivity(mainIntent)

            finish()
        }, SPLASH_DISPLAY_LENGTH)
        val controller=WindowInsetsControllerCompat(window,window.decorView)
        controller.hide(WindowInsetsCompat.Type.statusBars())
    }
}
