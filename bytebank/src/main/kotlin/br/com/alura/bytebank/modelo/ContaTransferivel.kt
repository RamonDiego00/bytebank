package br.com.alura.bytebank.modelo

import br.com.alura.bytebank.exception.FalhaAutenticacaoException
import br.com.alura.bytebank.exception.SaldoInsuficienteException

abstract class ContaTransferivel(
    titular: Cliente,
    numero:Int
): Conta(
    titular = titular,
    numero = numero
){
    fun transfere(valor: Double, destino: Conta, senha:Int) {
        if(saldo < valor) {
            throw SaldoInsuficienteException(mensagem = "O saldo é insuficiente, saldo atual: $saldo,valor a ser subtraido $valor")
        }
            saldo -= valor
            destino.deposita(valor)

        if(!autentica(senha)){
            throw FalhaAutenticacaoException()
        }

    }



}