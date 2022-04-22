import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.ContaCorrente
import br.com.alura.bytebank.modelo.ContaPoupanca

fun testaCopiaEReferencias() {

    val numeroX = 10
    var numeroY = numeroX
    numeroY++

    println("numeroX $numeroX")
    println("numeroY $numeroY")

    val joao = Cliente(
        nome = "João",
        cpf = "",
        senha = 3
    )

    val contaJoao = ContaPoupanca(joao, 3000)

    val maria = Cliente(
        nome = "Maria",
        cpf = "",
        senha = 4
    )


    var contaMaria = ContaCorrente(maria, 3001)


    println("Titular joão ${contaJoao.titular}")
    println("Titular Maria ${contaMaria.titular}")

    println(contaMaria)
    println(contaMaria)

}
