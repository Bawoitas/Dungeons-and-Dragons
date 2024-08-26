package Character

import Race.iRace

class LightFoot : iRace {
    override fun applyModifiers(abilities: BasicAbilities) {
        abilities.dexterity += 2
        abilities.charisma += 1
    }
}
