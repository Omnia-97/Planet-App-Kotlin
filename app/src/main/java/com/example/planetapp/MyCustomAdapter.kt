package com.example.planetapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.SimpleAdapter
import android.widget.TextView
import android.widget.Toast
import org.w3c.dom.Text

class MyCustomAdapter(val context : Context , val planets : List<Planet> )  : BaseAdapter (){
    override fun getCount(): Int {
      return  planets.size
    }

    override fun getItem(position: Int): Any {
       return planets[position]
    }

    override fun getItemId(position: Int): Long {
     return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val view : View
        if (convertView == null){
            view = inflater.inflate(R.layout.planet_item , parent , false)
        }else{
            view = convertView
        }
        val item = getItem(position) as Planet
        val titleTextView = view.findViewById<TextView>(R.id.planetName)
        val moonCountTextView = view.findViewById<TextView>(R.id.moonsName)
        val moonImage = view.findViewById<ImageView>(R.id.planetImage)
       titleTextView.text = item.title
        moonCountTextView.text = item.moonCount
        moonImage.setImageResource(item.imagePlanet)
        view.setOnClickListener{
            Toast.makeText(context , "You clicked in ${planets[position].title}" , Toast.LENGTH_SHORT).show()
        }
        return view
     }
}