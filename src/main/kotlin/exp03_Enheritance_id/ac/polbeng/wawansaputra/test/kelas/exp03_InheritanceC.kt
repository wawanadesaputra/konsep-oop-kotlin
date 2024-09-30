package exp03_Enheritance_id.ac.polbeng.wawansaputra.test.kelas

open class Teacher {
    // Must use "open" modifier to allow child classes to override it
    open fun teach() {
        println("Teaching...")
    }
    fun info(){
        println("I'm a Teacher.")
    }
}
class MathsTeacher : Teacher(){
    // Must user "override" modifier to override a base class function
    override fun teach() {
        println("Teaching Maths...")
    }
}

fun main() {
    val teacher = Teacher()
    val mathsTeacher = MathsTeacher()
    mathsTeacher.info()
    teacher.teach()
    mathsTeacher.teach()
}