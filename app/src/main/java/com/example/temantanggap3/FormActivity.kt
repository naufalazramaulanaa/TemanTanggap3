package com.example.temantanggap3

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.temantanggap3.databinding.ViewFormPengaduanBinding

class FormActivity : AppCompatActivity() {
    private lateinit var binding: ViewFormPengaduanBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ViewFormPengaduanBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}