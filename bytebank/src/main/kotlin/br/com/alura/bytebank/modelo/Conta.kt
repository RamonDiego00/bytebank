package br.com.alura.bytebank.modelo

import br.com.alura.bytebank.exception.FalhaAutenticacaoException


abstract class Conta(
    val titular: Cliente,
    val numero: Int,
):Autenticavel{
    var saldo = 0.0
        protected set

   companion object Contador {
        var total = 0
        private set
    }

    init {
        println("Criando conta")
        total++
    }

    override fun autentica(senha: Int): Boolean {
        return titular.autentica(senha) // Delegação
    }



    // constructor(titular:String, numero:Int) {
    //   this.titular = titular
    //   this.numero = numero
    // }


    fun deposita(valor: Double) {
        if (valor > 0) {
            saldo += valor
        }
    }

    abstract fun saca(valor: Double)



    // fun getSaldo():Double{
    //    return saldo
    //  }
    // fun setSaldo(valor: Double):Double{
    //   if (valor>0) {
    //        saldo = valor
    //    }

    //   return saldo
    // }

}

class ContaCorrente(
    titular: Cliente,
    numero: Int
) : ContaTransferivel(
    titular = titular,
    numero = numero
) {
    override fun saca(valor: Double){
        val valorComTaxa = valor + 0.1
        if(this.saldo >=valorComTaxa) {
            this.saldo -= valorComTaxa
        }
    }


}

class ContaPoupanca(
    titular: Cliente,
    numero: Int
) : ContaTransferivel(
    titular = titular,
    numero = numero
){
    override fun saca(valor: Double) {
        if(this.saldo >=valor) {
            this.saldo -= valor
        }
    }
}