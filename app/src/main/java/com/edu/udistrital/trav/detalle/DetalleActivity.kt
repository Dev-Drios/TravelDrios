package com.edu.udistrital.trav.detalle

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

import com.edu.udistrital.trav.databinding.ActivityDetalleBinding
import com.edu.udistrital.trav.model.Place
import com.edu.udistrital.trav.model.PlaceItem
import com.squareup.picasso.Picasso
import java.io.Serializable

class DetalleActivity : AppCompatActivity() {
    private lateinit var detalleBinding: ActivityDetalleBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        detalleBinding = ActivityDetalleBinding.inflate(layoutInflater)
        setContentView(detalleBinding.root)
        val place: PlaceItem = intent.extras?.getSerializable("Place") as PlaceItem
        with(detalleBinding){
            nombreView.text = place.nombre
            Picasso.get().load(place.urlfoto).into(pictureView);
            caliTextView.text = place.calificacion
            rankingTextView.text = place.rank.toString()
            comentTextView.text = place.comentario
            descriptionTextView.text = place.descripcion
        }

    }
}