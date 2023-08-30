package com.example.nonograms

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class LearningAct : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_learning)

        val button_learning1 : TextView = findViewById(R.id.button_learning1)
        button_learning1.setOnClickListener() {
            val intent = Intent(this, LearnAct1::class.java)
            startActivity(intent)
        }

        val button_learning2 : TextView = findViewById(R.id.button_learning2)
        button_learning2.setOnClickListener() {
            val intent = Intent(this, LearnAct2::class.java)
            startActivity(intent)
        }

        val button_learning3 : TextView = findViewById(R.id.button_learning3)
        button_learning3.setOnClickListener() {
            val intent = Intent(this, LearnAct3::class.java)
            startActivity(intent)
        }

    }
}