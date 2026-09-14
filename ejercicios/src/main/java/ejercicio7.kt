class CuentaBancaria( val titular: String, saldo: Double){

    var dinero: Double = saldo
        set (valor){
            if (valor < 0){
                field = 0.0
                println("Saldo invalido")
            } else{
                field = valor
            }
        }

}

fun main(){
    val cuenta = CuentaBancaria( "Pedro" ,5000.0)
    println("Titular: ${cuenta.titular} - Saldo: ${cuenta.dinero}")

    cuenta.dinero = 7000.0
    println("Saldo valido: ${cuenta.dinero}")

    cuenta.dinero= -15000.0
    println("Saldo : ${cuenta.dinero}")
}