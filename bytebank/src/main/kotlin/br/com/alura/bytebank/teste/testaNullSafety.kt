package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.Endereco
import java.lang.IllegalStateException

fun testaNullSafety() {
    var enderecoNulo: Endereco? = Endereco(logradouro = "dardan kill", complemento = "prédio")
    val logradouroNovo: String? = enderecoNulo?.logradouro
    enderecoNulo?.let { endereco ->
        println(endereco.logradouro.length)
        val tamanhoComplemento: Int =
            endereco.complemento?.length ?: throw IllegalStateException("Complemento deve existir") // ou 0
        println(tamanhoComplemento)
    }
    fun teste(valor: Any) {
        val numero: Int? = valor as? Int
        println(numero)
    }
    teste(2)

}
