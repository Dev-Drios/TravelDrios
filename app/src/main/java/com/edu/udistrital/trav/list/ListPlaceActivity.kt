package com.edu.udistrital.trav.list

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.util.Log
import com.edu.udistrital.trav.R
import com.edu.udistrital.trav.detalle.DetalleActivity
import com.edu.udistrital.trav.model.Place
import com.edu.udistrital.trav.model.PlaceItem
import com.google.gson.Gson

class ListPlaceActivity : AppCompatActivity() {
    private lateinit  var listPlace: ArrayList<PlaceItem>
    private lateinit var placeAdapter: PlaceAdapter
    private lateinit var placeRecyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_place)

        placeRecyclerView = findViewById(R.id.ciudad_recycler_view)
        //listPlace = createMockPlace()
        listPlace  = loadMockPlaceFromJson()
        placeAdapter = PlaceAdapter(listPlace, onItemClicked = {onPlaceClicked(it)})

       // placeRecyclerView.addItemDecoration(DividerItemDecoration(this,DividerItemDecoration.VERTICAL))

           placeRecyclerView.apply {
                    layoutManager = LinearLayoutManager(context)
                    adapter = placeAdapter
                    setHasFixedSize(false)
           }
        placeRecyclerView.adapter = placeAdapter
    }

    private fun onPlaceClicked(place: PlaceItem) {
        Log.d("alias",place.nombre)
        val intent = Intent(this,DetalleActivity::class.java)
        intent.putExtra("Place",place)
        startActivity(intent)
    }

    private fun loadMockPlaceFromJson(): ArrayList<PlaceItem> {
        var ciudadString: String = applicationContext.assets.open("ciudades.json").bufferedReader().use { it.readText() }
        val gson = Gson()
        val data = gson.fromJson(ciudadString, Place::class.java)
        return data
    }


}