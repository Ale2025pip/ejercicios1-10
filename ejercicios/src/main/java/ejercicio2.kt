fun main(){
    val peliculas = listOf("El Origen","Arrival","Aniquilacion","Contacto","Matrix")
    for ((i, pelicula) in peliculas.withIndex()) {
        println("${i+1}. $pelicula")
    }
}