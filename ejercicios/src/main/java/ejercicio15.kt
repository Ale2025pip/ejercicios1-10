interface Encendible {
    fun encender()
    fun apagar()
}

interface Conectable{
    fun conectar()
    fun desconectar()
}

class SmartTV(val marca: String) : Encendible, Conectable{
    override fun encender() {
        println("$marca Smart TV: Pantalla encendida.")
    }

    override fun apagar() {
        println("$marca Smart TV: Apagando pantalla.")
    }

    override fun conectar(){
        println("$marca Smart TV: Conectando a Wi Fi.")
    }

    override fun desconectar() {
        println("$marca Smart TV: Desconectando Wi Fi.")
    }
}
class Lampara (val tipo: String) : Encendible{
    override fun encender() {
        println("lampara $tipo: Luz encendida.")
    }

    override fun apagar() {
        println("lampara $tipo: Luz apagada.")
    }
}

fun main(){
    val tv = SmartTV("Samsung")
    val lampara = Lampara("de Escritorio")

    println("---Smart tv---")
    tv.encender()
    tv.conectar()
    tv.desconectar()
    tv.apagar()

    println ("\n ---Lampara---")
    lampara.encender()
    lampara.apagar()
}