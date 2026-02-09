package oop_00000115200_AndyEdlynsonKadiran.week02

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    var enemyHp = 100
    var isHeroAlive = true

    println("--- APLIKASI HERO ---")

    print("Masukkan nama Hero: ")
    val name = scanner.nextLine()

    print("Masukkan Stat Damage: ")
    val baseDamage = scanner.nextInt()

    scanner.nextLine()

    val myHero = Hero(name, hp = 100, baseDamage)
    println("Hero ${myHero.name} with HP of ${myHero.hp} and Base Damage of ${myHero.baseDamage}.")

    while (isHeroAlive && enemyHp > 0){
        println("--- ACTION MENU ---")
        println("1. Serang")
        println("2. Kabur")
        print("Pilih aksi: ")

        val type = scanner.nextInt()
        scanner.nextLine()

        if (type == 1){
            myHero.attack("Musuh")
            enemyHp -= myHero.baseDamage
            println("HP Musuh tersisa: $enemyHp")

            if (enemyHp > 0) {
                val damage = (10..20).random()
                println("Musuh menyerang balik sebesar $damage damage!")

                isHeroAlive = myHero.takeDamage(damage)
                println("Sisa HP ${myHero.name}: ${myHero.hp}")
            }
        } else if (type == 2) {
            println("Kamu melarikan diri dari pertempuran!")
            break
        } else {
            println("Pilihan tidak valid.")
        }
        println()
    }
}