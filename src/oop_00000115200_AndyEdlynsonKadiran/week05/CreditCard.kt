package oop_00000115200_AndyEdlynsonKadiran.week05

class CreditCard(accountName: String, val limit: Double) : PaymentMethod(accountName) {

    var usedAmount: Double = 0.0

    override fun processPayment(amount: Double) {
        if (usedAmount + amount <= limit) {
            usedAmount += amount
            println("Pembayaran Kartu Kredit Berhasil! Nama: $accountName")
            println("Tagihan bertambah: $amount. Total tagihan saat ini: $usedAmount/$limit")
        } else {
            println("Transaksi Ditolak! Tagihan sebesar $amount akan melebihi limit kartu ($limit).")
        }
    }
}