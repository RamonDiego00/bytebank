package br.com.alura.bytebank.modelo

class SistemaInterno {

    fun entra(admin: Autenticavel, senha:Int, autenticado:()-> Unit = {}) {
      if  (admin.autentica(senha)) {
          println("Bem vindo ao bytebank")
          autenticado()
      } else{
          println("Falha na autenticação")
      }
    }

    fun entraReciver(admin: Autenticavel, senha:Int, autenticado:SistemaInterno.()-> Unit = {}) {
        if  (admin.autentica(senha)) {
            println("Bem vindo ao bytebank")
            autenticado()
        } else{
            println("Falha na autenticação")
        }
    }

    fun pagamento(){
        println("realizando pagamento")
    }

}