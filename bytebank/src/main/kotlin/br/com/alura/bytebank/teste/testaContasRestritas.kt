import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.ContaSalario

fun testaContasRestritas() {

    val julius = Cliente(nome = "Julius", cpf = "", senha =  9)

    val contaSalario = ContaSalario(
        titular = julius,
        numero = 4343
    )
    contaSalario.deposita(2000.0)

    println("Saldo do julius:${contaSalario.saldo}")
    println("Julius não pode fazer transferencia ou saque")

}







