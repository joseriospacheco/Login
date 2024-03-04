package com.example.login

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class InicioActivity : AppCompatActivity() {


    private lateinit var txt:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inicio)

        txt=findViewById(R.id.txt)
        val datos = intent
        val datoRecibido = datos.getStringExtra("mensaje")

        if (datoRecibido != null) {
               txt.text = datoRecibido
        }


    }
}