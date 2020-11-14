package com.digitalhouse.desafio2_dh.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.digitalhouse.desafio2_dh.R

class RestaurantesAdapter (private val listaRestaurantes: ArrayList<Restaurante>): RecyclerView.Adapter<RestaurantesAdapter.RestaurantesViewHolder>() {

    class RestaurantesViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        var tvNomeRes : TextView = itemView.findViewById(R.id.tvNomeRes)
        var tvEndRes : TextView = itemView.findViewById(R.id.tvEndRes)
        var tvHorFechRes : TextView = itemView.findViewById(R.id.tvHorFechRes)
        var ivRes : ImageView = itemView.findViewById(R.id.ivRes)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RestaurantesViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.list_item_restaurant, parent, false)
        return RestaurantesViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: RestaurantesViewHolder, position: Int) {
        var rest : Restaurante = listaRestaurantes[position]
        holder.tvNomeRes.text = rest.nome
        holder.tvEndRes.text = rest.endereco
        holder.tvHorFechRes.text = "Fecha às ${rest.horarioFechamento}"
        holder.ivRes.setImageResource(rest.img)
    }

    override fun getItemCount(): Int = listaRestaurantes.size
}