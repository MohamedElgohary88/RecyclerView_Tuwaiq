package com.example.recyclerview_tuwaiq

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CustomAdapter(val array:ArrayList<Person>):RecyclerView.Adapter<CustomAdapter.DataHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DataHolder {

       val dataHolder:DataHolder = DataHolder(LayoutInflater.from(parent.context)
           .inflate(R.layout.custom_layout,parent,false))

        return dataHolder
    }

    override fun onBindViewHolder(holder: DataHolder, position: Int) {
        val person:Person = array[position]
        holder.imageView.setImageResource(person.image)
        holder.textView.text = person.name
    }

    override fun getItemCount(): Int {
        return array.size
    }

    class DataHolder(view: View):RecyclerView.ViewHolder(view){
        val imageView:ImageView = view.findViewById(R.id.profile)
        val textView:TextView = view.findViewById(R.id.textView)


    }

}