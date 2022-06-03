package com.example.aeroapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Spinner

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



    }




    fun IniciarSesion(view: View) {
        val etNombre = findViewById<EditText>(R.id.etNombre)
        val usuario = etNombre.text.toString()
        val TextPassword = findViewById<EditText>(R.id.TextPassword)
        val pass = TextPassword.text.toString()

        if (usuario == "vanessa" && pass == "1234") {
            val intent = Intent(this, IniciarSesion::class.java).apply {}
            startActivity(intent)

        }
    }
    fun GuardarDatos(view: View) {
        val intent = Intent(this, AppCompatActivity::class.java).apply {}
        startActivity(intent)

    }

    fun Registro(view: View) {
        val intent = Intent(this, CrearCuenta::class.java).apply {}
        startActivity(intent)

    }
}