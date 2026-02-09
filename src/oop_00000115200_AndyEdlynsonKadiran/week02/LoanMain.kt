package oop_00000115200_AndyEdlynsonKadiran.week02

import java.util.Scanner

fun main(){
    val scanner = Scanner(System.`in`)

    println("--- APLIKASI LOAN ---")

    print("Masukkan Judul Buku: ")
    val bookTitle = scanner.nextLine()

    print("Masukkan Nama Anda: ")
    val borrower = scanner.nextLine()

    print("Masukkan Durasi Peminjaman: ")
    var loanDuration = scanner.nextInt()

    scanner.nextLine()

    if (loanDuration < 0){
        loanDuration = 1
        println("Durasi Peminjaman dibawah 0. Durasi peminjaman otomatis 1 hari!")

        val report = Loan(bookTitle, borrower, loanDuration)
        println("Data telah diunduhkan dengan ${report.borrower} sebagai peminjam buku ${report.bookTitle} selama ${report.loanDuration} hari.")
        println("Total Denda = ${report.calculateFine()}")

    } else {

        val report = Loan(bookTitle, borrower, loanDuration)
        println("Data telah diunduhkan dengan ${report.borrower} sebagai peminjam buku ${report.bookTitle} selama ${report.loanDuration} hari.")
        println("Total Denda = ${report.calculateFine()}")
    }
}