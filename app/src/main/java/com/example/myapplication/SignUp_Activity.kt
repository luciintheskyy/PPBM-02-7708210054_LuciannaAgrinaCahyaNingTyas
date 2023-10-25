package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class SignUp_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        val imgnext_signup = findViewById<ImageView>(R.id.imgnext_signup)
        imgnext_signup.setOnClickListener{
            val Intent = Intent (this, Main_Activity::class.java)
            startActivity(Intent)}
    }
}