package com.example.nonograms

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Field5x5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_field5x5)

        val button_level_1_1 : TextView = findViewById(R.id.level_1_1)
        button_level_1_1.setOnClickListener() {
            val intent = Intent(this, Level_1_1::class.java)
            startActivity(intent)
        }

        val button_level_1_2 : TextView = findViewById(R.id.level_1_2)
        button_level_1_2.setOnClickListener() {
        }

        val button_level_1_3 : TextView = findViewById(R.id.level_1_3)
        button_level_1_3.setOnClickListener() {
        }
    }

}

