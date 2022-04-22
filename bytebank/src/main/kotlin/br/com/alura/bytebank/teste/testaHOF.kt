package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.Autenticavel
import br.com.alura.bytebank.modelo.SistemaInterno

fun soma(a: Int, b: Int, resultado: (Int) -> Unit) {
    println("antes da soma efetuada")
    resultado(a + b)
    println("depois da soma efetuada")
}

fun somaReciver(a: Int, b: Int, resultado: Int.() -> Unit) {
    println("antes da soma efetuada")
    val total=  a+b
    total.resultado()
    println("depois da soma efetuada")
}

fun testaHOF() {
    soma(1, 5, resultado = { valor ->
        print(valor)

    })
    somaReciver(1, 5, resultado = {
        println(this)
        })

        val ramozastes = object : Autenticavel {
            val senha = 1234
            override fun autentica(senha: Int) = this.senha == senha

        }
val sistema = SistemaInterno()
        SistemaInterno().entra(ramozastes, 1234, autenticado = {
            println("realizar pagamento")
        })
    sistema.entraReciver(ramozastes, senha = 123, autenticado = {pagamento()})
    }


