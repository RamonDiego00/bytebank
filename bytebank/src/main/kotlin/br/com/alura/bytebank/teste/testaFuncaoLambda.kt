package br.com.alura.bytebank.teste

fun testaFuncaoLambda() {
    val minhaFuncaoLambda = { a: Int, b: Int ->
        a + b
    }
    println(minhaFuncaoLambda(13, 2))

    val calculabonificacao: (salario: Double) -> Double = lambda@{ salario ->
        if (salario > 1000.0) {
            return@lambda salario + 50.0
        }
        salario + 100.0 //ultimo comando sempre executa
    }
    println(calculabonificacao(1000.0))
}

fun testaTipoFuncaoClasse() {
    val minhaFuncaoClasses: (Int, Int) -> Int = Soma()
    println(minhaFuncaoClasses(10,8))
}

fun testaTipoFuncaoReferencia() {
    val minhaFuncao:(Int,Int) -> Int = ::soma
    println(minhaFuncao(2,2))
}

fun soma(a:Int, b:Int): Int {
    return a + b
}

class Soma: (Int, Int) -> Int {
    override fun invoke(a: Int, b: Int): Int {
        return a + b
    }
}

