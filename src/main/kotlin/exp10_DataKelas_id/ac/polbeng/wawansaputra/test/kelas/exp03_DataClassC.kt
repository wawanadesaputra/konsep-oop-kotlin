package exp10_DataKelas_id.ac.polbeng.wawansaputra.test.kelas

fun main() {
    val wawan = Student("Wawan Saputra", 20)
    val badu = wawan.copy("Badu")
    if (wawan.equals(badu))
        println("Wawan is equal to Badu.")
    else
        println("Wawan is not equal to Badu.")
    println("HashCode of Wawan: ${wawan.hashCode()}")
    println("HashCode of Badu: ${wawan.hashCode()}")
}