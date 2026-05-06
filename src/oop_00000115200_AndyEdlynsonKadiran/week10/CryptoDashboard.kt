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

    coinRepo.add(Coin("BTC", 0.1254))
    coinRepo.add(Coin("ETH", 2.5))
    coinRepo.add(Coin("USDT", 1500.0))

    coinRepo.add(Coin("SOL", 10.0))

    println("=== My Crypto Wallet ===")
    val allCoins = coinRepo.getAll()

    allCoins.forEachIndexed { index, coin ->
        println("${index + 1}. Asset: ${coin.name} | Balance: ${coin.balance}")
    }

    println("\n--- Melakukan Pencarian Asset 'BTC' ---")
    val search = coinRepo.findByName("BTC")
    search.forEach { println("Hasil ditemukan: ${it.name} dengan saldo ${it.balance}") }

    val responseAllCoins = ApiResponse("200 OK", coinRepo.getAll())

    println("\n=== Simulasi Respon API (Full Data) ===")
    println("Status: ${responseAllCoins.status}")

    responseAllCoins.data.forEach { coin ->
        println("Fetching dari API Wrapper -> Asset: ${coin.name}, Saldo: ${coin.balance}")
    }
}