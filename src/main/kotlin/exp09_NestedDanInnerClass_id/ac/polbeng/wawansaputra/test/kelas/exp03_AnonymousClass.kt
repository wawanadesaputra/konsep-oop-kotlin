package exp09_NestedDanInnerClass_id.ac.polbeng.wawansaputra.test.kelas

fun main() {
    // Creating an instance of the interface
    var programer: Human = object: Human {
        override fun think() { // overriding the think method
            print("I'm an example of Anonymous Inner Class ")
        }
    }
    programer.think()
}

interface Human {
    fun think()
}