package com.digitalhouse.desafio2_dh.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.digitalhouse.desafio2_dh.R
import com.digitalhouse.desafio2_dh.domain.Restaurante
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var listRestaurantes : ArrayList<Restaurante>
    lateinit var adapter : RestaurantesAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        listRestaurantes = getAllRestaurantes()
        adapter = RestaurantesAdapter(listRestaurantes)

        rvRestaurantes.adapter = adapter
        rvRestaurantes.layoutManager = LinearLayoutManager(this)
        rvRestaurantes.setHasFixedSize(true)
    }

    //Retorna uma lista de Restaurantes fixa
    fun getAllRestaurantes() = arrayListOf(
        Restaurante(resources.getIdentifier("image1", "drawable", packageName), "Tony Roma's", "Av. Lavandisca, 717 - Indianápolis, São Paulo", "22:00"),
        Restaurante(resources.getIdentifier("image4", "drawable", packageName), "Aoyama - Moema", "Alameda dos Arapanés, 532 - Moema", "00:00"),
        Restaurante(resources.getIdentifier("image5", "drawable", packageName), "Outback - Moema", "Av. Moaci, 187 - Moema, São Paulo", "00:00"),
        Restaurante(resources.getIdentifier("image3", "drawable", packageName), "Sí Señor!", "Alameda Jauaperi, 626 - Moema", "01:00"))
}