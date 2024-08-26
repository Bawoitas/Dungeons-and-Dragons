package Character

import Race.iRace

class Tiefling : iRace {
    override fun applyModifiers(abilities: BasicAbilities) {
        abilities.intelligence += 1
        abilities.charisma += 2
    }
}
