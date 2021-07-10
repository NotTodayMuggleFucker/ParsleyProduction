package AppMusic

//Abstract Classes - Session 4

abstract class ShowTime {

    abstract val date: String
    abstract val city: String

    protected val serviceType = "Tickets"
    protected var cost = false
    protected var paidAmount = 0

    fun lowestPrice(numTickets: Int){
        if(cost){
            println("""¡Yesss! 
                       City: $city
                       Date: $date
                       Cost: $paidAmount""".trimMargin())
            return
        }
        val amount = getPrice(numTickets)
        if(amount==0){
            return
        }
        cost = true
        paidAmount = amount
        println("""Buy your tickets today! 
                       City: $city
                       Date: $date
                       Cost: $paidAmount""".trimMargin())
    }

    abstract fun quotePrice(numTickets:Int)

    //it get a numeric value from class
    protected abstract fun getPrice(numTickets: Int): Int
}
