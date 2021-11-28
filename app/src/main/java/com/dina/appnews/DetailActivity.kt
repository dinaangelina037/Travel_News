package com.dina.appnews

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.dina.appnews.databinding.ActivityDetailBinding



class DetailActivity : AppCompatActivity() {
    private lateinit var detailBinding: ActivityDetailBinding
    private lateinit var wisata: Wisata

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        detailBinding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_detail)
        showData()

        supportActionBar?.hide()
        var Wisata = intent.getParcelableExtra<Wisata>(WisataData.toString()) as Wisata
        Glide.with(this)
            .load(Wisata.photo)
            .into(detailBinding.tvProfilDetail)

        detailBinding.tvNameProfil.text = wisata.name
        detailBinding.tvEmailDetail.text = wisata.toString()
        detailBinding.tvFacebookDetail.text = wisata.toString()
        detailBinding.tvGoogleDetail.text = wisata.toString()
        detailBinding.tvNews.text = wisata.toString()
        detailBinding.tvHarga.text = wisata.toString()
        detailBinding.tvTujuan.text = wisata.toString()

    }

    private fun showData() {
        
    }


}