package com.example.aeroapp

import android.app.DatePickerDialog
import android.app.Dialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Spinner
import java.util.*

class Vuelos1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vuelos1)


        val spinner: Spinner = findViewById(R.id.spinner1)
// Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter.createFromResource(
            this,
            R.array.spiner1,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            // Specify the layout to use when the list of choices appears
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            // Apply the adapter to the spinner
            spinner.adapter = adapter


            val spinner: Spinner = findViewById(R.id.spinner2)
            ArrayAdapter.createFromResource(
                this,
                R.array.spiner2,
                android.R.layout.simple_spinner_item
            ).also { adapter ->
                // Specify the layout to use when the list of choices appears
                adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
                // Apply the adapter to the spinner
                spinner.adapter = adapter

                val spinner: Spinner = findViewById(R.id.spinner3)
                ArrayAdapter.createFromResource(
                    this,
                    R.array.spiner3,
                    android.R.layout.simple_spinner_item
                ).also { adapter ->
                    // Specify the layout to use when the list of choices appears
                    adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
                    // Apply the adapter to the spinner
                    spinner.adapter = adapter

                    val spinner: Spinner = findViewById(R.id.spinner4)
                    ArrayAdapter.createFromResource(
                        this,
                        R.array.spiner4,
                        android.R.layout.simple_spinner_item
                    ).also { adapter ->
                        // Specify the layout to use when the list of choices appears
                        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
                        // Apply the adapter to the spinner
                        spinner.adapter = adapter
                    }
                }
            }
        }
    }

    fun ComprarBoletos(view: View) {
        val intent = Intent(this, Vuelos::class.java).apply {}
        startActivity(intent)

    }



}