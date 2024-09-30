package exp01_KelasDanObjek_id.ac.polbeng.wawansaputra.test.kelas

class exp11_PersonF (val _firstName: String, val _lastName: String) {
    init {
        println("Sedang inisialisasi wak!")
    }
    constructor(_firstName: String, _lastName: String, _age: Int): this(_firstName, _lastName) {
        println("Name: $_firstName $_lastName")
        println("Age: $_age")
        println()
    }
    constructor(_firstName: String, _lastName: String, _country: String): this(_firstName, _lastName) {
        println("Name: $_firstName $_lastName")
        println("Country: $_country")
        println()
    }
    constructor(_firstName: String, _lastName: String, _age: Int,_country: String): this(_firstName, _lastName, _age) {
        println("Name: $_firstName $_lastName")
        println("Age: $_age")
        println("Country: $_country")
        println()
    }
}
fun main() {
    val ashabal = exp11_PersonF("Ashabal", "Khairi")
    val wawan = exp11_PersonF("Wawan", "Saputra", 20)
    val eva = exp11_PersonF("Eva", "Lestari", "Indonesia")
    val khalisa = exp11_PersonF("Khalisa", "Eshal", 5, "Indonesia")
}