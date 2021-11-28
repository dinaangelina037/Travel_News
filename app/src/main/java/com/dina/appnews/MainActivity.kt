package com.dina.appnews

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.dina.appnews.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var rvWisata: RecyclerView
    private lateinit var list: ArrayList<Wisata>
    private lateinit var mainBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mainBinding.root)
        supportActionBar?.hide()

        list.addAll(WisataData.listData)
        showRecyclerView()

        rvWisata = findViewById(R.id.rv_wisata)
        rvWisata.setHasFixedSize(true)

    }
    private fun showRecyclerView() {
        rvWisata.layoutManager = LinearLayoutManager(this)
        val listWisataAdapter = ListWisataAdapter(list)
        rvWisata.adapter = listWisataAdapter
    }
}



