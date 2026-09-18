interface Imprimible{
    fun imprimir()
}

class Factura (val numero: Int, val total: Double) : Imprimible{
    override fun imprimir(){
        println("Imprimiendo factura n° $numero por un total de $$total")
    }
}

class Recibo(val concepto: String, val monto: Double) : Imprimible{
    override fun imprimir() {
        println ("Imprimiendo recibo de '$concepto' por $$monto")
    }
}

fun main() {
    val documentos: List<Imprimible> = listOf(
        Factura(1050,15800.60),
        Recibo ("Servicio de Internet", 32000.00),
        Factura(1051, 9000.0)
    )
    for(doc in documentos){
        doc.imprimir()
    }
}
