package com.happiestminds.animalapp

import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView


class AnimalAdapter(
    private val values: List<Animal>
) : RecyclerView.Adapter<AnimalAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        return ViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.fragment_item,parent,false)
            )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val animal = values[position]
        holder.idView.text = animal.name

        when(animal.name.lowercase()){
            "dog"-> holder.imgView.setImageResource(R.drawable.dog)
            "cat"-> holder.imgView.setImageResource(R.drawable.cat)
            "sheep"-> holder.imgView.setImageResource(R.drawable.sheep)
            "goat"-> holder.imgView.setImageResource(R.drawable.goat)
            "cow"-> holder.imgView.setImageResource(R.drawable.cow)
            "rabbit"-> holder.imgView.setImageResource(R.drawable.rabbit)
        }

        when(animal.name.lowercase()){
            "lion"-> holder.imgView.setImageResource(R.drawable.lion)
            "tiger"-> holder.imgView.setImageResource(R.drawable.tiger)
            "deer"-> holder.imgView.setImageResource(R.drawable.deer)
            "cheetah"-> holder.imgView.setImageResource(R.drawable.cheetah)
            "zebra"-> holder.imgView.setImageResource(R.drawable.zebra)
            "giraffe"-> holder.imgView.setImageResource(R.drawable.giraffe)
        }
    }

    override fun getItemCount(): Int = values.size

    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val idView: TextView = view.findViewById(R.id.item_number)
        val imgView : ImageView = view.findViewById(R.id.imgView)
    }
}