package exp01_KelasDanObjek_id.ac.polbeng.wawansaputra.test.kelas

class exp06_PersonA (_firstName: String, _lastName: String, _age: Int) {
    var firstName: String
    var lastName: String
    var age: Int
    init {
        firstName = _firstName
        lastName = _lastName
        age = _age
    }
}

fun main() {
    val wawan = exp06_PersonA("Wawan", "Saputra", 20)
    println("Name: ${wawan.firstName} ${wawan.lastName}")
    println("Age: ${wawan.age}")
}