import br.com.alura.bytebank.exception.FalhaAutenticacaoException
import br.com.alura.bytebank.exception.SaldoInsuficienteException
import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.ContaCorrente
import br.com.alura.bytebank.modelo.ContaPoupanca

fun testaComportamentosConta() {
    println("Bem vindo ao Bytebank")

    val ramon = Cliente(nome = "Ramon", cpf = "", senha = 1)


    val contaRamon = ContaCorrente(numero = 1000, titular = ramon)

    contaRamon.deposita(200.0)

    println(contaRamon.titular)
    println(contaRamon.numero)
    println(contaRamon.saldo)

    val fran = Cliente(nome = "Fran", cpf = "", senha = 2)

    val contaFran = ContaPoupanca(fran, 1001)

    contaFran.deposita(350.0)

    println(contaFran.titular)
    println(contaFran.numero)
    println(contaFran.saldo)

    contaRamon.deposita(33.3)
    println(contaRamon.saldo)

    contaRamon.saca(234.3)
    println(contaRamon.saldo)
    println("Saque na conta do Ramon")


    contaFran.deposita(100.9)
    println(contaFran.saldo)

    contaFran.saca(100.3)
    println(contaFran.saldo)
    println("Saque na conta do Fran")



    try {
        println("Transferencia da conta da Fran para o Ramon")
        contaFran.transfere(200.0, contaRamon,2)
        println("Transferencia sucedida")
    }
    catch (e: SaldoInsuficienteException) {
        println("Falha na transferencia ")
        println("Saldo Insuficiente")
        e.printStackTrace()
    } catch (e:FalhaAutenticacaoException) {
        println("Falha na transfrencia")
        println("Falha na Autenticacao")
        e.printStackTrace()
    }
    catch (e:Exception) {
        println("Erro desconhecido")
        e.printStackTrace()
    }


    println(contaRamon.saldo)
    println(contaFran.saldo)
}
