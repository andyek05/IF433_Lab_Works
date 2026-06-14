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