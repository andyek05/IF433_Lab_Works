package oop_00000115200_AndyEdlynsonKadiran.week03

class Player(val username: String){
    private var xp: Int = 100

    fun levelCalculation(): Int {
        var level: Int = 0
        level = (xp / 100) + 1
        return level
    }

    fun addXp(amount: Int) {
        if (amount < 0) {
            println("ERROR: XP is negative. Please enter Positive amount.")
        } else {
            val levelBefore = levelCalculation()

            xp = xp + amount
            val levelAfter= levelCalculation()

            if (levelAfter > levelBefore){
                println("Level Up! Selamat $username naik ke level $levelAfter")
            } else {
                println("Player Level is $levelBefore")
            }
        }
    }
}