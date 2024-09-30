package exp01_KelasDanObjek_id.ac.polbeng.wawansaputra.test.kelas

fun main() {
    val greeter = exp03_Greeter()
    greeter.greet()
    greeter.text = "Hi"
    greeter.greet("Anton")
    greeter.greet("Budi")
    greeter.text = "Hello Programer"
    println(greeter.with_ret_val("Dono"))
}