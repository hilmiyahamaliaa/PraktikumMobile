class PRAK104 {
    val motor : String = "Motor Scoopy"
    val kecepatan : Int = 30
    fun melaju() = println("$motor melaju dengan kecepatan $kecepatan km/jam")
    val arah : String = "kanan"
    fun belok() = println("$motor itu berbelok ke arah $arah")
}
fun main(){
    val motor = PRAK104()
    motor.melaju()
    motor.belok()
}