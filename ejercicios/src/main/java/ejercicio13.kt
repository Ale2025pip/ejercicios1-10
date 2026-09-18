import kotlin.math.PI

enum class TipoFigura {
    CIRCULO, RECTANGULO
}

open class Figura(val tipo: TipoFigura){
    open fun calcularArea(): Double{
        return 0.0
    }
}
class Circulo(val radio: Double) : Figura(TipoFigura.CIRCULO) {
    override fun calcularArea(): Double {
        return PI * radio * radio
    }
}
class Rectangulo(val base: Double, val altura: Double): Figura(TipoFigura.RECTANGULO){
    override fun calcularArea(): Double {
        return base * altura
    }
}
fun main() {
    val figuras: List<Figura> = listOf(
        Circulo(5.0),
        Rectangulo(4.0, 5.0)
    )
    for (figura in figuras){
        when(figura.tipo){
            TipoFigura.CIRCULO-> println("Circulo")
            TipoFigura.RECTANGULO-> println ("Rectangulo")
        }
        val area= figura.calcularArea()
        println("area: $area \n")
    }
}
