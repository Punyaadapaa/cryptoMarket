package com.example.ppab_3 // Sesuaikan dengan nama package-mu!

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // dari XML koin
        val btnBtc = findViewById<LinearLayout>(R.id.btnBtc)
        val btnEth = findViewById<LinearLayout>(R.id.btnEth)
        val btnBnb = findViewById<LinearLayout>(R.id.btnBnb)
        val btnSol = findViewById<LinearLayout>(R.id.btnSol)
        val btnXrp = findViewById<LinearLayout>(R.id.btnXrp)
        val btnUsdt = findViewById<LinearLayout>(R.id.btnUsdt)
        val btnUsdc = findViewById<LinearLayout>(R.id.btnUsdc)
        val btnPaxg = findViewById<LinearLayout>(R.id.btnPaxg)
        val btnXaut = findViewById<LinearLayout>(R.id.btnXaut)

        val btnHarga = findViewById<Button>(R.id.btnHarga)
        val btnEmail = findViewById<Button>(R.id.btnEmail)

        btnBtc.setOnClickListener {
            bukaDetail("Bitcoin", "BTC", "Satoshi Nakamoto", "2009", "Cryptocurrency pertama di dunia yang menggunakan blockchain.", R.drawable.btc)
        }
        btnEth.setOnClickListener {
            bukaDetail("Ethereum", "ETH", "Vitalik Buterin", "2015", "Platform perangkat lunak untuk smart contract dan dApps.", R.drawable.eth)
        }
        btnBnb.setOnClickListener {
            bukaDetail("Binance Coin", "BNB", "Changpeng Zhao", "2017", "Koin resmi dari ekosistem Binance, bursa kripto terbesar.", R.drawable.bnb)
        }
        btnSol.setOnClickListener {
            bukaDetail("Solana", "SOL", "Anatoly Yakovenko", "2020", "Blockchain berkinerja tinggi yang dirancang untuk dApps cepat.", R.drawable.sol)
        }
        btnXrp.setOnClickListener {
            bukaDetail("Ripple", "XRP", "Chris Larsen", "2012", "Diciptakan untuk memfasilitasi transfer dana lintas batas yang murah.", R.drawable.xrp)
        }

        btnUsdt.setOnClickListener {
            bukaDetail("Tether", "USDT", "Brock Pierce, dkk", "2014", "Stablecoin yang nilainya dipatok 1:1 dengan mata uang Dolar Amerika Serikat (USD).", R.drawable.usdt)
        }
        btnUsdc.setOnClickListener {
            bukaDetail("USD Coin", "USDC", "Centre Consortium", "2018", "Stablecoin yang transparan dan didukung penuh oleh cadangan dolar AS dan surat utang jangka pendek.", R.drawable.usdc)
        }
        btnPaxg.setOnClickListener {
            bukaDetail("PAX Gold", "PAXG", "Charles Cascarilla", "2019", "Aset digital yang di-back up oleh satu troy ons emas fisik murni (London Good Delivery gold coin).", R.drawable.paxg)
        }
        btnXaut.setOnClickListener {
            bukaDetail("Tether Gold", "XAUT", "TG Commodities", "2020", "Stablecoin yang menawarkan kepemilikan emas fisik murni yang disimpan di brankas Swiss.", R.drawable.xaut)
        }

        btnHarga.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://coinmarketcap.com")
            startActivity(intent)
        }

        btnEmail.setOnClickListener {
            val intent = Intent(Intent.ACTION_SENDTO)
            intent.data = Uri.parse("mailto:testting@gmail.com")
            intent.putExtra(Intent.EXTRA_SUBJECT, "Feedback Tugas Praktikum PAB")
            startActivity(intent)
        }
    }

    private fun bukaDetail(nama: String, simbol: String, pendiri: String, tahun: String, deskripsi: String, gambar: Int) {
        val intent = Intent(this, SecondActivity::class.java)
        intent.putExtra("NAMA", nama)
        intent.putExtra("SIMBOL", simbol)
        intent.putExtra("PENDIRI", pendiri)
        intent.putExtra("TAHUN", tahun)
        intent.putExtra("DESKRIPSI", deskripsi)
        intent.putExtra("GAMBAR", gambar)
        startActivity(intent)
    }
}