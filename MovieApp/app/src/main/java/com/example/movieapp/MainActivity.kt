package com.example.movieapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bttnHelp.setOnClickListener{
            val intent  = Intent(this,Help::class.java)
            startActivity(intent)      }
        bttnPref.setOnClickListener{
            val intent  = Intent(this,Preferences::class.java)
            startActivity(intent)      }
    }
}