class Libro(val titulo: String, val autor: String, val numPaginas: Int, var calificacion: Int) {
    init {
        require(calificacion in 0..10) { "La calificación debe estar entre 0 y 10" }
    }

    override fun toString(): String {
        return "$titulo, Autor: $autor, Páginas: $numPaginas, Calificación: $calificacion"
    }
}