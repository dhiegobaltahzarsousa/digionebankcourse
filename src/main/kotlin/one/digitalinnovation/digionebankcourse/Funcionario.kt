package one.digitalinnovation.digionebankcourse


abstract class Funcionario(
    nome: String,
    cpf: String,
    val salario: Double

) : Pessoa(nome, cpf){
    protected abstract fun calculaAuxilio(): Double//protected para somente a classe Funcionario e as filhas usam

    override fun toString():String = """
        Nome=> $nome
        CPF=> $cpf
        Salario=> $salario
        Auxilio=> ${calculaAuxilio()}
    """.trimIndent()
}