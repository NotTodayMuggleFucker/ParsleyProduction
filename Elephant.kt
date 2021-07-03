package AppMusic


//Getters, Setters, Visibility modifiers - Session 3


class Elephant (var songs: Int =1){ //vamos a dejar setear el número de vidas al iniciar el objeto Mario

    init {
        println("You're listening Elephant!") //name song!
    }



    private var state = "playing" //playing songs
        set(value){
            field = value
        }

        get() = field


    private var lives = 13 // Total songs


    //Show total songs
    private fun die(){
        lives--
        println("There are 13 songs to listen to!")
    }

    fun getLives(): String{
        return "$lives songs left on your Playlist"


    }


    //public modifier is redundant
    //collisionObj = event
    public fun collision(collisionObj: String){
        when(collisionObj){
            "Expectation" -> die()
            "Cause I'm a Man" -> state = "Mind Mischief"
            "Fire flower" -> state = "Expectation"
            else -> println("Do you want to listen to a different song?")

        }
    }
}

