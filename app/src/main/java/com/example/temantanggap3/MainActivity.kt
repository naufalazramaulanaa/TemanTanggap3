package com.example.temantanggap3

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.temantanggap3.databinding.ViewMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ViewMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ViewMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Tambahkan logika atau UI untuk halaman utama di sini
    }
}
