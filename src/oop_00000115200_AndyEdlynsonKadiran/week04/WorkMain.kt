package oop_00000115200_AndyEdlynsonKadiran.week04

fun main(){
    println("--- Manager Work ---")
    val thisManager = Manager("Andrew", 10000)
    thisManager.work()
    thisManager.calculateBonus()
    println("He/she has received $${thisManager.calculateBonus()} bonus")

    println("\n--- Developer Work ---")
    val thatDeveloper = Developer("Python", "Michael", 10000)
    thatDeveloper.work()
    thatDeveloper.calculateBonus()
    println("He/she has received $${thatDeveloper.calculateBonus()} bonus.")
}