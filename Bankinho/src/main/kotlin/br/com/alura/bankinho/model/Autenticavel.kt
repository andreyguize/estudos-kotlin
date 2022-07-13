package br.com.alura.bankinho.model

interface Autenticavel {
    fun autentica(senha: Int): Boolean
}