package com.example.Pratodos

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.activity_bolo_de_chocolate.*
import kotlinx.android.synthetic.main.activity_pao_de_queijo.*

class BoloDeChocolate : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bolo_de_chocolate)

        go_voltar_button.setOnClickListener {
            abrirCardapioReceitas()
        }
    }

    fun abrirCardapioReceitas() {
        val intent = Intent(
            this, CardapioReceitas::class.java
        )
        startActivity(intent)
    }
}