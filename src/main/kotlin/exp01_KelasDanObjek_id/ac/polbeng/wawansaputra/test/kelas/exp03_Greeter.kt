package exp01_KelasDanObjek_id.ac.polbeng.wawansaputra.test.kelas

class exp03_Greeter {
    var text: String = ""
    fun greet() {
        println("Hello object world!")
    }
    fun greet(name: String) {
        println("$text $name")
    }
    fun with_ret_val(name:String): String {
        return "$text $name"
    }
}