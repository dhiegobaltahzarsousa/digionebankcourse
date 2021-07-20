package one.digitalinnovation.digionebankcourse
import one.digitalinnovation.digionebankcourse.Autenticavel

class Gerente(
    nome: String,
    cpf: String,
    salario: Double,
    val senha: String
) : Funcionario(nome, cpf, salario), Autenticavel{
    override fun calculaAuxilio() = salario * 0.3

    override fun login() = "12345" === this.senha
}