package oop_00000115200_AndyEdlynsonKadiran.week10

fun main() {
    val coinRepo = WalletRepository<Coin>()

    val btc = Coin("Bitcoin", 1.5)
    val eth = Coin("Ethereum", 10.0)
    val sol = Coin("Solana", 50.25)

    coinRepo.add(btc)
    coinRepo.add(eth)
    coinRepo.add(sol)

    println("=== Crypto Wallet Dashboard ===")
    coinRepo.getAll().forEach { coin ->
        println("Asset: ${coin.name} | Balance: ${coin.balance}")
    }

    println("\n--- Hasil Pencarian 'eth' ---")
    val searchResult = coinRepo.findByName("eth")
    if (searchResult.isNotEmpty()) {
        searchResult.forEach { println("Ditemukan: ${it.name} dengan saldo ${it.balance}") }
    } else {
        println("Aset tidak ditemukan.")
    }

    val response = ApiResponse(
        status = "200 OK",
        data = btc
    )
    println("\nStatus API: ${response.status}")
    println("Data dari API: ${response.data.name}")
}