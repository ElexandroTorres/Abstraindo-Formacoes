package model

data class Formacao(
    val nome: String,
    val listaCursos: List<Curso> = emptyList(),
) {
    private val _alunos = mutableListOf<Usuario>()

    fun matricular(usuario: Usuario) : Boolean {
        return _alunos.add(usuario)
    }

    fun getListaAlunos() : List<Usuario> {
        return _alunos
    }
}
