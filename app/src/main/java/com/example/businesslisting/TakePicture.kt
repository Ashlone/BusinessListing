package com.example.businesslisting

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class TakePicture : AppCompatActivity() {
    private  val REQUEST_CODE=100
    private lateinit var imageview:ImageView
    override fun onCreate(savedInstanceState: Bundle?)  {
        setTheme(R.style.Theme_BusinessListing)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_take_picture)




    }
}