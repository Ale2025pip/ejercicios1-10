class Alumno(val nombre: String, notaI: Double){
    var aprobado : Boolean = false
    var nota: Double = notaI
        set(value){
            field = value
            aprobado = value >= 6.0
        }
    init{
        nota = notaI
    }
}

fun main(){
    val alumnos: List<Alumno> = listOf(
        Alumno("Ruben", 7.0),
        Alumno("Benjamin",8.0),
        Alumno("Ramiro", 5.0),
        Alumno("Joaquin",4.0),
        Alumno("Andres", 2.0)
        )
    println("Alumnos aprobados")
    for (alumno in alumnos){
        if(alumno.aprobado){
            println("${alumno.nombre} -Nota: ${alumno.nota}")
        }
    }
    var sumaNotas= 0.0
    for (alumno in alumnos){
        sumaNotas += alumno.nota
    }
    val promedio = sumaNotas/ alumnos.size
    println("\n Promedio de la clase: $promedio")
}
