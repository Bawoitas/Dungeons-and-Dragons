package Character

import Race.iRace

class RockGnome : iRace {
    override fun applyModifiers(abilities: BasicAbilities) {
        abilities.intelligence += 2
        abilities.constitution += 1
    }
}
