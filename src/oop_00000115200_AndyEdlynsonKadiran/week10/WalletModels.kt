package oop_00000115200_AndyEdlynsonKadiran.week10

interface NamedEntity {
    val name: String
}

data class Coin(
    override val name: String,
    val balance: Double
) : NamedEntity

data class Transaction(
    val id: String,
    val amount: Double
)

data class SystemLog(
    val timestamp: Long,
    val message: String
)