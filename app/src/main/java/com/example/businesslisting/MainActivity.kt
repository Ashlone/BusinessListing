  package com.example.businesslisting


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView


import androidx.recyclerview.widget.RecyclerView


  class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(R.style.Theme_BusinessListing)
        setContentView(R.layout.activity_main)

        //Clicking to profile Account
          val profileAccount = findViewById<ImageView>(R.id.profileaccount)


          profileAccount.setOnClickListener{
              val intent= Intent(this,ProfileAccount::class.java)
              startActivity(intent)
          }


        // Initialize data
        val myDataset = ItemDataSource().loadBrands()
       /** val shareSecondaryText=  findViewById<ImageView>(R.id.shareText)
        val supportText=findViewById<TextView>(R.id.supporting_text)


        val supportingText=intent.getParcelableExtra<ItemDataModel>("card_supporting_text")
        //add supporting text to text view
        supportText.text= supportingText?.card_supporting_text.toString()



        shareSecondaryText.setOnClickListener {
            if (supportingText != null) {
                this.shareText(supportingText)
            }
        }*/




        val recyclerView = findViewById<RecyclerView>(R.id.recyclerview)
        recyclerView.adapter = ItemAdapter(this, myDataset)


        // in content do not change the layout size of the RecyclerView
        recyclerView.setHasFixedSize(true)


    }
      /*fun shareText(supportingText:ItemDataModel){
          val sendIntent:Intent=Intent().apply {
              action=Intent.ACTION_SEND
              putExtra(Intent.EXTRA_TEXT,supportingText.card_supporting_text)
              type="text/plain"
          }
          val shareIntent=Intent.createChooser(sendIntent,null)
          startActivity(shareIntent)
      }*/
}