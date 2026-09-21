interface Adoptable{
    fun adoptar(duenio:String)
}
open class Animal(val nombre: String)
class Perro(nombre:String) : Animal(nombre), Adoptable{
    override fun adoptar(duenio: String) {
        println(" $nombre fue adoptado por $duenio")
    }
}

class Leon(nombre: String): Animal(nombre)

fun main(){
    val animales: List<Animal> = listOf(
        Perro("Poroto"),
        Leon("Shiva")
    )
    for(animal in animales){
        if(animal is Adoptable){
            animal.adoptar("Noah")
        } else{
            println("${animal.nombre} es un animal salvaje: No se puede adoptar.")
        }
    }
}