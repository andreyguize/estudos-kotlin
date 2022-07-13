package br.com.alura.bankinho.model

class ContaCorrente(titular: Cliente, numero: Int) : Conta(titular, numero) {
    override fun saca(valor: Double) {
        val valorComTaxa = valor + 0.1
        if (this.saldo >= valorComTaxa) {
            this.saldo -= valorComTaxa;
        }
    }
}