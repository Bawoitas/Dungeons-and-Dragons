package Character

import Point.PointStrategy
import Race.iRace

class CreateCharacter(
    val name: String,
    val race: iRace,
    var abilities: BasicAbilities,
    private val pointStrategy: PointStrategy
) {
    val hitPoints: Int
        get() = 10 + abilities.constitution + abilities.strength

    fun displayCharacter() {
        println("Nome: $name")
        println("Raça: ${race::class.simpleName}")
        abilities.display()
        println("Pontos de Vida: $hitPoints")
    }
}
