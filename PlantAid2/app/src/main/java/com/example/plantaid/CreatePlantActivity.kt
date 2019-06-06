package com.example.plantaid

import android.content.Intent
import android.graphics.Bitmap
import android.os.Bundle
import android.provider.MediaStore
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import kotlinx.android.synthetic.main.activity_create_plant.*


class CreatePlantActivity : AppCompatActivity() {

        var PICK_PHOTO: Int = 123;


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_plant)

        var name = intent.getStringExtra("name")
        var water = intent.getStringExtra("water")
        var last_water = intent.getStringExtra("last_water")

        editText3.setText("Every "+ water.toString()+" days")
        edittextView.setText(name)
        editText4.setText(last_water+" days ago")
        val editImg = findViewById<Button>(R.id.editImg)
        editImg?.setOnClickListener { editImage() }

        val waterNow = findViewById<Button>(R.id.waterNow)
        waterNow?.setOnClickListener { waterNow() }


}

    private fun editImage(){
        val i = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
        startActivityForResult(i, 123)
    }

    private fun waterNow(){
        editText4.setText("Today")
    }
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == 123){
            var bmp = data?.extras?.get("data") as Bitmap
            imageView.setImageBitmap(bmp)
        }

    }




}



