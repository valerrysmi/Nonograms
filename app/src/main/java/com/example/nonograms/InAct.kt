package com.example.nonograms

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class InAct : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_in)

        val userLogin : EditText = findViewById(R.id.userLoginAuth)
        val userPassword : EditText = findViewById(R.id.userPasswordAuth)

        val button_in_final : TextView = findViewById(R.id.button_in_final)
        button_in_final.setOnClickListener() {
            val login = userLogin.text.toString().trim()
            val password = userPassword.text.toString().trim()

            if (login == "" || password == "") {
                Toast.makeText(this, "Не все поля заполнены", Toast.LENGTH_LONG).show()
            } else {
                val db = DBHelper(this, null)
                val isAuth = db.getUser(login, password)

                if (isAuth) {
                    Toast.makeText(this, "Пользователь $login авторизован", Toast.LENGTH_LONG).show()

                    val intent = Intent(this, MainActivityAfterAuth::class.java)
                    intent.putExtra("login", login)
                    startActivity(intent)

                    userLogin.text.clear()
                    userPassword.text.clear()
                } else {
                    Toast.makeText(this, "Пользователь $login НЕ авторизован", Toast.LENGTH_LONG).show()

                    val intent = Intent(this, RegistrAct::class.java)
                    startActivity(intent)
                }
            }
        }

        val button_to_reg : TextView = findViewById(R.id.button_to_reg)
        button_to_reg.setOnClickListener() {
            val intent = Intent(this, RegistrAct::class.java)
            startActivity(intent)
        }

    }
}