package exp01_KelasDanObjek_id.ac.polbeng.wawansaputra.test.kelas
class exp08_PersonC (var firstName: String, var lastName: String, var age: Int)
fun main() {
    val wawan = exp08_PersonC("Wawan", "Saputra", 20)
    println("Name: ${wawan.firstName} ${wawan.lastName}")
    println("Age: ${wawan.age}")
}