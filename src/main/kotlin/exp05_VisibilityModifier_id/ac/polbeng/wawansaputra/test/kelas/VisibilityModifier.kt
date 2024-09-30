package exp05_VisibilityModifier_id.ac.polbeng.wawansaputra.test.kelas

// Private
private class privateExample {
    private val i = 1
    private fun doSomething() {
        println("Welcome to private access!")
        println("Private Access: $i")
    }
    fun callDoSomething(){
        doSomething();
    }
}

// Protected
open class C() {
    protected val i = 1
}
class D : C() {
    fun getValue(): Int {
        println("Welcome to Protected Access!")
        return i
    }
}

// Internal
class internalExample {
    internal val i = 1
    internal fun doSomething() {
        println("Welcome to Internal Access!")
        println("Internal Access: $i")
    }
}

// Public
class publicExample {
    val i = 1
    fun doSomething() {
        println("Welcome to Public Access!")
        println("Public Access: $i")
    }
}

fun main() {
    val objPrivate = privateExample()
    objPrivate.callDoSomething()
    val objProtected = D()
    println(println("Protected Access: ${objProtected.getValue()}"))
    val objInternal = internalExample()
    objInternal.doSomething()
    val objPublic = publicExample()
    objPublic.doSomething()
}