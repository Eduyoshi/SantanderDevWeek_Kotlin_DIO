package com.projetos.santanderdevweek

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        //Dec Variaveis
//        //val = não  muda
//        //var = mutável
//
//        var contador: Int = 12
//        contador = 11
//
//        val contador2: Int = 11
//
//        //Segurança nula
//        val languageName: String? = null
//
//        //Condicionais
//        var idade: Int = 20
////        val minhaIdade: String = if(idade>18){
////            "Você é maior de idade"
////        }else{
////            "Você é menor de idade"
////        }
//
//        //When
//        val minhaIdade = when {
//            idade > 18 -> "Você é maior de idade"
//            else -> "Você é menor de idade"
//        }
//        minhaIdade()

        val medicamento = Medicamento("teste 1", "2x ao dia")
        medicamento.formula
    }

//
//    fun minhaIdade(): String{
//        return "Minha idade é 18"
//    }
}