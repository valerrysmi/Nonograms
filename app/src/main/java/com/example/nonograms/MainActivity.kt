package com.example.nonograms

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var button_in : TextView
    private lateinit var button_registr : TextView
    private lateinit var button_play : TextView
    private lateinit var button_learning : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button_in = findViewById(R.id.button_in)
        button_in.setOnClickListener() {
            val intent = Intent(this, InAct::class.java)
            startActivity(intent)
        }

        button_registr = findViewById(R.id.button_registr)
        button_registr.setOnClickListener() {
            val intent = Intent(this, RegistrAct::class.java)
            startActivity(intent)
        }

        button_play = findViewById(R.id.button_play)
        button_play.setOnClickListener() {
            val intent = Intent(this, StartAct::class.java)
            startActivity(intent)
        }
    }



}