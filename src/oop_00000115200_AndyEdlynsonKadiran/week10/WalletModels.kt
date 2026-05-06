package oop_00000115200_AndyEdlynsonKadiran.week10

data class Coin(
    val name: String,
    val balance: Double
)

data class Transaction(
    val id: String,
    val amount: Double
)

data class SystemLog(
    val timestamp: Long,
    val message: String
)