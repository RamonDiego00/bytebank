import br.com.alura.bytebank.modelo.Endereco

fun testaWith() {
    with(Endereco()) {
        logradouro = "Rua minha"
        numero = 123
        bairro = "Minha vila"
        cidade = "Santo André"
        estado = "SP"
        cep = "09260-060"
        complemento = "Apartamento"
        completo()
    }.let { enderecoCompleto: String ->
        println(enderecoCompleto)
    }
}
