package exp02_Enkapsulasi_id.ac.polbeng.wawansaputra.test.kelas

import java.lang.IllegalArgumentException

class EmployeeA(_id: Int, _name: String, _age: Int) {
    val id: Int = _id
        get() = field

    var name: String = _name
        get() {
            return field.toUpperCase()
        }
        set(value) {
            field = value
        }

    var age: Int = _age
        get() = field
        set(value) {
            field = if (value > 0) value else throw IllegalArgumentException("Age must be greater than zero")
        }
}

fun main() {
    val emp = EmployeeA(1101, "Wawan Saputra", 20)
    println("Id: ${emp.id}, Nama: ${emp.name}, Umur: ${emp.age}")
    emp.age = 2
}
