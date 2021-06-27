package AppMusic

<<<<<<< HEAD
//Class //Object
=======
//ClassObject
>>>>>>> 11cc812004b6b97a57a7602e38f0d1d5db77af55


class Album (band: String, genre: String, year: String = "2015") {

    init{
        println("""Your choose a song from:
            band: $band
            genre: $genre
            year: $year""")
    }

    constructor(band: String, genre: String, year: String, lp: String): this(band,genre,year){
        this.lp = lp
        println()
        println("The LP is: ${this.lp}")
    }

    var lp = ""
    var playing = false



}



