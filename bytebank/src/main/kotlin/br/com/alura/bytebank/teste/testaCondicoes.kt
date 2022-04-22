fun testaCondicoes(saldo: Double) {
    if (saldo > 0.0) {
        println("modelo.Conta é positiva")
    } else if (saldo == 0.0) {
        println("conta é neutra")
    } else {
        println("conta negativa")
    }
}