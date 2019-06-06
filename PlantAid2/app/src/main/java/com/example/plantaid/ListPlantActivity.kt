package com.example.plantaid

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.AdapterView
import android.widget.AdapterView.OnItemClickListener
import android.widget.ListView



class ListPlantActivity : AppCompatActivity() {

    var plantlist: MutableList<Plants> = mutableListOf<Plants>()
    var list_plant: ListView? = null
    var adapter: PlantAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_plant)

        list_plant = findViewById<ListView>(R.id.myListView) as ListView
        addplants()
        var adapter = PlantAdapter(plantlist, this)
        list_plant?.adapter = adapter

        list_plant!!.onItemClickListener = object : OnItemClickListener {
            override fun onItemClick(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                val item = plantlist.get(position)
                val intent = Intent(this@ListPlantActivity, CreatePlantActivity::class.java)
                intent.putExtra("name",item.name)
                intent.putExtra("water",item.water.toString())
                intent.putExtra("last_water",item.last_watered.toString())
                //based on item add info to intent
                startActivity(intent)
                //TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }

        }
    }


     private fun addplants(){

         var items = resources.getStringArray(R.array.plants)
        var plant1 = Plants()
        plant1.name = items.get(0)
        plant1.water = 3
         plant1.last_watered = 3
        plantlist.add(plant1)

        var plant2 = Plants()
        plant2.name = items.get(1)
        plant2.water = 1
         plant2.last_watered = 1
        plantlist.add(plant2)

        var plant3 = Plants()
        plant3.name = items.get(2)
        plant3.water = 7
         plant3.last_watered = 7
        plantlist.add(plant3)


    }
}

