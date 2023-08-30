package com.example.nonograms

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast

class MainActivityAfterAuth : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_after_auth)

        showLogin()

        val button_to_MainAct : TextView = findViewById(R.id.button_to_MainAct)
        button_to_MainAct.setOnClickListener() {
            Toast.makeText(this, "Выход из аккаунта", Toast.LENGTH_LONG).show()
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        val button_play : TextView = findViewById(R.id.button_play_auth)
        button_play.setOnClickListener() {
            val intent = Intent(this, StartAct::class.java)
            startActivity(intent)
        }
    }

    private fun showLogin() {
        val profileName = intent!!.getStringExtra("login")
        val login : TextView = findViewById(R.id.login)
        login.text = profileName.toString()
    }

}