package com.digitalhouse.desafio2_dh.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.digitalhouse.desafio2_dh.R

class PratosAdapter (private val listaPratos: ArrayList<Prato>): RecyclerView.Adapter<PratosAdapter.PratosViewHolder>() {

    class PratosViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        var tvNomePratoRes : TextView = itemView.findViewById(R.id.tvNomePratoRes)
        var ivPratoRes : ImageView = itemView.findViewById(R.id.ivPratoRes)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PratosViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.list_item_pratos, parent, false)
        return PratosViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: PratosViewHolder, position: Int) {
        var prato : Prato = listaPratos[position]
        holder.tvNomePratoRes.text = prato.nome
        holder.ivPratoRes.setImageResource(prato.img)
    }

    override fun getItemCount(): Int = listaPratos.size
}