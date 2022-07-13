package br.com.alura.bankinho.model

abstract class Conta(
    val titular: Cliente,
    val numero: Int
) {
    var saldo = 0.0
        protected set

    companion object Contador {
        var totalContas = 0
            private set
    }

    init {
        println("Criando conta")
        totalContas++
    }

    fun deposita(valor: Double) {
        saldo += valor
    }

    abstract fun saca(valor: Double)

    fun transfere(destino: Conta, valor: Double) {
        if (saldo >= valor) {
            saldo -= valor;
            destino.deposita(valor)
        }
    }
}