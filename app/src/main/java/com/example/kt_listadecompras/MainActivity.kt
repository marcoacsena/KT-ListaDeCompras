package com.example.kt_listadecompras

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.kt_listadecompras.adapter.MainAdapter
import java.util.*
import kotlin.collections.ArrayList

class MainActivity : AppCompatActivity() {

    //Creates a binding variable
    //private lateinit var binding : ActivityMainBinding

    private var itens : ArrayList<ItemDeProduto> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        //Binding activity_main.xml (layout) with MainActivity
//        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
//
//        binding.rvListaDeCompras.adapter = MainAdapter()



            itens.add(
                ItemDeProduto("Açaí", "Descrição do produto"))
            itens.add(
                ItemDeProduto("Bacuri", "Descrição do produto"))
            itens.add(
                ItemDeProduto("Cupuaçu", "Descrição do produto"))
            itens.add(
                ItemDeProduto("Jambo", "Descrição do produto"))
            itens.add(
                ItemDeProduto("Taperebá", "Descrição do produto"))


        val rvListaDeCompras : RecyclerView = findViewById(R.id.rvListaDeCompras)
        rvListaDeCompras.adapter = MainAdapter(itens)
    }
}