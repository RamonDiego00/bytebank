fun testaLacos() {

    var l = 0

    while (l < 5) {
        val titular: String = "Ramon $l"
        val numeroConta: Int = 1000 + l
        var saldo = l + 10.0


        println("titular $titular")
        println("numero da conta $numeroConta")
        println("saldo da conta $saldo")
        println()
        l++
    }

    for (i in 5 downTo 1) {

        if (i == 4) {
            continue
        }
        val titular: String = "Ramon $i"
        val numeroConta: Int = 1000 + i
        var saldo = i + 10.0


        println("titular $titular")
        println("numero da conta $numeroConta")
        println("saldo da conta $saldo")
        println()
    }


}
