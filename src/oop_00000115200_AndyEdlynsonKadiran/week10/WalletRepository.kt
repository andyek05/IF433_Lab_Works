package oop_00000115200_AndyEdlynsonKadiran.week10

class WalletRepository<T : NamedEntity> {
    private val items = mutableListOf<T>()

    fun add(item: T) {
        items.add(item)
    }

    fun getAll(): List<T> = items.toList()

    fun findByName(query: String): List<T> {
        return items.filter { it.name.contains(query, ignoreCase = true) }
    }
}

data class ApiResponse<T>(
    val status: String,
    val data: T
)