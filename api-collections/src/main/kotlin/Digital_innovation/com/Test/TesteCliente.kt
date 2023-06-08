package Digital_innovation.com.Test

import Digital_innovation.com.Cliente
import Digital_innovation.com.ClienteTipo

fun main(){
    val jose = Cliente(
        nome = "Wesleyberto",
        cpf = "123.456.456-66",
        clienteTipo = ClienteTipo.PF,
        senha = "12345"
    )

    println(jose)
    TesteAutenticacao().autentica(jose)
}

