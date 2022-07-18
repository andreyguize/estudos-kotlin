package br.com.alura.bankinho.test

fun testaExpressao() {
    val entrada: String = "1.0"
    val valorRecebido: Double? = try {
        entrada.toDouble()
    } catch (e: NumberFormatException) {
        println("Problema na conversao")
        e.printStackTrace()
        null
    }

    val valorComTaxa: Double? = if (valorRecebido != null) {
        valorRecebido + 0.1
    } else {
        null
    }

    if (valorComTaxa != null) {
        println("Valor recebido: $valorComTaxa")
    } else {
        println("Valor invalido")
    }

    try {
        val valor: Double = entrada.toDouble()
        println("Valor recebido: $valor")
    } catch (e: java.lang.NumberFormatException) {
        println("Problema na conversao")
        e.printStackTrace()
    }

    val entrada2: Double = 1.9

    try {
        val valor: Int = entrada2.toInt()
        println("Valor recebido: $valor")
    } catch (e: java.lang.NumberFormatException) {
        println("Problema na conversao")
        e.printStackTrace()
    }
}
