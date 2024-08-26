package Character

import Race.iRace

class DragonBorn : iRace {
    override fun applyModifiers(abilities: BasicAbilities) {
        abilities.strength += 2
        abilities.charisma += 1
    }
}
