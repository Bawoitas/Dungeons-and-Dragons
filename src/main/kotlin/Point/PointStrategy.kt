package Point

import Character.BasicAbilities

class CustomPointBuyStrategy : PointStrategy {
    private val costMap = mapOf(
        8 to 0, 9 to 1, 10 to 2, 11 to 3, 12 to 4, 13 to 5, 14 to 7, 15 to 9
    )

    private var remainingPoints = 27

    override fun distributePoints(): BasicAbilities {
        var strength = 8
        var dexterity = 8
        var constitution = 8
        var intelligence = 8
        var wisdom = 8
        var charisma = 8

        while (remainingPoints > 0) {
            println("\n---- Distribua seus pontos (Você tem $remainingPoints pontos restantes): ----")
            println("1. Força: $strength")
            println("2. Destreza: $dexterity")
            println("3. Constituição: $constitution")
            println("4. Inteligência: $intelligence")
            println("5. Sabedoria: $wisdom")
            println("6. Carisma: $charisma")
            println("7. Finalizar distribuição e ir para a próxima etapa")

            var choice: Int? = null
            while (choice == null || choice !in 1..7) {
                println("\n---- Escolha um atributo para aumentar (1-7): ----")
                choice = readLine()?.toIntOrNull()
                if (choice !in 1..7) {
                    println("\nOpção inválida, por favor, escolha um valor entre 1 e 7.")
                }
            }

            if (choice == 7) {
                println("\n---- Você escolheu finalizar a distribuição ----")
                break
            }

            var value: Int? = null
            while (value == null || value !in 8..15) {
                println("\nEscolha o valor final para o atributo (entre 8 e 15):")
                value = readLine()?.toIntOrNull()
                if (value == null || value !in 8..15) {
                    println("\nValor inválido, por favor, escolha um valor entre 8 e 15.")
                }
            }

            val currentAttributeValue = when (choice) {
                1 -> strength
                2 -> dexterity
                3 -> constitution
                4 -> intelligence
                5 -> wisdom
                6 -> charisma
                else -> 8
            }

            if (value > currentAttributeValue) {
                val currentCost = costMap[currentAttributeValue] ?: 0
                val newCost = costMap[value] ?: 0

                val costDifference = newCost - currentCost

                if (remainingPoints >= costDifference) {
                    when (choice) {
                        1 -> strength = value
                        2 -> dexterity = value
                        3 -> constitution = value
                        4 -> intelligence = value
                        5 -> wisdom = value
                        6 -> charisma = value
                    }
                    remainingPoints -= costDifference
                } else {
                    println("\nPontos insuficientes para essa escolha. Tente um valor menor ou outra habilidade.")
                }
            } else {
                println("\nVocê não pode diminuir o valor de um atributo. Escolha um valor maior.")
            }
        }

        println("\nDistribuição finalizada. Você tem $remainingPoints pontos restantes para futuras distribuições.")
        return BasicAbilities(strength, dexterity, constitution, intelligence, wisdom, charisma)
    }

    fun getRemainingPoints(): Int {
        return remainingPoints
    }
}
