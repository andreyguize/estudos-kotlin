package br.com.alura.bankinho

import br.com.alura.bankinho.model.Endereco

fun main() {
    val endereco = Endereco(
        logradouro = "Rua Vergueiro",
        complemento = "Alura",
        cep = "00000-000"
    )
    val enderecoNovo = Endereco(
        bairro = "Vila Mariana",
        numero = 709,
        cep = "00000-000"
    )

    println(endereco.equals(enderecoNovo))

    println(endereco.hashCode())
    println(enderecoNovo.hashCode())

    println(endereco)
    println(enderecoNovo)
}

fun imprime(valor: Any) : Any{
    println(valor)
    return valor
}






