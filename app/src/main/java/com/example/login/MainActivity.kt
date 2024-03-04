package com.example.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {


    private lateinit var btnRegistrar:Button
    private lateinit var btnIniciarSesion:Button
    private lateinit var txtRestablecerClave:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        btnRegistrar = findViewById(R.id.btn_registrar)
        btnIniciarSesion= findViewById(R.id.btn_iniciar_sesion)
        txtRestablecerClave= findViewById(R.id.txt_restablecer_clave)

        btnRegistrar.setOnClickListener {

            var i = Intent(this,RegistroActivity::class.java)
            i.putExtra("mensaje", "Registro");
            startActivity(i)

        }

        btnIniciarSesion.setOnClickListener {

            var i =  Intent(this,InicioActivity::class.java)
            i.putExtra("mensaje", "Página de Inicio");
            startActivity(i);

        }

        txtRestablecerClave.setOnClickListener {


            var i = Intent(this,RestablcerClaveActivity::class.java)
            i.putExtra("mensaje", "Restablecer clave");
            startActivity(i);
        }
    }
}