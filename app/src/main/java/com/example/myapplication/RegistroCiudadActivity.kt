package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText

class RegistroCiudadActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro_ciudad)

        val registrarButton: Button = findViewById(R.id.registrar_button)
        val nombreEditText: EditText = findViewById(R.id. nombre_edit_text)
        val infoTextView: TextView = findViewById(R.id.infotextView2)
        val estaturaEditText: TextInputEditText = findViewById(R.id.Estatura_editText)

        registrarButton.setOnClickListener {
            val nombre : String = nombreEditText.text.toString()
            val estatura :Float = estaturaEditText.text.toString().toFloat()
            infoTextView.text = "nombre: " + nombre + ", estatura: " + estatura
        }

    }
}