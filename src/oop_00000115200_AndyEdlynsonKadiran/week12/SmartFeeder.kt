package oop_00000115200_AndyEdlynsonKadiran.week12

fun dispenseKibble(requestedGram: Int, availableGram: Int, isJammed: Boolean): Int {
    require(requestedGram > 0) { "Porsi kibble harus lebih dari 0 gr" }

    if (isJammed) {
        throw DispenserJamException()
    }

    if (requestedGram > availableGram) {
        throw FoodEmptyException(requested = requestedGram, available = availableGram)
    }

    println("Kibble berhasil dikeluarkan!")

    return availableGram - requestedGram
}

fun main() {
    var currentKibbleStock = 50

    println("--- Simulasi Jadwal Makan Pagi ---")

    try {
        currentKibbleStock = dispenseKibble(
            requestedGram = 80,
            availableGram = currentKibbleStock,
            isJammed = false
        )
        println("Sisa stok kibble sekarang: $currentKibbleStock gr")

    } catch (e: DispenserJamException) {
        println("[ERROR] Dispenser Macet: ${e.message}")

    } catch (e: FoodEmptyException) {
        println("[ERROR] Stok Kurang: ${e.message}")

    } catch (e: Exception) {
        println("[ERROR] Terjadi kesalahan sistem: ${e.message}")
    }
}