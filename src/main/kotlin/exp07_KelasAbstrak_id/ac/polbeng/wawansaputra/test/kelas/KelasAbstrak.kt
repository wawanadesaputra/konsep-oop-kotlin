package exp07_KelasAbstrak_id.ac.polbeng.wawansaputra.test.kelas

abstract class Vehicle(val name: String, val color: String, val weight: Double) { // Concreate (Non Abstract) Properties

    //Abstract property (Must be overidden by subclasses)
    abstract  var maxSpeed: Double

    //Abstract Methods (Must be implemented by subsclasses)
    abstract fun start()
    abstract fun stop()
    abstract fun sound()

    // Concreate (Non abstract) Method
    fun displayDetails() {
        println("Name: $name, Color $color, Weight $weight, Max Speed: $maxSpeed")
    }
}

class Car(name: String, color: String, weight: Double, override var maxSpeed: Double) : Vehicle(name, color, weight) {
    override fun start() {
        // Code to stop a car
        println("Car Started")
    }

    override fun stop() {
        // Code to stop a car
        println("Car Stopped")
    }

    override fun sound() {
        // Code to stop a car
        println("Brum...brum...brum!")
    }
}

class Motorcycle(name: String, color: String, weight: Double, override var maxSpeed: Double): Vehicle(name, color, weight) {

    override fun start() {
        // Code to stop a Motorcycle
        println("Bike Started")
    }

    override fun stop() {
        // Code to stop a Motorcycle
        println("Bike Stopped")
    }

    override fun sound() {
        // Code to stop a Motorcycle
        println("Preng...preng...preng!")
    }
}

fun main() {
    val car = Car("Ferrari 812 Superfast", "Red", 1525.0, 339.60)
    val motorCycle = Motorcycle("Ducati 1098's", "Red", 173.0, 271.0)

    car.displayDetails()
    motorCycle.displayDetails()

    car.start()
    car.sound()
    car.stop()
    motorCycle.start()
    motorCycle.sound()
    motorCycle.stop()
}