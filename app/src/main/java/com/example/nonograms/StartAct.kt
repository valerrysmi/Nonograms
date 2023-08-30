package com.example.nonograms

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class StartAct : AppCompatActivity() {
    @SuppressLint("CutPasteId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)

        val button_field_5 = findViewById<TextView>(R.id.field5x5)
        button_field_5.setOnClickListener() {
            val intent = Intent(this, Field5x5::class.java)
            startActivity(intent)
        }

        val button_field_10 : TextView = findViewById(R.id.field10x10)
        button_field_10.setOnClickListener() {
            val intent = Intent(this, Field10x10::class.java)
            startActivity(intent)
        }

        val button_field_15 : TextView = findViewById(R.id.field15x15)
        button_field_15.setOnClickListener() {
            val intent = Intent(this, Field15x15::class.java)
            startActivity(intent)
        }
    }
}