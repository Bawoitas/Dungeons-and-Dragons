package Character

import Race.iRace

class Human : iRace {
    override fun applyModifiers(abilities: BasicAbilities) {
        abilities.strength += 1
        abilities.dexterity += 1
        abilities.constitution += 1
        abilities.intelligence += 1
        abilities.wisdom += 1
        abilities.charisma += 1
    }
}
