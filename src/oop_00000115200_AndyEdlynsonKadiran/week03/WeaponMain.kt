package oop_00000115200_AndyEdlynsonKadiran.week03

fun main() {
    val e = Weapon("Stick")
    println("--- Weapon Classification ---")

    e.damage = 100000

    println("Weapon Name: ${e.name}")
    println("Weapon Damage: ${e.damage}")

    e.testTier()
}