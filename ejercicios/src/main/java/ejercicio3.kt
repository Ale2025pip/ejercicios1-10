fun main(){
    val nombres = mutableListOf<String>()
    while (true) {
    print("ingresa un nombre o fin para terminar: ")
    val entrada = readLine() ?:""
        if (entrada.lowercase () == "fin") break
        if (entrada.isNotBlank()) nombres.add(entrada)
    }
    println("Cantidad: ${nombres.size}")
    println("Lista ordenada: ${nombres.sorted()}")
}
