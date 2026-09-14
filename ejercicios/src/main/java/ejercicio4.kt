class Libro (val titulo:String, val autor: String, val paginas: Int){
    fun abrir() {println("Abriendo $titulo")}
    fun cerrar() {println("Cerrando $titulo")}

}

fun main(){
    val libro1= Libro("1984", "George Orwell", 300)
    val libro2= Libro("Veinte mil leguas de vieje submarino", "Julio Verne", 450)
    val libro3= Libro("Los tres mosqueteros", "Alejandro Dumas", 500)

    libro1.abrir()
    libro1.cerrar()

    libro2.abrir()
    libro2.cerrar()

    libro3.abrir()
    libro3.cerrar()
}
