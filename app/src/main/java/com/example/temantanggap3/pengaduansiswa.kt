package com.example.temantanggap3

import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.ContextCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowCompat
import androidx.core.view.WindowInsetsCompat

import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class pengaduansiswa : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pengaduansiswa)

        // Allow content to extend behind system bars
        WindowCompat.setDecorFitsSystemWindows(window, false)

        // Adjust padding for system bars insets
        ViewCompat.setOnApplyWindowInsetsListener(findViewById<ConstraintLayout>(R.id.constraintLayout)) { view, insets ->
            val systemBarsInsets = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            view.setPadding(
                systemBarsInsets.left,
                systemBarsInsets.top,
                systemBarsInsets.right,
                systemBarsInsets.bottom
            )
            insets
        }

        setupListeners()
        setupRecyclerView()
    }

    private fun setupListeners() {
        findViewById<Button>(R.id.btnTambahPengaduan).setOnClickListener {
            Toast.makeText(this, "Tambah Pengaduan clicked!", Toast.LENGTH_SHORT).show()
        }

        findViewById<LinearLayout>(R.id.homeContainer).setOnClickListener {
            Toast.makeText(this, "Navigating to Home", Toast.LENGTH_SHORT).show()
        }

        findViewById<LinearLayout>(R.id.profileContainer).setOnClickListener {
            Toast.makeText(this, "Navigating to Profile", Toast.LENGTH_SHORT).show()
        }
    }

    private fun setupRecyclerView() {
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        val pengaduanList = listOf(
            Pengaduan("Pengaduan 1", "Diterima"),
            Pengaduan("Pengaduan 2", "Diproses"),
            Pengaduan("Pengaduan 3", "Ditolak"),
        )
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = PengaduanAdapter(pengaduanList)
    }
}
