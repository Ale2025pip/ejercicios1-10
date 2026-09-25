package ejercicio5

class Producto(val nombre: String, val precio: Double){
    var precioFinal: Double = precio
    constructor(nombre: String, precio:Double, descuento:Int) : this(nombre, precio){
        precioFinal = precio -(precio* descuento /100)
    }

    fun ver() {
        println("Producto: $nombre")
        println("Precio: $precio")
        println("Precio final: $precioFinal")
        println(" ")
    }
}
fun main(){
    var producto1 = Producto("Arroz", 1500.0)
    var producto2 = Producto("Harina", 1200.0, 10)

    producto1.ver()
    producto2.ver()
}