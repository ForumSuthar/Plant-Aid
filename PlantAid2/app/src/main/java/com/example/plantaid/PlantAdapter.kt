package com.example.plantaid

import android.app.Activity
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class PlantAdapter(var plantlist:MutableList<Plants>, var activity: Activity) : BaseAdapter() {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

        val view: View = View.inflate(activity,R.layout.plant_list,null)


        val plant = view.findViewById<TextView>(R.id.textView) as TextView
        plant.text = plantlist.get(position).name


        return view
        //TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getItem(position: Int): Any {
        return plantlist.get(position)
        //TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getItemId(position: Int): Long {
        //TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        return position.toLong()
    }

    override fun getCount(): Int {
        return plantlist.size
        //TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}