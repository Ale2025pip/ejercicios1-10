package ejercicio10

open class Empleado(val nombre: String, val Sueldo: Double) {
    open fun trabajar() {
        println("$nombre esta realizando sus tareas")
    }
}

class Desarrollador(nombre: String, Sueldo: Double, val lenguaje: String) :
    Empleado(nombre, Sueldo) {
    override fun trabajar() {
        super.trabajar()
        println("$nombre esta programando en $lenguaje.")
    }
}

class Disenador(nombre: String, Sueldo: Double, val herramienta: String) :
    Empleado(nombre, Sueldo) {
    override fun trabajar() {
        super.trabajar()
        println("$nombre esta disenando interfaces en $herramienta.")
    }
}
fun main(){
    val dev = Desarrollador("Martin", 4000.0, "Kotlin")
    val designer= Disenador("Romina", 6000.0, "Figma")

    dev.trabajar()
    designer.trabajar()
}