import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.ContaCorrente
import br.com.alura.bytebank.modelo.ContaPoupanca
import br.com.alura.bytebank.modelo.Endereco

fun testaContasDiferentes() {

    val jonas = Cliente(
        nome = "Jonas",
        cpf = "111.111.111-11",
        senha = 5,
        endereco = Endereco(
            logradouro = "Rua Dardanelos"
        )
    )

    val contaJonas = ContaCorrente(
        jonas,
        1200
    )


    contaJonas.deposita(3000.0)
    println("saldo jonas ${contaJonas.saldo}")

    contaJonas.saca(100.0)
    println("saldo após saque  jonas ${contaJonas.saldo}")

    val filipe = Cliente(nome = "Filipe", cpf = "", senha = 8)

    val contaFilipe = ContaPoupanca(
        titular = filipe,
        numero = 1250,
    )

    contaFilipe.deposita(3000.0)
    println("saldo filipe ${contaFilipe.saldo}")

    contaFilipe.saca(100.0)
    println("saldo após saque filipe ${contaFilipe.saldo}")

    contaJonas.transfere(valor = 100.0, contaFilipe,8)

    println("saldo do jonas após transferir para o filipe: ${contaJonas.saldo}")
    println("saldo do filipe após receber do jonas: ${contaFilipe.saldo}")

    contaFilipe.transfere(valor = 200.0, contaJonas, 5)

    println("saldo do filipe após transferir para o jonas: ${contaFilipe.saldo}")
    println("saldo do jonas após receber do filipe: ${contaFilipe.saldo}")

    println("titular ${contaJonas.titular}")
    println("nome do titular ${contaJonas.titular.nome}")
    println("cpf do titular ${contaJonas.titular.cpf}")
    println("logradouro do ${contaJonas.titular.nome}: ${contaJonas.titular.endereco.logradouro}")
}
