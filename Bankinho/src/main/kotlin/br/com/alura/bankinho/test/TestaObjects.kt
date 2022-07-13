package br.com.alura.bankinho.test

import br.com.alura.bankinho.model.*

fun testaObjects(){
    val fran = object : Autenticavel {
        val nome: String = "Fran"
        val cpf: String = "111.222.333-44"
        val senha: Int = 1000

        override fun autentica(senha: Int) = this.senha == senha
    }

    val sistemaInterno = SistemaInterno()
    sistemaInterno.entra(fran,1000)
    println("Nome do cliente: ${fran.nome}")

    val alex = Cliente("Alex", "432.234.423-22", Endereco(),1)
    val contaPoupanca = ContaPoupanca(alex, 1000)
    val contaCorrente = ContaCorrente(alex, 1001)

    println("Total de contas: ${Conta.totalContas}")
}
