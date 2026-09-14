enum class DiaSemana{
    LUNES, MARTES, MIERCOLES, JUEVES, VIERNES, SABADO, DOMINGO
}

fun main() {
    print("ingrese un dia: ")
    val entrada = readLine()?.uppercase() ?:""

    val dia = try{
        DiaSemana.valueOf(entrada)
    } catch (e: IllegalArgumentException){
        null
    }

    when (dia){
        DiaSemana.LUNES,
        DiaSemana.MARTES,
        DiaSemana.MIERCOLES,
        DiaSemana.JUEVES,
        DiaSemana.VIERNES -> println("Dia laboral")

        DiaSemana.SABADO -> println("Sabado")
        DiaSemana.DOMINGO -> println("Domingo")
        null -> println("Dia no reconocido")

    }
}