package oop_00000115200_AndyEdlynsonKadiran.week02

class Hero(
    val name: String,
    var hp: Int,
    var baseDamage: Int
){
    fun attack(targetName: String){
        println("$name menebas $targetName")
    }

    fun takeDamage(damage: Int): Boolean {
        var isAlive: Boolean = true
        hp -= damage

        isAlive = if(hp < 0){
            false
        } else {
            true
        }

        return isAlive
    }
}