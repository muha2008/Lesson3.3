sealed class Character(
    val name: Tex,
    val weaponType: WeaponType
){
    class Warrior(val ability: String) : Character(WARRIOR, WeaponType.SWORD)
    class Mage(val spell: String) : Character (MAGE, WeaponType.STICK)
    class Archer(val ability: String) : Character (ARCHER, WeaponType.BOW)

    companion object{
        const val WARRIOR = "Муха"
        const val MAGE = "Аха"
        const val ARCHER = "Абду"
    }
}