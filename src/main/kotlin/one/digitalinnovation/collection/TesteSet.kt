package one.digitalinnovation.collection

fun main() {
    val joao = Funcionario("Joao", 2000.0,"CLT")
    val pedro = Funcionario("Pedro", 1500.0, "PJ")
    val maria = Funcionario("Maria", 4000.0, "CLT")

    val funcionarios1 = setOf(joao, pedro)
    val funcionarios2 = setOf(maria)

    val resultUnion = funcionarios1.union(funcionarios2)
    resultUnion.forEach { print(it) }

    println("----------------------")

    val funcionarios3 = setOf(joao, pedro, maria)
    val resultSubtract = funcionarios1.subtract(funcionarios2)
    resultSubtract.forEach { print(it) }

    println("----------------------")

    val resultIntersect = funcionarios3.intersect(funcionarios2)
    resultIntersect.forEach { print(it) }



}