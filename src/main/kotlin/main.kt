fun main() {
    val likes = 61
    var personPeople: String;

    if ((likes % 10 == 1) && (likes % 100 != 11)) {
        personPeople = "человеку"
    } else {
        personPeople = "людям"
    }

    println("Понравилось $likes $personPeople")
}