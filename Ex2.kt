package TP2

class Personne(var nom: String, var prenom: String, var adresse: String, var age: Int) {
    fun updateNom(nom: String) { this.nom = nom }
    fun updatePrenom(prenom: String) { this.prenom = prenom }
    fun updateAge(age: Int) { this.age = age }
    fun updateAdresse(adresse: String) { this.adresse = adresse }

    fun affiche() {
        println("Nom: $nom, Prenom: $prenom, Adresse: $adresse, Age: $age")
    }
}

fun main() {
    val p = Personne("Alami", "Youssef", "Rabat", 20)
    p.affiche()
    p.updateAge(21)
    p.affiche()
}