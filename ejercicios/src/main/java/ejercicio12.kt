package ejercicio12

import kotlin.math.PI

open class Figura(){
    open fun calcularArea(): Double{
        return 0.0
    }
}
class Circulo(val radio: Double) : Figura() {
    override fun calcularArea(): Double {
        return PI * radio* radio
    }
}

class Rectangulo(val base: Double, val altura: Double): Figura(){
    override fun calcularArea(): Double {
        return base * altura
    }
}
fun main (){
    val figuras: List<Figura> = listOf(
        Circulo(7.0),
        Rectangulo(8.5,4.7),

    )
    for (figura in figuras){
        val area = figura.calcularArea()
        println("el area de la figura es: $area")
    }
}