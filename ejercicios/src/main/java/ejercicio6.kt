class Direccion(val Calle: String, val numero: Int, val Ciudad: String)

class Persona(val Nombre: String, val Edad: Int, val direccion: Direccion)

fun main(){
    val direccion= Direccion("Yerbal", 1600, "CABA")
    val persona= Persona("Jacqueline", 34, direccion)

    println("${persona.Nombre}, edad ${persona.Edad} - ${persona.direccion.Calle}" +
            " ${persona.direccion.numero}, ${persona.direccion.Ciudad}")

}
