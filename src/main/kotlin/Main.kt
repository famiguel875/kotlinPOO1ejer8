fun main() {
    val libro1 = Libro("El señor de los anillos", "J.R.R. Tolkien", 1200, 9)
    val libro2 = Libro("1984", "George Orwell", 300, 8)

    val conjuntoLibros = ConjuntoLibros(5)

    println("Añadiendo libros al conjunto:")
    println("Libro 1 agregado: ${conjuntoLibros.agregarLibro(libro1)}")
    println("Libro 2 agregado: ${conjuntoLibros.agregarLibro(libro2)}")

    println("Eliminando libros por título y autor:")
    println("Eliminar por título: ${conjuntoLibros.eliminarLibroPorTitulo("El señor de los anillos")}")
    println("Eliminar por autor: ${conjuntoLibros.eliminarLibroPorAutor("George Orwell")}")

    println("Volver a añadir un libro:")
    val libro3 = Libro("Cien años de soledad", "Gabriel García Márquez", 400, 10)
    println("Libro 3 agregado: ${conjuntoLibros.agregarLibro(libro3)}")

    println("Mostrar contenido final:")
    conjuntoLibros.mostrarContenido()

    println("Mostrar libros con mayor calificación:")
    conjuntoLibros.mostrarLibrosMayorCalificacion()

    println("Mostrar libros con menor calificación:")
    conjuntoLibros.mostrarLibrosMenorCalificacion()
}
