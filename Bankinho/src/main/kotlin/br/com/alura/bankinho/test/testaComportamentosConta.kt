import br.com.alura.bankinho.model.*

fun testaComportamentosConta() {
    println("Bem vindo ao Bankinho\n")

    val conta1 = ContaCorrente(Cliente("Jorge","723.222.907-98",Endereco(),2254), numero = 1000)
    conta1.deposita(250.0)
    println("Saldo1: $${conta1.saldo}")
    println()
    val conta2 = ContaPoupanca(numero = 1001, titular = Cliente("Benjamin","375.187.245-12",Endereco(),2213))
    conta1.transfere(valor = 150.0, destino = conta2, senha = 2254)
    println("Saldo2: $${conta2.saldo}")
}