class ConjuntoLibros(val capacidad: Int) {
    private val libros: MutableList<Libro?> = MutableList(capacidad) { null }

    fun agregarLibro(libro: Libro): Boolean {
        val indiceLibre = libros.indexOf(null)
        if (indiceLibre != -1) {
            libros[indiceLibre] = libro
            return true
        }
        return false
    }

    fun eliminarLibroPorTitulo(titulo: String): Boolean {
        val libro = libros.find { it?.titulo == titulo }
        return if (libro != null) {
            libros.remove(libro)
            true
        } else {
            false
        }
    }

    fun eliminarLibroPorAutor(autor: String): Boolean {
        val librosEliminar = libros.filter { it?.autor == autor }
        libros.removeAll(librosEliminar)
        return librosEliminar.isNotEmpty()
    }

    fun mostrarLibrosMayorCalificacion() {
        val maxCalificacion = libros.mapNotNull { it?.calificacion }.maxOrNull()
        val librosMaxCalificacion = libros.filter { it?.calificacion == maxCalificacion }

        println("Libros con la mayor calificación:")
        librosMaxCalificacion.forEach { println(it) }
    }

    fun mostrarLibrosMenorCalificacion() {
        val minCalificacion = libros.mapNotNull { it?.calificacion }.minOrNull()
        val librosMinCalificacion = libros.filter { it?.calificacion == minCalificacion }

        println("Libros con la menor calificación:")
        librosMinCalificacion.forEach { println(it) }
    }

    fun mostrarContenido() {
        println("Contenido del conjunto de libros:")
        libros.forEach { println(it) }
    }
}