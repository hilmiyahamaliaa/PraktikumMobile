fun main() {
    println("Input Bilangan : ")
    val x = readLine()!!.toInt()
    var y = 0
    val i : Int = x
    var angka = i
    while(y<5){
        angka += i
        if(angka%2==0 || angka%3==0) {
            print("$angka ")
            y++
        }
    }
}
