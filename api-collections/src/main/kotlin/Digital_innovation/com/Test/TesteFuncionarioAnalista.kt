package Digital_innovation.com.Test

import Digital_innovation.com.Analista
import Digital_innovation.com.ImprimeRelatorioFuncionario

fun main() {
    val joao = Analista(nome = "wesley", cpf = "1234456789", salario = 2000.0)
    ImprimeRelatorioFuncionario.Imprime(joao)
}
