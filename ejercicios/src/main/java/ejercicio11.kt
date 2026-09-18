
open class Empleado(val nombre: String, val sueldo: Double){
    open fun trabajar(){
        println("$nombre esta realizando sus tareas")
    }
}
class Desarrollador(nombre: String, sueldo: Double,val lenguaje: String):
        Empleado(nombre,sueldo){
    override fun trabajar() {
        super.trabajar()
        println("$nombre esta programando en $lenguaje")
    }
    fun programar(horas: Int){
        println("$nombre programo durante $horas horas.")
    }
}
class Disenador( nombre: String, sueldo: Double, val herramienta: String):
    Empleado(nombre, sueldo){
    override fun trabajar(){
        super.trabajar()
        println("$nombre esta diseniando interfaces en $herramienta.")
    }
    fun disenar(proyecto: String){
        println("$nombre disenio el proyecto $proyecto.")
    }
}

fun main(){
    val dev = Desarrollador("Martin", 50000.0, "kotlin")
    val designer = Disenador("Romina", 60000.0,"Figma")
    dev.trabajar()
    println("")
    designer.trabajar()
    println("\n-- Tareas especificas--")

    dev.programar(8)
    designer.disenar("app mobil lector de pdf")
}
