package Character

import Race.iRace

data class BasicAbilities(
    var strength: Int = 8,
    var dexterity: Int = 8,
    var constitution: Int = 8,
    var intelligence: Int = 8,
    var wisdom: Int = 8,
    var charisma: Int = 8
) {
    fun applyRacialBonuses(race: iRace) {
        race.applyModifiers(this)
    }

    fun getModifier(value: Int): Int = (value - 10) / 2

    fun display() {
        println("Força: $strength (Modificador: ${getModifier(strength)})")
        println("Destreza: $dexterity (Modificador: ${getModifier(dexterity)})")
        println("Constituição: $constitution (Modificador: ${getModifier(constitution)})")
        println("Inteligência: $intelligence (Modificador: ${getModifier(intelligence)})")
        println("Sabedoria: $wisdom (Modificador: ${getModifier(wisdom)})")
        println("Carisma: $charisma (Modificador: ${getModifier(charisma)})")
    }
}
