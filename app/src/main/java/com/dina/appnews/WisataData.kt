package com.dina.appnews

import android.widget.TextView
import com.dina.appnews.WisataData.wisata as wisata

object WisataData {

    private val wisata = arrayOf(
        "Tangkuban Perahu",
        "FramHouse",
        "Kebun Strawberry",
        "TransStudio",
        "Kampung Gajah",
        "Ciwidey",
        "Rancaupas",
    )
    val wisataDeskripsi = arrayOf(
        "Tangkuban perahu salah satu gunung yang terletak di Provinsi Jawa Barat,Indonesia",
        "FramHouse merupakan wahana wisata baru di daerah Lembang",
        "Kebun Strawberry merupakan salah satu fasilitas yang disediakan oleh Emte Highland Resort. Namun, kamu nggak perlu menginap di sana untuk bisa bermain di Kebun Stroberi Ciwidey, karena objek wisata ini memang dibuka untuk umum.",
        "Trans Studio merupakan jaringan taman bermain di dalam ruangan terbesar di Indonesia yang dikelola oleh CT Corp",
        "Kampung Gajah di Jawa Barat adalah tempat wisata yang ditinggalkan. Dulu mungkin banyak tawa suka cita di sana, tapi kini suasana sudah sunyi senyap.",
        "Ciwidey  desa yang terletak di kawasan Bandung Selatan. Pilihan destinasi Wisata Ciwidey sangatlah lengkap, mulai dari wisata alam perbukitan hingga wisata taman dan perkebunan untuk keluarga ada di sini.",
        "Rancaupas tau Kampung Cai Ranca Upas adalah salah satu bumi perkemahan di Bandung, Jawa Barat, Indonesia. Terletak di Jalan Raya Ciwidey Patenggang KM. 11, Alam Endah, Ciwidey Kabupaten Bandung, dengan jarak sekitar 50 km dari pusat Kota Bandung.",
    )
    val wisataPhoto = intArrayOf(
        R.drawable.tangkuban,
        R.drawable.framhouse,
        R.drawable.strawberry,
        R.drawable.studio,
        R.drawable.kampung,
        R.drawable.ciwidey,
        R.drawable.rancaupas,
    )
    val listData: ArrayList<Wisata>
    get(): ArrayList<Wisata>{
        var list = arrayListOf<Wisata>()
        var wisataName = arrayListOf<Wisata>()
        for (position in wisata.indices){

            var wisata = Wisata()
            wisata.name = wisataName[position].toString()
            wisata.deskripsi = wisataDeskripsi[position].toString()
            wisata.photo = wisataPhoto[position]

            list.add(wisata)
        }
        return list
    }

}