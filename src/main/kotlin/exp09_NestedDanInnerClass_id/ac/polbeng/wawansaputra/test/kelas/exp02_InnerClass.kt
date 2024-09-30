package exp09_NestedDanInnerClass_id.ac.polbeng.wawansaputra.test.kelas

class OuterA {
    val a = "Outside Nested Class."
    inner class Inner {
        fun callMe() = a
    }
}

fun main() {
    val outer = OuterA()
    println("Using outer object: ${outer.Inner().callMe()}")
    val inner = OuterA().Inner()
    println("Using outer object: ${inner.callMe()}")
}