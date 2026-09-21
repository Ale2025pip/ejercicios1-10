interface Notificable{
    fun enviarNotificacion(mensaje: String)
}

class Email(val dirEmail : String) : Notificable{
    override fun enviarNotificacion(mensaje: String) {
        println("Email a [$dirEmail]: $mensaje")
    }
}
class SMS(val numTel: String): Notificable{
    override fun enviarNotificacion(mensaje: String) {
        println("Enviando SMS a: [$numTel]: $mensaje ")
    }
}
class Push(val usuId: String) : Notificable{
    override fun enviarNotificacion(mensaje: String) {
        println("Enviando notificacion push a usuario [$usuId]:[$mensaje]")
    }
}

fun notificarATodos (canales : List<Notificable>, mensaje: String){
    for(canal in canales){
        canal.enviarNotificacion(mensaje)
    }
}

fun main(){
    val canales: List<Notificable> = listOf(
        Email("pepe@gmail.com"),
        SMS("+5491103034561"),
        Push("USR_0303456")
    )
    notificarATodos(canales, "¡Hola Mundo!")
}
