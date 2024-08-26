package com.zhahira.latihankotlin2

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etUsername = findViewById<EditText>(R.id.username)
        val etPassword = findViewById<EditText>(R.id.password)
        val btnLogin = findViewById<Button>(R.id.login)

        btnLogin.setOnClickListener {
            val username = etUsername.text.toString()
            val password = etPassword.text.toString()

            val correctUsername = "admin"
            val correctPassword = "123456"

            if (username == correctUsername && password == correctPassword) {
                // Berpindah ke WelcomeActivity jika login berhasil
                val intent = Intent(this, WelcomeActivity::class.java)
                startActivity(intent)
                finish() // Mengakhiri MainActivity agar pengguna tidak dapat kembali ke halaman login dengan tombol back
            } else {
                Toast.makeText(this, "Username or Password is incorrect", Toast.LENGTH_SHORT).show()
            }
        }
    }
}