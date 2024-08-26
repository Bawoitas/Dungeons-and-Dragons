package Character

import Race.iRace

class StoutHalfling : iRace {
    override fun applyModifiers(abilities: BasicAbilities) {
        abilities.dexterity += 2
        abilities.constitution += 1
    }
}
