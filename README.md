# week 3 PAB
🪙 Deskripsi Aplikasi Crypto Market
Aplikasi Crypto Market adalah aplikasi Android sederhana yang dirancang untuk menampilkan informasi dasar dari 9 cryptocurrency populer, mulai dari Bitcoin hingga aset berbasis emas seperti PAX Gold dan Tether Gold. Aplikasi ini dibangun menggunakan Kotlin dan memanfaatkan konsep dasar pengembangan Android seperti Activity, Intent, dan View.

🔄 Cara Kerja

MainActivity berfungsi sebagai halaman utama yang menampilkan daftar seluruh koin kripto dalam bentuk list. Setiap item koin dibuat menggunakan komponen LinearLayout yang bertindak sebagai tombol. Ketika pengguna menekan salah satu koin, aplikasi akan mengumpulkan data seperti nama, ticker, pendiri, tahun rilis, deskripsi, dan resource gambar, lalu mengirimkannya ke halaman berikutnya menggunakan Intent beserta putExtra.

SecondActivity berfungsi sebagai halaman detail yang menerima data dari MainActivity melalui intent.getStringExtra dan intent.getIntExtra. Data tersebut kemudian ditampilkan ke masing-masing komponen View seperti ImageView untuk ikon koin, dan beberapa TextView untuk informasi teks seperti nama, ticker, pendiri, tahun rilis, serta deskripsi lengkap koin.

📸 Cuplikan

<img width="386" height="749" alt="Screenshot 2026-04-10 080859" src="https://github.com/user-attachments/assets/90224426-c565-4eb8-9987-74f28fc7dbcf" />

📝 Instalasi
Clone repositori ini:

```
https://github.com/Punyaadapaa/cryptoMarket.git
```
Buka proyek di Android Studio.

Tunggu proses Gradle Sync selesai.
