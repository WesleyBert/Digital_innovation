package Digital_innovation.com.Test

import Digital_innovation.com.ClienteTipo

fun main() {
    ClienteTipo.values().forEach {elemento ->
        println("${elemento.name} - ${elemento.descrition}")
    }

    ClienteTipo.values().forEach {
        println("${it.name} - ${it.descrition}")
    }

    val pf = ClienteTipo.PF
    println("${pf.name} - ${pf.descrition}")

    val pj = ClienteTipo.PJ
    println("${pj.name} - ${pj.descrition}")
}
