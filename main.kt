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

   //Named arguments // Year 2012
   //val currents = Album ("Tame Impala","Alternative, Indie, Psychedelic")

   println()
   //Named arguments // Year 2015
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





