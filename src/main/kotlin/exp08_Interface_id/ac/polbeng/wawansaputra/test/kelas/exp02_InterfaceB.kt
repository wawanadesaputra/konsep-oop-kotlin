package exp08_Interface_id.ac.polbeng.wawansaputra.test.kelas

interface Named {
    val name: String
}

interface Person: Named {
    val firstName: String
    val lastName: String
    override val name: String get() = "$firstName $lastName"
}

data class EmployeeB (
    // Implementing 'name' is not required
    override val firstName: String, override val lastName: String, val position: String): Person

fun main() {
    val pegawai = EmployeeB("Wawan", "Saputra", "Programer")
    println(pegawai.name)
}
