package oop_00000115200_AndyEdlynsonKadiran.week04

open class Car(brand: String, val numberOfDoor: Int) : Vehicle(brand) {
    fun openTrunk() {
        println("Bagasi mobil $brand dengan $numberOfDoor pintu dibuka.")
    }

    override fun honk(){
        println("TIN TIN! Mobil $brand lewat!")
    }
}