fun rumus(x:Int): Int {
    var hasil = 2 * (x * x) + (5 * x) - 8
    return hasil
}
fun main(){
    println("Nilai x = ")
    var nilai = readLine()!!.toInt()
    println(rumus(nilai))
}