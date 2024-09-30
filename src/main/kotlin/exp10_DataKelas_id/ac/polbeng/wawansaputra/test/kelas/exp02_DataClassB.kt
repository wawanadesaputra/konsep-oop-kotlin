package exp10_DataKelas_id.ac.polbeng.wawansaputra.test.kelas

fun main() {
    val wawan = Student("Wawan Saputra", 20)
    val newWawan= Student("Wawan Saputra", 20)
    val ashabal = Student("Ashabal Khairi", 20)
    if(wawan.equals(newWawan))
        println("Wawan is equal to newWawan.")
    else
        println("Wawan is not equal to newWawan.")

    if(wawan.equals(ashabal))
        println("Wawan is equal to Ashabal.")
    else
        println("Wawan is not equal to Ashabal.")

    println("HashCode of Wawan: ${wawan.hashCode()}")
    println("HashCode of newWawan: ${newWawan.hashCode()}")
    println("HashCode of Ashabal: ${ashabal.hashCode()}")
}