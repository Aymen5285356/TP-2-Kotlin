class MaClasse {
    var x = 23
    var y = x + 5

    fun affiche() {
        println("x = $x")
        println("y = $y")
    }
}

fun main() {
    val obj1 = MaClasse()
    obj1.affiche()
}