package br.com.alura.bankinho.model

interface Transferivel {
    fun transfere(destino: Transferivel, valor: Double)
}