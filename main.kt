package AppMusic

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking



fun main(args:Array<String> ) = runBlocking {


   println("Playlist (type Tame Impala):  ")
   val playList = readLine()
   println()

   val buyJob = launch {
      var percentage = 0

      while (percentage<100){
         println("loading playlist: $percentage%")
         delay(500)
         percentage+=10

      }
      println("Playlist!")
   }

   delay(2000)
   buyJob.cancel()

   println()

   println("PLAYLIST")
   songs.forEach { println(it) }
   println()

   println("Enter your song:  ")
   val stringInput = readLine()
   print("Your song: $stringInput !!")

   println()
   println()




   //Class,Object,Constructor
   val myAlbum = Album("Tame Impala","Alternative, Indie, Psychedelic","2012", "Lonerism")

   println()
   println("--------------")

   println()
   //named arguments - Example:2012
   //val currents = Album ("Tame Impala","Alternative, Indie, Psychedelic")

   //named arguments /Example: 2015
   val currents = Album("Tame Impala","Alternative, Indie, Psychedelic","2015", "Currents")

   println()
   println("--------------")

   val artist = Artist()
   artist.getTurn()
   artist.turnOn()
   artist.getTurn()


   println()
   println("--------------")

      //Getters, Setters, Visibility modifiers
   var elephant = Elephant()
   println("You have ${elephant.getSongs()}")
    println()
    println("--------------")

   println("Choose another song:  ")
   val another = readLine()
   print("Your song: $another !!")
   println()
   println()

   for(i in 1..12){ //songs to listen to..
      elephant.collision("Expectation")
      println("Now ${elephant.getSongs()}")
   }

   println()
   println("--------------")

   ////Object-Oriented Programming II
   //val nextSong = Lucidity("Lucidity",2)

   //Polymorphism & Inheritance
   val nextSong = Expectation("Expectation",2)
   nextSong.collision("Elephant") // collision - show a different song
   nextSong.collision("Lucidity") // collision - show a different song

   println()
   println("--------------")

   //Polymorphism
   val nextSong2 = LetItHappen()
   nextSong2.collision("Lucidity")

   println()
   println("--------------")

   println("Are you looking for tickets for a show?  (type Yes):  ")
   val line = readLine()
   println("Your choose: $line")

   println("How Many? (type 4):")
   val number = Integer.valueOf(readLine())
   println("Your choose: $number tickets" )

   println("What's your city?  (type Austin):  ")
   val city = readLine()
   println("Your choose: $city")

   println()

   //Find your city to get tickets: Miami, Austin, New York, Atlanta, Las Vegas
   val tourMiami = Tour ("Austin")
   tourMiami.quotePrice(4)//Try with 3, 4, 5..
   tourMiami.lowestPrice(1)

   println()
   println("--------------")

   print("Get a promo  (type BoGo50%):  ")
   val string = readLine()
   print("You got a : $string")

   println()
   println()

   //Buy One Get One 50%
   println("Buy One Get One 50%")
   val showTimeBoGo = ShowTimeBoGo("Austin")
   showTimeBoGo.quotePrice(4)//Try with 3, 4, 5..
   showTimeBoGo.lowestPrice(1)


   println("--------------")


   print("Get tickets for your city: (What's your city?)")
   val noToday = readLine()
   print(" :(  :(  $noToday ")

   println()
   // This city hasn't tickets
   val soldOut = ShowTimeBoGo("Chicago")
   soldOut.quotePrice(1)


   println()
   println("--------------")

   println("Check the last shows?  (type Yes):  ")
   val lastEvents = readLine()
   println("Last Shows:")

   //statement
   val lollapalooza = PastShows ("Lollapalooza","Chicago" ,"Festival", 108.07 )
   val coachella= lollapalooza.copy (place = "Coachella",city="Indio CA",duration=92.02,)
   println("""
     Lollapalooza: $lollapalooza
     Coachella: $coachella
 """.trimIndent())

   //println("Amazing show in ${coachella.city}: ${coachella.createdAt}")

   //println(lollapalooza)

   //println(coachella.city)

   lollapalooza.createdAt = "2019"
   println("Last show in: ${lollapalooza.createdAt}")

   println(lollapalooza.component2())

   //Destructuring
   val (place,style,duration) = lollapalooza
   println("Did you know? $place started as a touring event in 1991 ")

   //Companion object
   //val seeShows = Free.create()


}





