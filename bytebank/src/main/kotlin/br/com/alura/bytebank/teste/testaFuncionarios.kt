import br.com.alura.bytebank.modelo.*

fun testaFuncionarios() {

    val funcionarioRamon = Analista(
        "Ramon",
        "448.749.148-70",
        1000.00,
    )

    println("nome ${funcionarioRamon.nome}")
    println("cpf ${funcionarioRamon.cpf}")
    println("salario ${funcionarioRamon.salario}")
    println("bonificação ${funcionarioRamon.bonificacao()}")

    val funcionarioFran = Gerente(
        "Fran",
        "123.123.123-22",
        3000.00,
        1234
    )

    println("nome ${funcionarioFran.nome}")
    println("cpf ${funcionarioFran.cpf}")
    println("salario ${funcionarioFran.salario}")
    println("bonificação ${funcionarioFran.bonificacao()}")

    if (funcionarioFran.autentica(1234)) {
        println("Autenticou com sucesso")
    } else {
        println("Falha na autenticação")
    }

    val funcionarioJoao = Diretor(
        "João",
        "333.333-33",
        5000.00,
        4321,
        200.00
    )

    println("nome ${funcionarioJoao.nome}")
    println("cpf ${funcionarioJoao.cpf}")
    println("salario ${funcionarioJoao.salario}")
    println("bonificação ${funcionarioJoao.bonificacao()}")
    println("plr ${funcionarioJoao.plr}")

    if (funcionarioJoao.autentica(1234)) {
        println("Autenticou com sucesso")
    } else {
        println("Falha na autenticação")
    }

    val funcionarioCleber = Analista(
        nome = "Cleber",
        cpf = "555.555-55",
        salario = 3400.0
    )

    println("nome ${funcionarioCleber.nome}")
    println("cpf ${funcionarioCleber.cpf}")
    println("salario ${funcionarioCleber.salario}")
    println("bonificação ${funcionarioCleber.bonificacao()}")

    val calculadora = CalculadoraBonificacao()

    calculadora.registra(funcionarioRamon)
    calculadora.registra(funcionarioFran)
    calculadora.registra(funcionarioJoao)
    calculadora.registra(funcionarioCleber)



    println("total de bonificação:${calculadora.total}")
}
