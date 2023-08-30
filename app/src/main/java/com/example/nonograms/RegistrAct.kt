package com.example.nonograms

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class RegistrAct : AppCompatActivity() {


    private lateinit var button_reg_final : TextView
    private lateinit var button_to_in : TextView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registr)


        val userLogin : EditText = findViewById(R.id.userLogin)
        val userEmail : EditText = findViewById(R.id.userEmail)
        val userPassword : EditText = findViewById(R.id.userPassword)

        button_reg_final = findViewById(R.id.button_reg_final)
        button_reg_final.setOnClickListener() {
            val login = userLogin.text.toString().trim()
            val email = userEmail.text.toString().trim()
            val password = userPassword.text.toString().trim()

            if (login == "" || email == "" || password == "") {
                Toast.makeText(this, "Не все поля заполнены", Toast.LENGTH_LONG).show()
            } else {
                val user = User(login, email, password)
                val db = DBHelper(this, null)
                db.addUser(user)
                Toast.makeText(this, "Пользователь $login добавлен", Toast.LENGTH_LONG).show()

                val intent = Intent(this, MainActivityAfterAuth::class.java)
                intent.putExtra("login", login)
                startActivity(intent)

                userLogin.text.clear()
                userEmail.text.clear()
                userPassword.text.clear()
            }
        }

        button_to_in = findViewById(R.id.button_to_in)
        button_to_in.setOnClickListener() {
            val intent = Intent(this, InAct::class.java)
            startActivity(intent)
        }


    }
}