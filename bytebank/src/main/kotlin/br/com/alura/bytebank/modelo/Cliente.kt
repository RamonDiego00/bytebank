package br.com.alura.bytebank.modelo

class Cliente(
    var nome: String,
    val cpf: String,
    private val  senha: Int,
    var endereco : Endereco = Endereco(),
): Autenticavel {


    override fun autentica(senha: Int):Boolean{
        println("Usando o padrão da Interface autenticável ")
        if(this.senha == senha) {
            return true
        }
        return false
    }


}