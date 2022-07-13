package br.com.alura.bankinho.model

class SistemaInterno {
    fun entra(admin: Autenticavel, senha: Int){
        if(admin.autentica(senha)){
            println("Bem vindo ao Bankinho!")
        } else {
            println("Falha na autenticacao")
        }
    }
}