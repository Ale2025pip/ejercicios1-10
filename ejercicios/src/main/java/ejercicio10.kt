open class Empleado(val Nombre: String, val Sueldo: Double) {
    open fun trabajar() {
        println("$Nombre esta realizando sus tareas")
    }
}

class Desarrollador(Nombre: String, Sueldo: Double, val lenguaje: String) :
    Empleado(Nombre, Sueldo) {
    override fun trabajar() {
        super.trabajar()
        println("$Nombre esta programando en $lenguaje.")
    }
}

class Disenador(Nombre: String, Sueldo: Double, val herramienta: String) :
    Empleado(Nombre, Sueldo) {
    override fun trabajar() {
        super.trabajar()
        println("$Nombre esta diseñando interfaces en $herramienta.")
    }
}
fun main(){
    val dev = Desarrollador("Martin", 4000.0, "Kotlin")
    val designer = Disenador("Romina", 6000.0, "Figma")

    dev.trabajar()
    designer.trabajar()
}
