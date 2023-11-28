package com.example.customlistview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listView = findViewById<ListView>(R.id.listView)

        var pokemon = ArrayList<Model>()

        pokemon.add(Model("Eevee", "Normal", R.drawable.eevee))
        pokemon.add(Model("Vaporeon", "Water", R.drawable.vaporeon))
        pokemon.add(Model("Jolteon", "Electric", R.drawable.jolteon))
        pokemon.add(Model("Flareon", "Fire", R.drawable.flareon))
        pokemon.add(Model("Espeon", "Psychic", R.drawable.espeon))
        pokemon.add(Model("Umbreon", "Dark", R.drawable.umbreon))
        pokemon.add(Model("Leafeon", "Grass", R.drawable.leafeon))
        pokemon.add(Model("Glaceon", "Ice", R.drawable.glaceon))
        pokemon.add(Model("Sylveon", "Fairy", R.drawable.sylveon))

        listView.adapter = CustomAdapter(this, R.layout.custom_listview, pokemon)
    }
}