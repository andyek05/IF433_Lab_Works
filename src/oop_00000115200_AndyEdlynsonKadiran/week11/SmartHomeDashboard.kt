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

    val acDevice = run {
        val device = SmartDevice("Daikin Inverter (Kabel 3x2.5)", "HVAC", false, 800)
        device
    }
    homeDevices.add(acDevice)

    homeDevices.add(SmartDevice("Picolo's Auto Feeder", "Pet Care", true, 10))

    val searchResult = homeDevices.find { it.category == "Camera" }

    searchResult?.let {
        val diagnosticLog = it.diagnose()
        println(diagnosticLog)
    }
}