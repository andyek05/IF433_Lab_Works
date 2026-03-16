package oop_00000115200_AndyEdlynsonKadiran.week05

abstract class PaymentMethod(val accountName: String) {

    abstract fun processPayment(amount: Double)
}