package Digital_innovation.com.Test

import Digital_innovation.com.Banco

fun main() {
    val digiOneBank = Banco(nome = "DigiOne", Numero = 12)
    println(digiOneBank.nome)
    println(digiOneBank.Numero)

    val banco2 = digiOneBank.copy(nome = "banco2")

    println(banco2.nome)
    println(banco2.Numero)
}