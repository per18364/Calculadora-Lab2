package com.example.calculadora

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnInicio: Button = findViewById(R.id.btnInicio)

        btnInicio.setOnClickListener{
            Log.e("LOG", "onClick")
            val intent = Intent(this, MainActivity2::class.java)
            intent.putExtra("valueA", "Valor")

            startActivity(intent)
        }
    }
}