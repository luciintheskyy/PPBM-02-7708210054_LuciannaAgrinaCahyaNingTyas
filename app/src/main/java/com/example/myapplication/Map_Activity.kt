package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class Map_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_map)

        val imgback_map = findViewById<ImageView>(R.id.imgback_Map)
        imgback_map.setOnClickListener{
            val Intent = Intent (this, Main_Activity::class.java)
            startActivity(Intent)}
    }
}