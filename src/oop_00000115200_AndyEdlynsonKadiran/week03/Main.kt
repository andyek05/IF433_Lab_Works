package oop_00000115200_AndyEdlynsonKadiran.week03

fun main() {
    val e = Employee("Budi")
    println("--- Test Error ---")

    e.salary = 5000000
    println("Gaji: ${e.salary}")

    e.increasePerformance()

    println("Pajak yang harus dibayar: ${e.tax}")
}