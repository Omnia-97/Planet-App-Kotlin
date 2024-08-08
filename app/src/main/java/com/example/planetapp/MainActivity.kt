package com.example.planetapp

import android.os.Bundle
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listView : ListView = findViewById(R.id.listView)

        val planet1 = Planet("Mercury",  "0 moon", R.drawable.mercury,)
        val planet2 = Planet("Venus", "0 moon" , R.drawable.venus)
        val planet3 = Planet("Earth",  "1 moon", R.drawable.earth)
        val planet4 = Planet("Mars", "2 moon",  R.drawable.mars)
        val planet5 = Planet("Jupiter", "67 moon",  R.drawable.jupiter)
        val planet6 = Planet("Saturn" ,"62 moon",  R.drawable.saturn)
        val planet7 = Planet("Uranus", "27 moon",  R.drawable.uranus)
        val planet8 = Planet("Neptune",  "14 moon" , R.drawable.neptune)
        val planetList = ArrayList<Planet>()
        planetList.add(planet1)
        planetList.add(planet2)
        planetList.add(planet3)
        planetList.add(planet4)
        planetList.add(planet5)
        planetList.add(planet6)
        planetList.add(planet7)
        planetList.add(planet8)
        val adapter = MyCustomAdapter(this, planetList)
        listView.adapter = adapter

    }
}