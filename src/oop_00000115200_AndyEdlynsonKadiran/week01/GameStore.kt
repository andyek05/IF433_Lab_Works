package oop_00000115200_AndyEdlynsonKadiran.week01

fun main(args: Array<String>) {
    val gameTitle: String = "Call of Duty"
    val price: Int = 400000
    val userNote: String? = null

    val discount = calculateDiscount(price)
    val finalPrice = price - discount

    println($"Calculated Discounted Price of Game is $${calculateDiscount(price)}")

    printReceipt(title = gameTitle, finalPrice = finalPrice, note = userNote)
}

fun calculateDiscount(price: Int) = if (price > 500000) (price * 0.2).toInt() else (price * 0.1).toInt()

fun printReceipt(title: String, finalPrice: Int, note: String?) {
    println("===== RECEIPT =====")
    println("Game Title : $title")
    println($$"Final Price: $$$finalPrice")
    println("Note       : ${note ?: "Tidak ada catatan"}")
}

