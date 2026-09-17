package TP2

open class Vehicule(val marque: String, val modele: String) {
    open fun afficherDetails() {
        println("Marque: $marque, Modele: $modele")
    }

    open fun seDeplacer() {
        println("Vehicule se deplace")
    }
}

class Avion(marque: String, modele: String, val ailes: Int, val nbrRoues: Int) : Vehicule(marque, modele) {
    override fun seDeplacer() {
        println("$marque $modele vole")
    }
}

class Voiture(marque: String, modele: String, val annee: Int, val nbrRoues: Int) : Vehicule(marque, modele) {
    override fun seDeplacer() {
        println("$marque $modele roule")
    }
}

class Velo(marque: String, modele: String, val nbrRoues: Int) : Vehicule(marque, modele) {
    override fun seDeplacer() {
        println("$marque $modele roule")
    }
}

fun main() {
    val avions = mutableListOf(Avion("Boeing", "737", 2, 3), Avion("Airbus", "A320", 2, 3))
    val voitures = mutableListOf(Voiture("Renault", "Clio", 2022, 4), Voiture("Dacia", "Logan", 2021, 4))
    val velos = mutableListOf(Velo("BMX", "X1", 2), Velo("VTT", "X2", 2))

    println("Liste des avions:")
    for (a in avions) { a.afficherDetails(); a.seDeplacer() }

    println("Liste des voitures:")
    for (v in voitures) { v.afficherDetails(); v.seDeplacer() }

    println("Liste des velos:")
    for (v in velos) { v.afficherDetails(); v.seDeplacer() }
}