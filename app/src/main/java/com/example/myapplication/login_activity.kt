package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class login_activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val imageView2 = findViewById<ImageView>(R.id.imageView2)
        imageView2.setOnClickListener{
            val Intent = Intent (this, Main_Activity::class.java)
            startActivity(Intent)}

        val txtReg = findViewById<TextView>(R.id.txtreg)
        txtReg.setOnClickListener{
            val Intent = Intent (this, SignUp_Activity::class.java)
            startActivity(Intent)}
    }
}