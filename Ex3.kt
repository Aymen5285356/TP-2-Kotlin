package TP2

class Car(var marque: String, var modele: String, var couleur: String, var kilometrage: Int) {
    fun updateMarque(marque: String) { this.marque = marque }
    fun updateModele(modele: String) { this.modele = modele }
    fun updateCouleur(couleur: String) { this.couleur = couleur }
    fun updateKilometrage(kilometrage: Int) { this.kilometrage = kilometrage }

    fun affiche() {
        println("Marque: $marque, Modele: $modele, Couleur: $couleur, Kilometrage: $kilometrage")
    }
}

fun main() {
    val c = Car("Toyota", "Yaris", "Rouge", 15000)
    c.affiche()
    c.updateKilometrage(15500)
    c.affiche()
}