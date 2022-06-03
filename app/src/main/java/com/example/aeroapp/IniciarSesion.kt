package com.example.aeroapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.EditText
import android.widget.Spinner

class IniciarSesion : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_iniciar_sesion)
    }

    fun MostrarPasaporte(view: View){
        val intent = Intent(this, Pasaporte::class.java).apply {}
        startActivity(intent)
    }
    fun MostrarVuelos(view: View) {
        val intent = Intent(this, Vuelos1::class.java).apply {}
        startActivity(intent)

    }
    fun MostrarNot(view: View) {
        val intent = Intent(this, Notificaciones::class.java).apply {}
        startActivity(intent)

    }
}