package oop_00000115200_AndyEdlynsonKadiran.week08

fun main() {
    val parser = ApiParser()

    val rawApiData: List<Map<String, Any?>> = listOf(
        mapOf("id" to "E01", "name" to "Laptop", "type" to "ELECTRONIC", "warrantyMonths" to 24),
        mapOf("id" to "C01", "name" to "T-Shirt", "type" to "CLOTHING", "size" to "XL"),
        mapOf("id" to "E02", "name" to "Mouse", "type" to "ELECTRONIC", "warrantyMonths" to "Not An Integer"),
        mapOf("name" to "Ghost Item", "type" to "CLOTHING"),
        mapOf("id" to "X01", "name" to "Unknown", "type" to "FOOD")
    )

    println("=== STARTING BATCH CHECKOUT ===\n")

    for (raw in rawApiData) {
        try {
            val product = parser.parseProduct(raw)

            product?.let {
                parser.checkout(it)
            }

        } catch (e: IllegalArgumentException) {
            println("LOG WARNING: Data Corrupted! ${e.message}")
        }
    }

    println("\n=== BATCH PROCESS FINISHED ===")
}