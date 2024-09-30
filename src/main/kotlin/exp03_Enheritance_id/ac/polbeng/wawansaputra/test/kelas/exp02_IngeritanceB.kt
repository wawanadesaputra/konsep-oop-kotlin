package exp03_Enheritance_id.ac.polbeng.wawansaputra.test.kelas

// Child class (Initialize the parent class)
class LaptopB : Computer {
    val batteryLife: Double

    // Calls super() to initialize the parent class
    constructor(name: String, brand: String, batteryLife: Double) : super(name, brand){
        this.batteryLife = batteryLife
    }

    // Calls another constructor (which calls super())
    constructor(name: String, brand: String): this(name, brand, 0.0){

    }
    fun info(){
        println("name: $name")
        println("Brand: $brand")
        println("Battery Life: $batteryLife")
    }
}

fun main() {
    val myLaptop = LaptopB("Asus Think Pad", "Asus")
    println(myLaptop.info())
}