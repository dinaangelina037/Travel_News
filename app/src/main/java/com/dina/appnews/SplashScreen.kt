package com.dina.appnews

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import com.dina.appnews.databinding.ItemSpalshscreenBinding

class SplashScreen : AppCompatActivity(){
    private lateinit var spalshscreenBinding: ItemSpalshscreenBinding

    private val time : Long = 2500L

    override fun onCreate(savedInstanceState: Bundle?,) {
        super.onCreate(savedInstanceState,)
        spalshscreenBinding = ItemSpalshscreenBinding.inflate(layoutInflater)
        setContentView(spalshscreenBinding.root)

        supportActionBar?.hide()
        Handler(Looper.getMainLooper()).postDelayed(
            {
                val intent = Intent(this@SplashScreen, MainActivity::class.java)
                startActivity(intent)
                finish()
            },time
        )
    }


}