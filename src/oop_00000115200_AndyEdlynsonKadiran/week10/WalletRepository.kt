package oop_00000115200_AndyEdlynsonKadiran.week10

class WalletRepository<T> {
    private val items = mutableListOf<T>()

    fun add(item: T) {
        items.add(item)
    }

    fun getAll(): List<T> {
        return items.toList()
    }
}

data class ApiResponse<T>(
    val status: String,
    val data: T
)