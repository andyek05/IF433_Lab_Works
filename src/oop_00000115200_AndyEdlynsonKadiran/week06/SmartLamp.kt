package oop_00000115200_AndyEdlynsonKadiran.week06

class SmartLamp(
    override val id: String,
    override val name: String
) : SmartDevice, Switchable {

    override fun turnOn() {
        println("Lampu '$name' [$id] dinyalakan: Mengatur kecerahan ke 100%.")
    }

    override fun turnOff() {
        println("Lampu '$name' [$id] dimatikan: Mode hemat energi aktif.")
    }
}