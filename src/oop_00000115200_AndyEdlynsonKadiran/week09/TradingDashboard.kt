package oop_00000115200_AndyEdlynsonKadiran.week09

fun main() {

    val tradeHistory = listOf(
        TradeLog("BTCUSDT", "LONG", 20, 15.5, "CLOSED"),   // Win
        TradeLog("ETHUSDT", "SHORT", 10, -5.2, "CLOSED"),  // Loss
        TradeLog("BTCUSDT", "SHORT", 50, 120.0, "CLOSED"), // Win
        TradeLog("SOLUSDT", "LONG", 20, -10.0, "CLOSED"),  // Loss
        TradeLog("ETHUSDT", "LONG", 10, 2.5, "OPEN"),      // Masih jalan (Profit)
        TradeLog("BTCUSDT", "SHORT", 10, -1.0, "OPEN"),    // Masih jalan (Loss)
        TradeLog("SOLUSDT", "SHORT", 25, 45.0, "CLOSED")   // Win
    )

    println("--- Data Log Perdagangan Berhasil Dimuat ---")
    tradeHistory.forEach { println(it) }

    val closedTrades = tradeHistory.filter { it.status == "CLOSED" }

    println("\n--- Closed Trades Only ---")
    closedTrades.forEach { println(it) }
}