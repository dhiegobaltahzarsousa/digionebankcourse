package one.digitalinnovation.digionebankcourse

class Pessoa {
    var nome: String? = null
    var cpf: String? = null

    //Consigo fazer inner class tbm
    inner class Endereco{
        var endereco: String? = null
    }
}


fun main(){
    var pessoa = Pessoa()
    pessoa.nome = "Dhiego"
    pessoa.cpf="123464"
    var endereco = pessoa.Endereco()
    endereco.endereco = "Rua do Teste"

    println(pessoa.nome)
    println(pessoa.cpf)
    println(endereco.endereco)
}