package com.projetos.santanderdevweek.data.local

import com.projetos.santanderdevweek.data.Cartao
import com.projetos.santanderdevweek.data.Cliente
import com.projetos.santanderdevweek.data.Conta

class FakeData {

    fun getLocalData(): Conta {
        val cliente = Cliente ("Eduardo")
        val cartao = Cartao("411111111")

        return Conta(
                "445655-4",
                "6552-4",
                "R$ 2.450,80",
                "R$ 4.120,00",
                cliente,
                cartao
        )
    }
}