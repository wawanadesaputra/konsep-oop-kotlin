package exp03_Enheritance_id.ac.polbeng.wawansaputra.test.kelas

// Parent class
open class Computer(val name: String, val brand: String) {

}

// Child class (Initializes the parent class)
class Laptop(name: String, brand: String, val batteryLife: Double) : Computer(name, brand) {
    fun info() {
        println("name: $name")
        println("Brand: $brand")
        println("Battery Life: $batteryLife")
    }
}

fun main() {
    val myLaptop = Laptop("Acer Aspire 4738", "Acer", 2.5)
    myLaptop.info()
}