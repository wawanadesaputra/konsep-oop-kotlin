package exp01_KelasDanObjek_id.ac.polbeng.wawansaputra.test.kelas
class exp09_PersonD {
    var firstName: String
    var lastName: String
    var age: Int
    constructor(_firstName: String, _lastName: String, _age: Int) {
        firstName = _firstName
        lastName = _lastName
        age = _age
    }
}

fun main() {
    val wawan = exp09_PersonD("Wawan", "Saputra", 20)
    println("Name: ${wawan.firstName} ${wawan.lastName}")
    println("Age: ${wawan.age}")
}