package oop_00000115200_AndyEdlynsonKadiran.week08

class ApiParser {

    fun parseProduct(rawJson: Map<String, Any?>): Product? {
        return try {
            val id = requireNotNull(rawJson["id"]?.toString()) { "API Invalid: Missing ID" }
            val name = requireNotNull(rawJson["name"]?.toString()) { "API Invalid: Missing Name" }

            (rawJson["type"] as? String).let { type ->
                when (type) {
                    "ELECTRONIC" -> {
                        val warranty = rawJson["warrantyMonths"] as? Int ?: 12
                        Electronic(id, name, warranty)
                    }
                    "CLOTHING" -> {
                        val size = rawJson["size"] as? String ?: "All Size"
                        Clothing(id, name, size)
                    }
                    else -> null
                }
            }
        } catch (e: IllegalArgumentException) {
            throw e
        }
    }
}