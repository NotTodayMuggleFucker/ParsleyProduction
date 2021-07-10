package AppMusic

// Interfaces - Session 4

class ShowTimeBoGo(city: String) : Tour(city),IPromotion {
    override  val discount = 50 // it means 50%
    override val typeDiscount = 0 //0 = percentage, 1 = amount

    override fun getPrice(numTickets: Int): Int {
        val amount = super.getPrice(numTickets)
        return if (amount == 0) 0 else getDiscountPrice(amount)
    }
}