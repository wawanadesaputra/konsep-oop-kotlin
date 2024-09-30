package exp04_Polymorphism_id.ac.polbeng.wawansaputra.test.kelas

open class MyBase {
    // Must use "open" modifier to allow child to override it
    open fun think() {
        println("Hey! I'm thinking")
    }
}

class MyDerived: MyBase() { // Inheritance happens using default constructor
    //Must use "override" modifier to override a base function
    override fun think() {
        println("I'm from Child")
    }
}

fun main() {
    val myBase = MyBase()
    myBase.think()
    var myDerived = MyDerived()
    myDerived.think()
}