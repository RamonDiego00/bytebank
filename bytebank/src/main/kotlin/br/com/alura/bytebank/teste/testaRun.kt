package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.ContaPoupanca

fun testaRun() {
    val taxaAnual = 0.05
    val taxaMensal = taxaAnual / 12
}

//
//    val contaPoupanca = Cliente(nome = "Ramon", cpf = "333.333.333-33", senha = 1234)
//    ContaPoupanca(contaPoupanca, 1200).run {
//        deposita(1000.0)
//        saldo * taxaMensal
//    }.let { rendimentomensal ->
//        println("rendimento mensal $rendimentomensal")
//    }
//
//    val rendimentoAnual = run {
//        var saldo: Double = contaPoupanca.saldo
//        repeat(12) {
//            saldo += saldo * taxaMensal
//        }
//        saldo
//    }
//    println("rendimentoAnual $rendimentoAnual")
//}
