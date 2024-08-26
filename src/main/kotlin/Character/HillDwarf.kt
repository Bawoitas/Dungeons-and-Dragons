package Character

import Race.iRace

class HillDwarf : iRace {
    override fun applyModifiers(abilities: BasicAbilities) {
        abilities.constitution += 2
        abilities.wisdom += 1
    }
}
