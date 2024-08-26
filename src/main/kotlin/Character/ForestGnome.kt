package Character

import Race.iRace

class ForestGnome : iRace {
    override fun applyModifiers(abilities: BasicAbilities) {
        abilities.intelligence += 2
        abilities.dexterity += 1
    }
}
