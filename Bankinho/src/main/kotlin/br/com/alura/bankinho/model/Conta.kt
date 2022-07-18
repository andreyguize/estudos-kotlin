package br.com.alura.bankinho.model

import br.com.alura.bankinho.exception.FalhaAutenticacaoException
import br.com.alura.bankinho.exception.SaldoInsuficienteException

abstract class Conta(
    val titular: Cliente,
    val numero: Int
) : Autenticavel {
    var saldo = 0.0
        protected set

    companion object Contador {
        var totalContas = 0
            private set
    }

    init {
        totalContas++
    }

    fun deposita(valor: Double) {
        saldo += valor
    }

    override fun autentica(senha: Int): Boolean {
        return titular.autentica(senha)
    }

    abstract fun saca(valor: Double)

    fun transfere(destino: Conta, valor: Double, senha: Int) {
        if (saldo < valor) {
            throw SaldoInsuficienteException(mensagem = "Saldo insuficiente. Saldo atual: $saldo. Valor para transferir: $valor")
        }
        if (!autentica(senha)) {
            throw FalhaAutenticacaoException()
        }
        saldo -= valor;
        destino.deposita(valor)
    }
}