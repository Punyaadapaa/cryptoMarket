# 🪙 Crypto Market App

![Android](https://img.shields.io/badge/Android-3DDC84?style=for-the-badge&logo=android&logoColor=white)
![Kotlin](https://img.shields.io/badge/kotlin-%237F52FF.svg?style=for-the-badge&logo=kotlin&logoColor=white)

**Crypto Market** adalah aplikasi Android sederhana yang dirancang untuk menampilkan informasi dasar dari 9 *cryptocurrency* populer. Mulai dari aset kripto utama seperti Bitcoin (BTC) hingga aset berbasis komoditas fisik seperti PAX Gold (PAXG) dan Tether Gold (XAUT). 

Aplikasi ini merupakan tugas praktikum (Week 3 PAB) yang dibangun menggunakan **Kotlin** untuk mendemonstrasikan pemahaman dasar pengembangan Android.

---

## ✨ Fitur Utama

* **Daftar Kripto:** Menampilkan 9 koin kripto populer dalam antarmuka yang rapi.
* **Detail Koin:** Menampilkan informasi spesifik seperti Nama, Ticker, Nama Pendiri, Tahun Rilis, dan Deskripsi lengkap.
* **Navigasi Lancar:** Menggunakan *Explicit Intent* untuk perpindahan halaman dan pengiriman data.
* **Fitur Ekstra:** * Tautan langsung (*Implicit Intent*) ke CoinMarketCap untuk melihat harga *live*.
    * Tombol *Feedback* yang langsung mengarah ke aplikasi Email.
    * Fitur *Share* untuk membagikan detail koin ke aplikasi lain.

---

## 🔄 Cara Kerja Aplikasi

Aplikasi ini mengimplementasikan konsep dasar `Activity`, `Intent`, dan `View` di Android:

1.  **`MainActivity.kt` (Halaman Utama)**
    Berfungsi menampilkan daftar koin kripto. Setiap *item* koin dibungkus menggunakan komponen `LinearLayout` yang bertindak sebagai tombol interaktif (*clickable*). Ketika diklik, aplikasi akan mengumpulkan data koin (nama, ticker, deskripsi, dll) dan mengirimkannya ke halaman berikutnya menggunakan metode `Intent.putExtra()`.
    
2.  **`SecondActivity.kt` (Halaman Detail)**
    Berfungsi menerima data dari `MainActivity` melalui `intent.getStringExtra()` dan `intent.getIntExtra()`. Data yang diterima kemudian diikat (*binding*) dan ditampilkan pada komponen antarmuka seperti `ImageView` dan `TextView`.

---

## 📸 Cuplikan Layar (Screenshots)

<div align="center">
  <img width="300" alt="Screenshot Aplikasi" src="https://github.com/user-attachments/assets/90224426-c565-4eb8-9987-74f28fc7dbcf" />
  <p><i>Tampilan Halaman Utama Crypto Market</i></p>
</div>

---

## 🚀 Panduan Instalasi

Ikuti langkah-langkah berikut untuk menjalankan *project* ini di komputermu:

1. **Clone repositori ini** melalui terminal atau Git Bash:
   ```bash
   git clone [https://github.com/Punyaadapaa/cryptoMarket.git](https://github.com/Punyaadapaa/cryptoMarket.git)
   
## 👥 Kelompok 2
Anggota tim yang berkontribusi dalam pengembangan aplikasi ini:
1. **Daffa Arkhan Aditama** (L0324010)
2. **Muhammad Ihsaan Al Fikri** (L0324024)
3. **Rizal Arief Zuhdi** (L0324031)
