fun main(args: Array<String>) {
    val scanner = Scan(System.`in`)
    println("Выберите действие для персонажа 1 - Атака, 0 - Защита ")
    println("---------------------------------")
    print("Здесь писать:")

    val action = scanner.nextInt()
    when (action) {
        0 -> {
            val warrior = Character.Warrior("смог защититься")
            val mage = Character.Mage("защититься используя")
            val archer =Character.Archer("смогла защититься")
            CharacterCommon.defend(warrior)
            CharacterCommon.defend(mage)
            CharacterCommon.defend(archer)
        }

        1 -> {
            val warrior = Character.Warrior("замахнулся топором")
            val mage = Character.Mage("использует посох")
            val archer = Character.Archer("выстрелил из лука")
            CharacterCommon.attack(warrior)
            CharacterCommon.attack(mage)
            CharacterCommon.attack(archer)
            val hill = object {
                val name = "Тоха "
                fun hill() {
                    println("$name Вылечил команду")
                }
            }
            hill.hill()
        }
    }
}