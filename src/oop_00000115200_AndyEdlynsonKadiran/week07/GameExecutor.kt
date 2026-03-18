package oop_00000115200_AndyEdlynsonKadiran.week07

fun processEvent(event: BattleState) {
    when (event) {
        is MonsterEncounter -> {
            println("Waspada! Muncul monster ${event.monsterName} di hadapanmu!")
        }

        is LootDropped -> {
            val (name, _, rarity) = event.item
            println("Selamat! Kamu menemukan item: $name dengan tingkat kelangkaan $rarity.")
        }

        is GameOver -> {
            println("Permainan Berakhir! Alasan: ${event.reason}")
        }

        SafeZone -> {
            println("Kamu memasuki Zona Aman. Silakan beristirahat sejenak.")
        }
    }
}