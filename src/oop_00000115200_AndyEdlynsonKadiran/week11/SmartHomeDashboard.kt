package oop_00000115200_AndyEdlynsonKadiran.week11

fun main() {
    val homeDevices = mutableListOf<SmartDevice>()

    SmartDevice(name = "Philips WiZ Living Room", category = "Lighting") // Langsung isi di sini
        .apply {
            isOnline = true
            powerLoad = 12
        }.also {
            homeDevices.add(it)
        }

    SmartDevice("Ezviz Outdoor", "Camera")
        .apply {
            isOnline = true
            powerLoad = 5
        }.also {
            println("(LOG) Kamera terhubung")
            homeDevices.add(it)
        }
}