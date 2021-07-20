package one.digitalinnovation.digionebankcourse.testes
import one.digitalinnovation.digionebankcourse.Analista
import one.digitalinnovation.digionebankcourse.Gerente
import one.digitalinnovation.digionebankcourse.Funcionario
import one.digitalinnovation.digionebankcourse.TesteLogin

fun main() {
    val dhiego = Analista(nome="dhiego", cpf="123456", salario=6000.00)
    relatorio(dhiego)
    val vanessa = Gerente(nome="Vanessa", cpf="456123456", salario=8000.00, senha = "12345")
    relatorio(vanessa)
    TesteLogin().testarLogin(vanessa)
}

fun relatorio(funcionario: Funcionario){
    println(funcionario.toString())
}
