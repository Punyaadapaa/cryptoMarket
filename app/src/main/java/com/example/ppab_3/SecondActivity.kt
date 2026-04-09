package com.example.ppab_3 // Sesuaikan dengan nama package-mu

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val nama = intent.getStringExtra("NAMA")
        val simbol = intent.getStringExtra("SIMBOL")
        val pendiri = intent.getStringExtra("PENDIRI")
        val tahun = intent.getStringExtra("TAHUN")
        val deskripsi = intent.getStringExtra("DESKRIPSI")
        val gambar = intent.getIntExtra("GAMBAR", 0)

        val imgDetail = findViewById<ImageView>(R.id.imgDetail)
        val tvNama = findViewById<TextView>(R.id.tvNama)
        val tvSimbol = findViewById<TextView>(R.id.tvSimbol)
        val tvPendiri = findViewById<TextView>(R.id.tvPendiri)
        val tvTahun = findViewById<TextView>(R.id.tvTahun)
        val tvDeskripsi = findViewById<TextView>(R.id.tvDeskripsi)
        val btnShare = findViewById<Button>(R.id.btnShare)

        imgDetail.setImageResource(gambar)
        tvNama.text = nama
        tvSimbol.text = "Ticker: $simbol"
        tvPendiri.text = "Pendiri: $pendiri"
        tvTahun.text = "Tahun Rilis: $tahun"
        tvDeskripsi.text = deskripsi

        btnShare.setOnClickListener {
            val pesan = "Cek info kripto ini: $nama ($simbol)\nDibuat oleh: $pendiri tahun $tahun.\n\n$deskripsi"
            val shareIntent = Intent(Intent.ACTION_SEND)
            shareIntent.type = "text/plain"
            shareIntent.putExtra(Intent.EXTRA_TEXT, pesan)
            startActivity(Intent.createChooser(shareIntent, "Bagikan via:"))
        }
    }
}