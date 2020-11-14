package com.digitalhouse.desafio2_dh.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.ActivityNavigator
import com.digitalhouse.desafio2_dh.R
import kotlinx.android.synthetic.main.activity_restaurante.*

class RestauranteActivity : AppCompatActivity() {
    lateinit var listPratos : ArrayList<Prato>
    lateinit var adapter : PratosAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_restaurante)

        listPratos = getAllPratos()
        adapter = PratosAdapter(listPratos)

        ivRestaurante.requestFocus()

        rvPratos.adapter = adapter
        var nomeRes : String = intent.extras?.getString("nomeRes").toString()
        var imgId : Int = intent.extras!!.getInt("img")
        tvNomeRes.text = nomeRes
        ivRestaurante.setImageResource(imgId)

        ivVoltar.setOnClickListener{
            finish()
        }
    }

    fun getAllPratos() = arrayListOf(
        Prato(resources.getIdentifier("image4", "drawable", packageName), "Salada com molho de Gengibre", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mauris tincidunt bibendum porta. Aenean mattis dolor erat, id tristique elit fringilla eu. Curabitur volutpat mi non quam vulputate, quis auctor massa efficitur."),
        Prato(resources.getIdentifier("image4", "drawable", packageName), "Salada com molho de Gengibre", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mauris tincidunt bibendum porta. Aenean mattis dolor erat, id tristique elit fringilla eu. Curabitur volutpat mi non quam vulputate, quis auctor massa efficitur."),
        Prato(resources.getIdentifier("image4", "drawable", packageName), "Salada com molho de Gengibre", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mauris tincidunt bibendum porta. Aenean mattis dolor erat, id tristique elit fringilla eu. Curabitur volutpat mi non quam vulputate, quis auctor massa efficitur."),
        Prato(resources.getIdentifier("image4", "drawable", packageName), "Salada com molho de Gengibre", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mauris tincidunt bibendum porta. Aenean mattis dolor erat, id tristique elit fringilla eu. Curabitur volutpat mi non quam vulputate, quis auctor massa efficitur."),
        Prato(resources.getIdentifier("image4", "drawable", packageName), "Salada com molho de Gengibre", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mauris tincidunt bibendum porta. Aenean mattis dolor erat, id tristique elit fringilla eu. Curabitur volutpat mi non quam vulputate, quis auctor massa efficitur."),
        Prato(resources.getIdentifier("image4", "drawable", packageName), "Salada com molho de Gengibre", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mauris tincidunt bibendum porta. Aenean mattis dolor erat, id tristique elit fringilla eu. Curabitur volutpat mi non quam vulputate, quis auctor massa efficitur."),
        Prato(resources.getIdentifier("image4", "drawable", packageName), "Salada com molho de Gengibre", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mauris tincidunt bibendum porta. Aenean mattis dolor erat, id tristique elit fringilla eu. Curabitur volutpat mi non quam vulputate, quis auctor massa efficitur."),
        Prato(resources.getIdentifier("image4", "drawable", packageName), "Salada com molho de Gengibre", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mauris tincidunt bibendum porta. Aenean mattis dolor erat, id tristique elit fringilla eu. Curabitur volutpat mi non quam vulputate, quis auctor massa efficitur."),
        Prato(resources.getIdentifier("image4", "drawable", packageName), "Salada com molho de Gengibre", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mauris tincidunt bibendum porta. Aenean mattis dolor erat, id tristique elit fringilla eu. Curabitur volutpat mi non quam vulputate, quis auctor massa efficitur."),
        Prato(resources.getIdentifier("image4", "drawable", packageName), "Salada com molho de Gengibre", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mauris tincidunt bibendum porta. Aenean mattis dolor erat, id tristique elit fringilla eu. Curabitur volutpat mi non quam vulputate, quis auctor massa efficitur."),
        Prato(resources.getIdentifier("image4", "drawable", packageName), "Salada com molho de Gengibre", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mauris tincidunt bibendum porta. Aenean mattis dolor erat, id tristique elit fringilla eu. Curabitur volutpat mi non quam vulputate, quis auctor massa efficitur."),
        Prato(resources.getIdentifier("image4", "drawable", packageName), "Salada com molho de Gengibre", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mauris tincidunt bibendum porta. Aenean mattis dolor erat, id tristique elit fringilla eu. Curabitur volutpat mi non quam vulputate, quis auctor massa efficitur.")
    )
}