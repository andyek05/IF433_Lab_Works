package oop_00000115200_AndyEdlynsonKadiran.week06

class SmartHomeHub {
    val devices = mutableListOf<SmartDevice>()

    fun addDevice(device: SmartDevice) {
        devices.add(device)
        println("Sistem: Perangkat '${device.name}' berhasil didaftarkan ke Hub.")
    }

    fun turnOffAllSwitches() {
        println("\n=== SHUTDOWN SEQUENCE: Mematikan Semua Saklar ===")
        for (device in devices) {
            if (device is Switchable) {
                device.turnOff()
            }
        }
    }
}