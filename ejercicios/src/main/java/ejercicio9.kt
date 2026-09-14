enum class Planeta(val distanciaAlSol: Double){
    MARTE(228.0,),
    JUPITER(distanciaAlSol = 778.0),
    SATURNO(distanciaAlSol = 1433.0,),
    URANO(distanciaAlSol = 2870.0,)
}

fun main(){
    for (planeta in Planeta.entries){
        println("${planeta.name} -> ${planeta.distanciaAlSol} millones de km")
    }
}
