class Producto(val nombre: String, val precio: Double){
    var precioFinal: Double = precio

    constructor(nombre: String, precio: Double, descuento: Int): this(nombre,precio){
        precioFinal = precio - (precio*descuento /100 )
    }
    fun ver(){
        println("Producto: $nombre")
        println("Precio: $precio")
        println("Precio final: $precioFinal")
        println(" ")
    }
}
class Carrito{
    private val listaProductos: MutableList<Producto> = mutableListOf()

    fun agregar(producto: Producto){
        listaProductos.add(producto)
        println("Agregado : ${producto.nombre}")
    }
    fun eliminar(nombre: String){
        val seElimino = listaProductos.removeIf { it.nombre.equals(nombre, ignoreCase = true) }
        if (seElimino){
            println("Eliminado: $nombre")
        } else{
            println("No se encontro: $nombre")
        }
    }
    fun calcularTotal(): Double{
        var total= 0.0
        for(p in listaProductos){
            total += p.precioFinal
        }
        return total
    }
    fun mostrarProductos(){
        println("Productos del carrito")
        for(p in listaProductos){
            p.ver()
        }
    }
}
fun main(){
    val carrito = Carrito()

    val p1= Producto("Arroz", 1500.0)
    val p2= Producto("Harina", 1200.0, 10)
    val p3= Producto("Aceite", 3500.0, 15)

    carrito.agregar(p1)
    carrito.agregar(p2)
    carrito.agregar(p3)

    println()
    carrito.eliminar("Harina")
    carrito.mostrarProductos()

    val total = carrito.calcularTotal()
    println("Total final compra: $$total")
}