package oop_00000115200_AndyEdlynsonKadiran.week03

class Player(val name: String){
    private var xp: Int = 0

    fun levelCalculation(){
        var level: Int = 0
        level = (xp / 100) + 1
    }

    fun addXp(amount: Int) {
        if (amount < 0) {
            println("ERROR: XP is negative. Please enter Positive amount.")
        } else {
            var levelBefore = levelCalculation()

            xp = xp + amount
            var levelAfter= levelCalculation()

            if (levelBefore < levelAfter){
                println( "Level Up! Selamat $name naik ke level $levelAfter")
            }
        }
    }
}