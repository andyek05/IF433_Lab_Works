package oop_00000115200_AndyEdlynsonKadiran.week07

fun main() {

    println("\n=== TEST GAME MANAGER SINGLETON ===")
    GameManager.startGame()

    GameManager.startGame()

    println("\n=== TEST ENUM & FACTORY ===")
    println("Peluang mendapatkan item LEGENDARY: ${ItemRarity.LEGENDARY.dropChance}%")

    val myWeapon = Weapon.forgeStarterSword()

    println("Senjata Baru Didapatkan: ${myWeapon.item.name}")
    println("Statistik -> Damage: ${myWeapon.item.damage}, Durability: ${myWeapon.durability}")
    println("Kelangkaan: ${myWeapon.item.rarity}")

    println("\n=== SIMULASI UPGRADE & BATTLE EVENTS ===")

    val upgradedSword = myWeapon.item.copy(name = "Pedang Kayu Perkasa", damage = 25)

    processEvent(SafeZone)
    processEvent(MonsterEncounter("Goblin Nakal"))
    processEvent(LootDropped(upgradedSword))
    processEvent(GameOver("Terkena jebakan racun"))
}