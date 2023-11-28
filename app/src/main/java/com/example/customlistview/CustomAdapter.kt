package com.example.customlistview

import android.content.Context
import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import androidx.lifecycle.findViewTreeViewModelStoreOwner

class CustomAdapter(var ctx: Context,
                    var ourResource: Int,
                    var items: ArrayList<Model>): ArrayAdapter<Model>(ctx, ourResource, items) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val layoutInflater = LayoutInflater.from(ctx)
        val view = layoutInflater.inflate(ourResource, null)

        val textName = view.findViewById<TextView>(R.id.textName)
        val textTypes = view.findViewById<TextView>(R.id.textTypes)
        val imagePokemon = view.findViewById<ImageView>(R.id.imagePokemon)

        textName.text = items[position].name
        textTypes.text = items[position].types
        imagePokemon.setImageDrawable(ctx.resources.getDrawable(items[position].pokemon))

        return view
    }
}