package exp01_KelasDanObjek_id.ac.polbeng.wawansaputra.test.kelas

class exp05_InitOrder(name: String) {
    val firstProperty = "First Property: $name".also (:: println)
    init {
        println("First initializer block that prints ${name}")
    }
    val secondProperty = "Second property: ${name.length}".also(:: println)
    init{
        println("Second initializer block that prints ${name.length}")
    }
}

fun main() {
    val initOrder = exp05_InitOrder("RPL")
}