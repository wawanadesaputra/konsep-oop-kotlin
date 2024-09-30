package exp10_DataKelas_id.ac.polbeng.wawansaputra.test.kelas

fun main() {
    val wawan = Student("Wawan", 20)
    // Destructing declaration with componentN() method
    val name = wawan.component1()
    val age = wawan.component2()
    println("Name = $name")
    println("Age = $age")
}