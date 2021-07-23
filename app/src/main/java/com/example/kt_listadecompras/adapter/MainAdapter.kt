package com.example.kt_listadecompras.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.kt_listadecompras.ItemDeProduto
import com.example.kt_listadecompras.R

class MainAdapter(private val itensList : ArrayList<ItemDeProduto>) :
    RecyclerView.Adapter<MainAdapter.MyViweHolder>(){

    inner class MyViweHolder(itemView : View) : RecyclerView.ViewHolder(itemView){

        private val tvItem : TextView = itemView.findViewById(R.id.tvItem)
        private val tvDescricao : TextView = itemView.findViewById(R.id.tvDescricao)
//        private val tvDate : TextView = itemView.findViewById(R.id.tvDate)
//        private val ivMenuMore : TextView = itemView.findViewById(R.id.ivMenuMore)

        fun bind(itemDeProduto: ItemDeProduto){
            with(itemView){
                tvItem.text = itemDeProduto.nome
                tvDescricao.text = itemDeProduto.descricao
            }


        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViweHolder {

        val layoutInflater = LayoutInflater.from(parent.context)

        val view = layoutInflater.inflate(R.layout.list_item, parent, false)

        return MyViweHolder(view)
    }

    override fun onBindViewHolder(holder: MyViweHolder, position: Int) {
        holder.bind(itensList[position])
    }

    override fun getItemCount(): Int {
        return itensList.size
    }


}