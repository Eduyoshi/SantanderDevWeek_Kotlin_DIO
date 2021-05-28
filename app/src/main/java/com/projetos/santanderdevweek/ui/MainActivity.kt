package com.projetos.santanderdevweek.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.projetos.santanderdevweek.R
import com.projetos.santanderdevweek.data.Conta
import java.lang.RuntimeException

class MainActivity : AppCompatActivity() {

    private lateinit var mainViewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setSupportActionBar(findViewById(R.id.toolbar))

        mainViewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        buscarContaCliente()

    }

    private fun buscarContaCliente(){
        mainViewModel.buscarContaCliente().observe(this, Observer { result ->
            bindOnView(result)
        })
    }

    private fun bindOnView(conta : Conta){
        findViewById<TextView>(R.id.tv_usuario).text = "Olá, ${conta.cliente.nome}"
        findViewById<TextView>(R.id.tv_agencia).text = "Ag ${conta.agencia}"
        findViewById<TextView>(R.id.tv_cc).text = "Cc ${conta.numero}"
        findViewById<TextView>(R.id.tv_saldo).text = conta.saldo
        findViewById<TextView>(R.id.tv_limite).text = conta.limite
        findViewById<TextView>(R.id.tv_cartao_final_saldo).text = conta.cartao.numeroConta
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflate = menuInflater
        inflate.inflate(R.menu.main_menu,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when(item.itemId){
            R.id.item_1 ->{
                Log.d("Click", "Click no item 1")
                true
            }else -> super.onOptionsItemSelected(item)
        }
    }
}