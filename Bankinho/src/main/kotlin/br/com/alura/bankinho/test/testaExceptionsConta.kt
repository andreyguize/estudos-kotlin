package br.com.alura.bankinho.test

import br.com.alura.bankinho.exception.FalhaAutenticacaoException
import br.com.alura.bankinho.exception.SaldoInsuficienteException
import br.com.alura.bankinho.model.Cliente
import br.com.alura.bankinho.model.ContaCorrente
import br.com.alura.bankinho.model.Endereco

fun testaExceptionsConta() {
    val contaCorrente: ContaCorrente = ContaCorrente(
        Cliente("Bruno", "", Endereco(), 1111),
        2222
    )

    val contaCorrente2: ContaCorrente = ContaCorrente(
        Cliente("Jorge", "", Endereco(), 2222),
        3333
    )

    contaCorrente.deposita(1000.0)

    try {
        contaCorrente.transfere(contaCorrente2, 999.0, 1111)
        println("Sucesso")
    } catch (e: SaldoInsuficienteException) {
        println("Falha - Saldo insuficiente")
        e.printStackTrace()
    } catch (e: FalhaAutenticacaoException) {
        println("Falha - Autenticacao Invalida")
        e.printStackTrace()
    } catch (e: Exception) {
        println("Falha - Erro desconhecido")
        e.printStackTrace()
    }
}
