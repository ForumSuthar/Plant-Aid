package com.example.plantaid

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       // val myplants = findViewById<Button>(R.id.myPlants)
        //myplants?.setOnClickListener { onclickmyplants() }
        textView2.setOnTouchListener(object : OnSwipeListener(this) {
            init {
                setDragHorizontal(true)
                setExitScreenOnSwipe(true)
                setAnimationDelay(500)
            }

            override fun onSwipeLeft(distance: Float) {
                val intent = Intent(this@MainActivity, ListPlantActivity::class.java)
                // start your next activity
                startActivity(intent)
            }

            override fun onSwipeRight(distance: Float) {
                val intent = Intent(this@MainActivity, ListPlantActivity::class.java)
                // start your next activity
                startActivity(intent)

            }
        }
        )

    }






        private fun onclickmyplants(){
            val intent = Intent(this, ListPlantActivity::class.java)
            // start your next activity
            startActivity(intent)

        }





    }


