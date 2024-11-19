package com.example.trackingapp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

@SuppressLint("CustomSplashScreen")
class SplashScreen : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash_screen)

        val nextbtn = findViewById<Button>(R.id.nextbtn)
        val exit = findViewById<Button>(R.id.exitbtn)

        nextbtn.setOnClickListener {

            // Going to the Main screen.
            startActivity(Intent(this, main_menu::class.java))
        }
        // button to exit the app when it is clicked.
        exit.setOnClickListener {
            finishAffinity()
        }
    }
}