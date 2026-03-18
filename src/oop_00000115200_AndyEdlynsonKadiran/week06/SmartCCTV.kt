package oop_00000115200_AndyEdlynsonKadiran.week06

class SmartCCTV(
    override val id: String,
    override val name: String
) : SmartDevice, Switchable, Recordable {

    override fun turnOn() {
        println("CCTV '$name' [$id]: Sistem menyala dan sensor infra-merah aktif.")
        startRecord()
    }

    override fun turnOff() {
        println("CCTV '$name' [$id]: Sistem dimatikan.")
        stopRecord()
    }

    override fun startRecord() {
        println("CCTV '$name': Memulai proses perekaman video ke Cloud Storage...")
    }
}