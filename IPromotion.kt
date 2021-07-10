package AppMusic

// Interfaces - Session 4

interface IPromotion {
    val discount: Int //discount
    val typeDiscount: Int //amount

    fun getDiscountPrice(amount:Int): Int{ //Get a price with discount
        return if(typeDiscount == 0) { //0 percentage/amount
            (amount * (100-discount))/100
        } else{ //real amount
            amount - discount
        }
    }
}
