package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.*

fun testaObjects() {
    val fran = object : Autenticavel {
        val nome: String = "Fran"
        val cpf: String = "111.111.111-11"
        val senha: Int = 1000

        override fun autentica(senha: Int): Boolean = this.senha == senha
    }
    val sistemaInterno = SistemaInterno()
    sistemaInterno.entra(fran, senha = 1000)


    val ramon = Cliente(nome = "Ramon", cpf = "222.222.222-22", senha = 1)
    val contaPoupanca = ContaPoupanca(titular = ramon, numero = 1000)
    val contaCorrente = ContaCorrente(titular = ramon, numero = 1001)

    println("Total de contas: ${Conta.total}")
}
