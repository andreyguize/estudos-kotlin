import br.com.alura.bankinho.model.*

fun testaFuncionarios() {
    val alex = Analista(nome = "Alex", cpf = "122.022.578-99", salario = 1000.0)
    println("\nNome: ${alex.nome}")
    println("CPF: ${alex.cpf}")
    println("Salario: R$${alex.salario}")
    println("Bonificacao: R$${alex.bonificacao}")

    val marina = Gerente("Marina", "222-562-876-09", 5000.0, 1234)
    println("\nNome: ${marina.nome}")
    println("CPF: ${marina.cpf}")
    println("Salario: R$${marina.salario}")
    println("Bonificacao: R$${marina.bonificacao}")

    val augusto = Diretor("Augusto", "665-284-456-09", 10000.0, 1234, 5000.0)
    println("\nNome: ${augusto.nome}")
    println("CPF: ${augusto.cpf}")
    println("Salario: R$${augusto.salario}")
    println("Bonificacao: R$${augusto.bonificacao}")

    val maria = Analista("Maria", "444-284-222-09", 3000.0)

    val calculadora = CalculadoraBonificacao()
    calculadora.registra(alex)
    calculadora.registra(marina)
    calculadora.registra(augusto)
    calculadora.registra(maria)
    println("\nTotal de bonificacao: ${calculadora.total}")
}
