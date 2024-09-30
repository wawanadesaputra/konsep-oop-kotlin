package exp08_Interface_id.ac.polbeng.wawansaputra.test.kelas

interface A {
    fun demo() {
        println("From interface A")
    }
}

interface B {
    fun demo() {
        println("From interface B")
    }
}

// This class implements X dan Y interface
class MyClassB: A, B {
    override fun demo() {
        super<A>.demo()
        super<B>.demo()
    }
}

fun main() {
    val obj = MyClassB()
    obj.demo()
}