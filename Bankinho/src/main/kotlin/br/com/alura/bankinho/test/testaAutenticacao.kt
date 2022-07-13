import br.com.alura.bankinho.model.*

fun testaAutenticacao(){
    val gerente = Gerente("Alex","222.222.222-2",2500.0,1000)
    val diretor = Diretor("Fran","333.333.333-3",2500.0,2000,550.0)
    val cliente = Cliente("Gui","333.333.333-3",Endereco(),2500)

    val sistema = SistemaInterno()
    sistema.entra(gerente,1000)
    sistema.entra(diretor,2000)
    sistema.entra(cliente,2500)
}