package Character

import Race.iRace

class HalfElf : iRace {
    override fun applyModifiers(abilities: BasicAbilities) {
        abilities.charisma += 2
        abilities.strength += 1
        abilities.dexterity += 1
    }
}
