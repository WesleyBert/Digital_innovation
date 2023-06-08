package Digital_innovation.com.Test

import Digital_innovation.com.Funcionario
import Digital_innovation.com.Gerente
import Digital_innovation.com.ImprimeRelatorioFuncionario

fun main() {
    val maria = Gerente(nome = "maria do carmo", cpf = "1234456789", salario = 5000.0,senha = "1234")
    ImprimeRelatorioFuncionario.Imprime(maria)

    TesteAutenticacao().autentica(maria)
}