package Character

import Race.iRace

class HighElf : iRace {
    override fun applyModifiers(abilities: BasicAbilities) {
        abilities.dexterity += 2
        abilities.intelligence += 1
    }
}
