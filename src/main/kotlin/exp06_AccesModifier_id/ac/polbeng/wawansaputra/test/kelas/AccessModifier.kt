package exp06_AccesModifier_id.ac.polbeng.wawansaputra.test.kelas

import java.lang.invoke.MethodHandle

open class Mahasiswa(var nama: String, var nrp: Int) {
    open fun info() {
        println(nama +'\n'+ nrp);
    }
    override fun toString():  String {
        return "Mahasiswa{nama= $nama, nrp= $nrp}"
    }
}

class KetuaHima(nama:String, nrp: Int, val jurusan: String): Mahasiswa(nama, nrp) {
    override fun info() {
        println(nama +'\n'+ jurusan)
    }
}

fun main() {
    val wawan = Mahasiswa("Wawan Saputra", 630422141)
    val ashabal = KetuaHima("Ashabal Khairi", 630422142, "Teknik Informatika")
    println(ashabal.toString());

    println()
    ashabal.info()
    println("Jenis Kelas = " + ashabal.javaClass.simpleName)

    println()
    wawan.info()
    println("Jenis Kelas = " + wawan.javaClass.simpleName)

    val ridwan = KetuaHima("Ridwan Azhari", 630422143, "Teknik Eleltro")
    println()
    ridwan.info()
    println("Jenis Kelas = " + ridwan.javaClass.simpleName)
}
