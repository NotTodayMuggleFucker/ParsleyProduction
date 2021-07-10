package AppMusic


//Coroutines / Suspend functions y Jobs - Session 8

import kotlinx.coroutines.delay



suspend fun getInventary(productId: Int): Int {
    println("Search songs...")
    delay(2000)
    val stock = (0..999).random()
   println("We found this song on your playlist: $stock")
   return stock
}







