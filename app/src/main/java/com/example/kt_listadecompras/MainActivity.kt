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

        itens = getItensList()
        val rvListaDeCompras : RecyclerView = findViewById(R.id.rvListaDeCompras)
        rvListaDeCompras.adapter = MainAdapter(itens)
    }

    private fun getItensList(): ArrayList<ItemDeProduto> {
        itens.add(
            ItemDeProduto("Uxi", "É uma fruta típica de Belém-PA"))
        itens.add(
            ItemDeProduto("Pirarucu", "É um peixe típico de Belém-PA"))
        itens.add(
            ItemDeProduto("Tapioca", "É uma farinha de mandioca, típica de Belém-PA"))
        itens.add(
            ItemDeProduto("Abacaba", "É uma bebida saborosa, típico de Belém-PA"))
        itens.add(
            ItemDeProduto("Pupunha", "É uma fruta típica de Belém-PA"))
        return itens
    }


}