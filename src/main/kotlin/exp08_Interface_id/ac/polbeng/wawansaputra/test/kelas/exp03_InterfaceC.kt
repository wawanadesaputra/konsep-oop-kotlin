package exp08_Interface_id.ac.polbeng.wawansaputra.test.kelas

interface X {
    fun demoX() {
        println("demoX function")
    }
    fun funcX()
}

interface Y {
    fun demoY() {
        println("demoY function")
    }
    fun funcY()
}

// This class implements X dan Y interfaces
class MyClasA: X, Y {
    override fun funcX() {
        println("Hello")
    }

    override fun funcY() {
        println("Hi")
    }
}

fun main() {
    val obj = MyClasA()
    obj.demoX()
    obj.demoY()
    obj.funcX()
    obj.funcY()

}