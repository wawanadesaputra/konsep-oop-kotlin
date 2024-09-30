package exp01_KelasDanObjek_id.ac.polbeng.wawansaputra.test.kelas

class exp10_PersonE {
    var firstName: String
    var lastName: String
    var age: Int =20
    constructor(_firstName: String, _lastName: String){
        firstName = _firstName
        lastName = _lastName
    }
    constructor(_firstName: String, _lastName: String, _age: Int): this(_firstName, _lastName) {
        age = _age
    }
    fun cetakInfo(){
        println("Name: ${firstName} ${lastName}")
        println("Age: ${age}")
    }
}

fun main() {
    val ashabal = exp10_PersonE("Ashabal", "Khairi")
    ashabal.cetakInfo()
    println()
    val wawan = exp10_PersonE("Wawan", "Saputra", 20)
    wawan.cetakInfo()
}