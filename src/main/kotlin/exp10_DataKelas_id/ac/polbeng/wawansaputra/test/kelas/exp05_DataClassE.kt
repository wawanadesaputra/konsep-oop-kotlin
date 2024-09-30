package exp10_DataKelas_id.ac.polbeng.wawansaputra.test.kelas

fun main() {
    val wawan = Student("Wawan", 20)
    // Destructing declaration
    val(name, age) = wawan
    println("Name = $name")
    println("Age = $age")
}