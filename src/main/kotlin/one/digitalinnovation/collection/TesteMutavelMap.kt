package one.digitalinnovation.collection

fun main() {
    val joao = Functionary("Joao", 2000.0,"CLT")
    val pedro = Functionary("Pedro", 1500.0, "PJ")
    val maria = Functionary("Maria", 4000.0, "CLT")

    val repositorio = Repositorio<Functionary>()

    repositorio.create(joao.nome, joao)
    repositorio.create(pedro.nome, pedro)
    repositorio.create(maria.nome,maria)

    println(repositorio.findById(maria.nome))

    println("----------------------")

    repositorio.findAll().forEach{ println(it) }

    println("----------------------")
    (repositorio.remove(maria.nome))
    repositorio.findAll().forEach{ println(it) }

}