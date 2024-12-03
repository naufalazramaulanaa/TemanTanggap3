package com.example.temantanggap3

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.temantanggap3.databinding.ViewRegisBinding

class RegisActivity : AppCompatActivity() {
    private lateinit var binding: ViewRegisBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ViewRegisBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Tombol "Daftar"
        binding.btnRegister.setOnClickListener {
            // Logika registrasi (opsional: validasi input, simpan data, dll.)
            val intent = Intent(this, LoginActivity::class.java) // Arahkan ke Login
            startActivity(intent)
            finish() // Menutup halaman registrasi agar tidak kembali ke sini
        }

        // Tombol "Sudah punya akun? Masuk"
        binding.textLoginRedirect.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java) // Arahkan ke Login
            startActivity(intent)
            finish() // Menutup halaman registrasi
        }
    }
}
