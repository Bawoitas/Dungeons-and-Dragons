package Character

import Race.iRace

class MountainDwarf : iRace {
    override fun applyModifiers(abilities: BasicAbilities) {
        abilities.constitution += 2
        abilities.strength += 2
    }
}
