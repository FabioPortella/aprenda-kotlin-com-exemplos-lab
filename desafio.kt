// Desafio de projeto - Fábio Portella

enum class Nivel { BASICO, INTERMEDIARIO, AVANCADO }

data class Usuario(val nome: String)

data class ConteudoEducacional(val nome: String, val duracao: Int = 60)

data class Formacao(val nome: String, val conteudos: List<ConteudoEducacional>, val nivelFormacao: String) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(novoUsuario: Usuario) {
        inscritos.add(novoUsuario)
    }     
}

fun main() {
    val fabioUsuario = Usuario("Fabio")
    val henriqueUsuario = Usuario("Henrique")
    val contEdu01 = ConteudoEducacional("Git")
    val contEdu02 = ConteudoEducacional("GitHub")
    val contEdu03 = ConteudoEducacional("Python", 120)
    val formacaoPython = Formacao("Formação Python", mutableListOf<ConteudoEducacional>(contEdu01, contEdu02, contEdu03), Nivel.INTERMEDIARIO.toString())
    println(formacaoPython)
    formacaoPython.matricular(fabioUsuario)
    formacaoPython.matricular(henriqueUsuario)    
    println("${formacaoPython.inscritos}")
}
