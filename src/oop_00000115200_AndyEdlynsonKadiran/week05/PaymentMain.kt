package oop_00000115200_AndyEdlynsonKadiran.week05

fun main() {
    val dompetDigital = EWallet(accountName = "Gopay Andy", balance = 50000.0)
    val kartuKredit = CreditCard(accountName = "Visa Teddy", limit = 100000.0)

    val daftarPembayaran: List<PaymentMethod> = listOf(dompetDigital, kartuKredit)

    println("=== PROSES PEMBAYARAN E-COMMERCE (Tagihan: 75000.0) ===")

    for (metode in daftarPembayaran) {
        println("Metode: ${metode.accountName}")

        metode.processPayment(75000.0)

        println("----------------------------------------------")
    }

    println("=== PROSES PEMBAYARAN DENGAN SMART CASTING ===")

    for (metode in daftarPembayaran) {
        println("Memproses akun: ${metode.accountName}")

        metode.processPayment(75000.0)

        if (metode is EWallet) {
            println("[Sistem Detect: Ini adalah EWallet. Melakukan Top-up Otomatis...]")

            metode.topUp(50000.0)

            println("Mencoba pembayaran ulang setelah Top-up:")
            metode.processPayment(75000.0)
        }

        println("----------------------------------------------")
    }
}