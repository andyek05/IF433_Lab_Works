package oop_00000115200_AndyEdlynsonKadiran.week05

class EWallet(accountName: String, var balance: Double) : PaymentMethod(accountName) {

    override fun processPayment(amount: Double) {
        if (balance >= amount) {
            balance -= amount
            println("Pembayaran Berhasil! Saldo $accountName berkurang sebesar $amount. Sisa saldo: $balance")
        } else {
            println("Gagal: Saldo $accountName tidak cukup untuk transaksi sebesar $amount.")
        }
    }

    fun topUp(amount: Double) {
        balance += amount
        println("Top-up Berhasil! Saldo $accountName sekarang: $balance")
    }
}