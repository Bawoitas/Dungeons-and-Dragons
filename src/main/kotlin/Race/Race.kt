package Race

import Character.Abilities

enum class Race(val abilityBonuses: Map<String, Int>) {
    HUMANO(mapOf("strength" to 1, "dexterity" to 1, "constitution" to 1, "intelligence" to 1, "wisdom" to 1, "charisma" to 1)),
    GNOMO(mapOf("constitution" to 2)),
    ELFO(mapOf("dexterity" to 2)),
    BRUXO(mapOf("dexterity" to 2));

    fun applyModifiers(basicAbilities: Abilities) {

    }

    companion object {
        fun chooseRace(): Race {
            while (true) {
                println("\n---- Escolha uma raça: ----")
                println("1. HUMANO")
                println("2. GNOMO")
                println("3. ELFO")
                println("4. BRUXO")

                val choice = readLine()?.toIntOrNull()

                when (choice) {
                    1 -> return HUMANO
                    2 -> return GNOMO
                    3 -> return ELFO
                    4 -> return BRUXO
                    else -> println("\nOpção inválida! Escolha um personagem presente no menu.")
                }
            }
        }
    }
}
