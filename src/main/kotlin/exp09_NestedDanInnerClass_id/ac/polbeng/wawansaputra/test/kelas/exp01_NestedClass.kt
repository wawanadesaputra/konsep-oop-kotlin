package exp09_NestedDanInnerClass_id.ac.polbeng.wawansaputra.test.kelas

class Outer {
    val a = "Outside Nested Class."
    class Nested {
        val b = "Inside Nested Class."
        fun callMe() = "Function call from inside Nested Class."
    }
}

fun main(args: Array<String>) {
    // Accesing member of Nested Class
    println(Outer.Nested().b)

    // Creating object of Nested Class
    val nested = Outer.Nested()
    println(nested.callMe())
}