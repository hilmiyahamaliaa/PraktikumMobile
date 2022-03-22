fun main() {
    println("Input Bilangan : ")
    val x = readLine()!!.toInt()
    val i : Int = x
    for (i in 1..8){
        val angka = x*i
        if(angka%2==0 || angka%3==0) {
            print("$angka ")
        }
    }
}