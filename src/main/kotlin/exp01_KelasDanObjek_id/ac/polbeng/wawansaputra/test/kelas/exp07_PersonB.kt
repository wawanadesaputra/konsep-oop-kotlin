package exp01_KelasDanObjek_id.ac.polbeng.wawansaputra.test.kelas

class exp07_PersonB (_firstName: String, _lastName: String, _age: Int) {
    var firstName:String = _firstName
    var lastName:String = _lastName
    var age:Int = _age
}

fun main() {
    val wawan = exp07_PersonB("Wawan", "Saputra", 20)
    println("Name: ${wawan.firstName} ${wawan.lastName}")
    println("Age: ${wawan.age}")
}