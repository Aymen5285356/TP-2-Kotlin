package TP2

abstract class Forme(val nom: String) {
    abstract fun surface(): Double
    abstract fun perimetre(): Double

    fun afficherDetails() {
        println("$nom -> Surface: ${surface()}, Perimetre: ${perimetre()}")
    }
}

class Carre(val cote: Double) : Forme("Carre") {
    override fun surface() = cote * cote
    override fun perimetre() = 4 * cote
}

class Rectangle(val longueur: Double, val largeur: Double) : Forme("Rectangle") {
    override fun surface() = longueur * largeur
    override fun perimetre() = 2 * (longueur + largeur)
}

class Cercle(val rayon: Double) : Forme("Cercle") {
    override fun surface() = Math.PI * rayon * rayon
    override fun perimetre() = 2 * Math.PI * rayon
}

fun main() {
    val formes = listOf(Carre(4.0), Rectangle(5.0, 3.0), Cercle(2.0))
    for (f in formes) f.afficherDetails()
}