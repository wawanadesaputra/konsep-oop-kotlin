package exp03_Enheritance_id.ac.polbeng.wawansaputra.test.kelas

open class Rectangle {
    open fun draw() {
        println("From Base Class Rectangle")
    }
}

interface Polygon {
    fun draw() { // Interface members are 'open' by default
      println("From interface Polygon")
    }
}

class Square(): Rectangle(), Polygon {
    // The Compiler requires draw() to be overridden:
    override fun draw() {
        super<Rectangle>.draw() // Call to Rectangle.draw()
        super<Polygon>.draw() // Call to Polygon.draw()
    }
}

fun main() {
    val square = Square()
    square.draw()
}