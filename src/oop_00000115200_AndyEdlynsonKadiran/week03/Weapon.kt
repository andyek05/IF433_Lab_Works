package oop_00000115200_AndyEdlynsonKadiran.week03

class Weapon(val name: String) {
    var damage: Int = 0
        set(value) {
            if (value < 0) {
                println("ERROR: Damage tidak boleh negatif! di-set ke 0.")
                field = 0
            } else if (value > 1000) {
                println("ERROR: Damage Overpower! di-set ke 0.")
                field = 0
            } else {
                field = value
            }
        }

    fun testTier(){
        if (damage >= 800){
            println("$name with damage of $damage is Weapon Tier LEGENDARY!")
        } else if (damage >= 500){
            println("$name with damage of $damage is Weapon Tier EPIC.")
        } else {
            println("$name with damage of $damage is Common Weapon.")
        }
    }
}