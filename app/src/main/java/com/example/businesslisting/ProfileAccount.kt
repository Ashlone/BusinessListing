package com.example.businesslisting

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class ProfileAccount : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(R.style.Theme_BusinessListing)
        setContentView(R.layout.activity_profile_account)

        val shareButton= findViewById<Button>(R.id.shareProfile)
        val takePictureButton= findViewById<Button>(R.id.takeImage)
        //val sharedContent=findViewById<TextView>(R.id.profileemail)

        takePictureButton.setOnClickListener{
            val intent= Intent(this,TakePicture ::class.java)
            startActivity(intent)
        }
        shareButton.setOnClickListener{
            val sendIntent:Intent= Intent().apply{
                action=Intent.ACTION_SEND
                putExtra(Intent.EXTRA_TEXT, "My name is Ashlone Chibvuri ")
                type="text/plain"
        }
            val sharedIntent=Intent.createChooser(sendIntent,null)
            startActivity(sharedIntent)
        }//end of
    }
}

