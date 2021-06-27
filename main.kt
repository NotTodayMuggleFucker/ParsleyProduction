package AppMusic




fun main() {




   println("PLAYLIST")
   println()
   songs.forEach { println(it) }
   println()
   println()


   print("Enter your song: ")
   val stringInput = readLine()
   println()
   println()


   val myAlbum = Album("Tame Impala","Alternative, Indie, Psychedelic","2012", "Lonerism")

<<<<<<< HEAD
   //Named arguments // Year 2012
   //val currents = Album ("Tame Impala","Alternative, Indie, Psychedelic")

   println()
   //Named arguments // Year 2015
=======
   //named arguments - Example:2012
   //val currents = Album ("Tame Impala","Alternative, Indie, Psychedelic")

   println()
   //named arguments /Example: 2015
>>>>>>> 11cc812004b6b97a57a7602e38f0d1d5db77af55
   val currents = Album("Tame Impala","Alternative, Indie, Psychedelic","2015", "Currents")


   println()
   println()

   val artist = Artist()
   artist.getTurn()
   artist.turnOn()
   artist.getTurn()

   println()
   println()




}





