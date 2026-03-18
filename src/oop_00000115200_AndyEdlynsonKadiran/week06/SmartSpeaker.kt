package oop_00000115200_AndyEdlynsonKadiran.week06

class SmartSpeaker(
    override val id: String,
    override val name: String
) : SmartDevice, Switchable {

    override fun turnOn() {
        println("Speaker '$name' menyala dan siap menerima perintah suara.")
    }

    override fun turnOff() {
        println("Speaker '$name' dimatikan (Standby mode).")
    }

    fun playMusic(song: String) {
        println("Memutar lagu $song dari Spotify melalui speaker '$name'.")
    }
}