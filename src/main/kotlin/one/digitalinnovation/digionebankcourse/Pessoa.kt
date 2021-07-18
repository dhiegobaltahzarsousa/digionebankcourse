package one.digitalinnovation.digionebankcourse

class Pessoa {
    var nome: String? = null
    var cpf: String? = null
}

fun main(){
    val pessoa = Pessoa()
    pessoa.nome = "Dhiego"
    pessoa.cpf="123464"
    println(pessoa.nome)
    println(pessoa.cpf)
}