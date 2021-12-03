package com.edu.udistrital.trav.list

import android.support.v7.widget.RecyclerView
import android.support.v7.widget.RecyclerView.Adapter
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.edu.udistrital.trav.R
import com.edu.udistrital.trav.model.PlaceItem
import com.squareup.picasso.Picasso

class PlaceAdapter (private val placeList:ArrayList<PlaceItem>,private val onItemClicked:(PlaceItem)->Unit): Adapter<PlaceAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
    val view = LayoutInflater.from(parent.context).inflate(R.layout.card_view_place_item, parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
         val ciudad = placeList[position]
        holder.itemView.setOnClickListener{
            onItemClicked(placeList[position])
        }
         holder.bind(ciudad)
    }

    override fun getItemCount(): Int = placeList.size



    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        private var nameTextView: TextView = itemView.findViewById(R.id.nametextview)
        private var  descriptionTextView: TextView = itemView.findViewById(R.id.description_text_view)
        private var  rankingTextView: TextView = itemView.findViewById(R.id.ranking_text_view)
        private var  imageViewActivity: ImageView = itemView.findViewById(R.id.imageviewcity)

        fun bind(place: PlaceItem){
            nameTextView.text = place.nombre
            descriptionTextView.text = place.descripcion
            rankingTextView.text = place.calificacion
            Picasso.get().load(place.urlfoto).into(imageViewActivity);

        }

    }
}