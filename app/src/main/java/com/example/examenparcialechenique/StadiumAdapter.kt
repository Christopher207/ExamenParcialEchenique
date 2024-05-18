package com.example.examenparcialechenique

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class StadiumAdapter(private var lstStadium: List<StadiumModel>):
    RecyclerView.Adapter<StadiumAdapter.ViewHolder>(){
    class ViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        val ivStadium: ImageView = itemView.findViewById(R.id.ivStadium)
        val tvStadium: TextView = itemView.findViewById(R.id.tvStadium)
        val tvCity: TextView = itemView.findViewById(R.id.tvCity)
        val tvCapacity: TextView = itemView.findViewById(R.id.tvCapacity)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return ViewHolder(layoutInflater.inflate(R.layout.stadium_model,parent,false))
    }

    override fun getItemCount(): Int {
        return lstStadium.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val itemStadium = lstStadium[position]
        holder.tvStadium.text = itemStadium.stadium
        holder.tvCity.text = itemStadium.city
        holder.tvCapacity.text = itemStadium.capacity
        holder.ivStadium.setImageResource(itemStadium.image)
    }
}