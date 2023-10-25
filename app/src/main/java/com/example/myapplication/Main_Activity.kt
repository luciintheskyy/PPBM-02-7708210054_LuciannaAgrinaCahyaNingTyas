package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class Main_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val  img_Map = findViewById<ImageView>(R.id.img_Map)
        img_Map.setOnClickListener{
            val Intent = Intent (this, RateApp_Activity::class.java)
            startActivity(Intent)}

        val img_other = findViewById<ImageView>(R.id.img_other)
        img_other.setOnClickListener{
            val Intent = Intent (this, RateApp_Activity::class.java)
            startActivity(Intent)
        }
    }
}