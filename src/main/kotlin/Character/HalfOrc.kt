package Character

import Race.iRace

class HalfOrc : iRace {
    override fun applyModifiers(abilities: BasicAbilities) {
        abilities.strength += 2
        abilities.constitution += 1
    }
}
