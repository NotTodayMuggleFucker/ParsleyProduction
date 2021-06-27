package AppMusic

import java.awt.event.ActionEvent
import javax.swing.JButton


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

   //Utilizando named arguments -clase diferente para el año
   //val currents = Album ("Tame Impala","Alternative, Indie, Psychedelic")

   println()
   //Utilizando named arguments /Album y año diferentes
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





