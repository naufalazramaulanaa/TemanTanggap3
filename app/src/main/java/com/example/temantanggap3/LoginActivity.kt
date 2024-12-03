package com.example.temantanggap3

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.temantanggap3.databinding.ViewLoginBinding

class LoginActivity : AppCompatActivity() {
    private lateinit var binding: ViewLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ViewLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Tombol Login
        binding.btnLogin.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java) // Arahkan ke halaman utama
            startActivity(intent)
            finish() // Menutup halaman login
        }

        // Tombol "Don't have an account? Sign Up"
        binding.btnRegis.setOnClickListener {
            val intent = Intent(this, RegisActivity::class.java) // Arahkan ke halaman registrasi
            startActivity(intent)
        }
    }
}
