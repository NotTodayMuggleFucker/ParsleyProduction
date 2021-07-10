package AppMusic

//Abstract Classes - Session 4

    open class Tour (override val city:String): ShowTime(){
        override val date = "November 25"

        //mapof : Music Concert Tickets
        protected val fees = mapOf(
            "Miami" to 400,
            "Austin" to 250,
            "New York" to 450,
            "Atlanta" to 320,
            "Las Vegas" to 500
        )

        override fun getPrice(numTickets: Int): Int {
            val fee = fees[city] //You get a price according the section
            return if (fee==null) 0 else fee*numTickets //Appear O if there isn't price
        }

        override fun quotePrice(numTickets: Int) {
            val price = getPrice(numTickets)
            if(price==0){ //if there isn't a city, the user will see a message
                println("Sorry, sold out!")
            } else{
                println("Tour 2022 $city / Your tickets \$$price") //You can see the Tour
            }
        }
    }
