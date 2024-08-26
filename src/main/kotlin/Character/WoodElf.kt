package Character

import Race.iRace

class WoodElf : iRace {
    override fun applyModifiers(abilities: BasicAbilities) {
        abilities.dexterity += 2
        abilities.wisdom += 1
    }
}
