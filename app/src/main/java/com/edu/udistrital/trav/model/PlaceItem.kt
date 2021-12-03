package com.edu.udistrital.trav.model
import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class PlaceItem(
    @SerializedName("calificacion")
    val calificacion: String,
    @SerializedName("comentario")
    val comentario: String,
    @SerializedName("descripcion")
    val descripcion: String,
    @SerializedName("nombre")
    val nombre: String,
    @SerializedName("Rank")
    val rank: Int,
    @SerializedName("urlfoto")
    val urlfoto: String
):Serializable