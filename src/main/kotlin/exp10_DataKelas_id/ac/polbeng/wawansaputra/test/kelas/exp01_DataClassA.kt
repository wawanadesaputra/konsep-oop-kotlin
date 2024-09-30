package exp10_DataKelas_id.ac.polbeng.wawansaputra.test.kelas

data class Student(val name: String, val age: Int)

fun main() {
    val wawan = Student("Wawan Saputra", 20)
    val ashabal= Student("Ashabal Khairi", 20)
    println("Student Name is: ${wawan.name}")
    println("Student Age is: ${wawan.age}")
    println("Student Name is: ${ashabal.name}")
    println("Student Age is: ${ashabal.age}")

}