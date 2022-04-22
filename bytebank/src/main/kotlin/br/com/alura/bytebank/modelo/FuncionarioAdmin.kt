package br.com.alura.bytebank.modelo

abstract class FuncionarioAdmin(
     nome: String,
     cpf: String,
     salario: Double,
     protected val senha:Int //Novo elemento
): Funcionario(
    nome = nome,
    cpf=cpf,
    salario = salario,
), Autenticavel {

     override fun autentica(senha: Int):Boolean{
        println("Usando o padrão da Classe abstrata  ")
        if(this.senha == senha) {
            return true
        }
        return false
    }

}