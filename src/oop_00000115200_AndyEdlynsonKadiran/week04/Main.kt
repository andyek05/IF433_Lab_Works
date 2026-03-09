package oop_00000115200_AndyEdlynsonKadiran.week04

fun main() {
    println("--- Testing Vehicle ---")
    val generalVehicle = Vehicle("Sepeda Onthel")
    generalVehicle.honk()
    generalVehicle.accelerate()

    println("\n--- Testing Car ---")
    val myCar = ElectricCar("Tesla", 4, batteryCapacity = 90)
    myCar.openTrunk()
    myCar.honk()
    myCar.accelerate()
}