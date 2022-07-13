import br.com.alura.bankinho.model.*

fun testaContasDiferentes() {
    val contaCorrente = ContaCorrente(Cliente(
        "Alex",
        "242.666.543-20",
        Endereco("Rua Jacareí",
            154,
            "Centro",
            "São Paulo",
            "SP",
            "0101225-60",
            "Casa 4"),
        1234
    ), 1000)
    val contaPoupanca = ContaPoupanca(Cliente(
        "Bruna",
        "777.375.208-12",
        Endereco(
            "Rua José Albino",
            1277,
            "Vergueiro",
            "Junqueirópolis",
            "SP",
            "1901225-60",
            "AP77"
        ),
        1234),
        1001)

    contaCorrente.deposita(1000.0)
    contaPoupanca.deposita(1000.0)

    println("Conta corrente apos depositar ${contaCorrente.saldo}")
    println("Conta poupanca apos depositar ${contaPoupanca.saldo}\n")

    contaCorrente.saca(100.0)
    contaPoupanca.saca(100.0)

    println("Conta corrente apos sacar ${contaCorrente.saldo}")
    println("Conta poupanca apos sacar ${contaPoupanca.saldo}\n")

    contaPoupanca.transfere(contaCorrente, 100.0)

    println("Conta corrente apos transferencia ${contaCorrente.saldo}")
    println("Conta poupanca apos transferencia ${contaPoupanca.saldo}\n")
}
