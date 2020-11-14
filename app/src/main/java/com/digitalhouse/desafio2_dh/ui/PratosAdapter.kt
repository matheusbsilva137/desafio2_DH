package com.digitalhouse.desafio2_dh.ui

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.digitalhouse.desafio2_dh.R
import kotlinx.android.synthetic.main.activity_restaurante.view.*
import kotlinx.android.synthetic.main.list_item_pratos.view.*

class PratosAdapter (private val listaPratos: ArrayList<Prato>): RecyclerView.Adapter<PratosAdapter.PratosViewHolder>() {

    class PratosViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        var view = itemView
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

        holder.view.setOnClickListener{
            var intent = Intent(it.context, PratoActivity::class.java)
            intent.putExtra("nomePrato", listaPratos[position].nome)
            intent.putExtra("descrPrato", listaPratos[position].descricao)
            intent.putExtra("img", listaPratos[position].img)
            it.context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int = listaPratos.size
}