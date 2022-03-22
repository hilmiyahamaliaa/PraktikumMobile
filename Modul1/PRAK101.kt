fun main() {
    print("Waktu Sekarang : ")
    val waktu = readLine()
    print("Nama Anda : ")
    val nama = readLine()
    print("Umur Anda : ")
    val umur = readLine()
    fun randomsuhu (start : Int, end : Int) : Double{
        require(start<end) {"Invalid range {$start, $end}"}
        return end + Math.random()*(start-end)
    }
    print("Suhu Tubuh Anda : ")
    val start = 35
    val end = 37
    val suhu = randomsuhu(start, end)

    println("Selamat $waktu, $nama. Umur Anda $umur Tahun. Suhu Tubuh Anda %.1f derajat Celcius".format(suhu))
}