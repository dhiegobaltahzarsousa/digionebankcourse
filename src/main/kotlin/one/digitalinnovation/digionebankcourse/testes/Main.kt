package one.digitalinnovation.digionebankcourse.testes
import one.digitalinnovation.digionebankcourse.ClienteTipo

fun main() {
    ClienteTipo.values().forEach{
        println("${it.name} => ${it.descricao}")
    }
    var pj = ClienteTipo.pj
    println("${pj.name} => ${pj.descricao}")
}