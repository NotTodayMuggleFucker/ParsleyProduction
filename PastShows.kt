package AppMusic

//Data class- Session 4

data class PastShows(
    val place: String,
    val city: String,
    val style: String,
    val duration: Double
){
    var createdAt=""
}

//Companion object
class Free {

    init{
        println("See a show")
    }
    companion object PastShows {
        fun create(): Free = Free()
    }
}