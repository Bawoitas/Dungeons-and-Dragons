import Character.*
import Point.CustomPointBuyStrategy
import Race.iRace

fun getCharacterName(): String {
    println("\n---- Bem vindo a Dungeons & Dragons! ----")
    println("\nInsira o nome do seu personagem:")
    return readLine() ?: "Personagem sem nome!"
}

fun main() {
    val characterName = getCharacterName()

    val race = chooseRace()

    val pointBuyStrategy = CustomPointBuyStrategy()

    val abilities = pointBuyStrategy.distributePoints()
    abilities.applyRacialBonuses(race)

    val character = CreateCharacter(characterName, race, abilities, pointBuyStrategy)

    character.displayCharacter()

    println("\nAgora você pode seguir para a próxima etapa do RPG!")
}

fun chooseRace(): iRace {  // Retorna Race.iRace
    while (true) {
        println("\n---- Escolha uma raça: ----")
        println("1. Humano")
        println("2. Elfo")
        println("3. Anão")
        println("4. Halfling")
        println("5. Gnomo")
        println("6. Meio-Elfo")
        println("7. Meio-Orc")
        println("8. Tiefling")
        println("9. Draconato")

        val choice = readLine()?.toIntOrNull()

        return when (choice) {
            1 -> Human()
            2 -> chooseElf()
            3 -> chooseDwarf()
            4 -> chooseHalfling()
            5 -> chooseGnome()
            6 -> HalfElf()
            7 -> HalfOrc()
            8 -> Tiefling()
            9 -> DragonBorn()
            else -> {
                println("\nOpção inválida! Escolha um personagem presente no menu.")
                continue
            }
        }
    }
}

fun chooseElf(): iRace {
    while (true) {
        println("\n---- Escolha um tipo de Elfo: ----")
        println("1. Elfo Alto")
        println("2. Elfo da Floresta")
        println("3. Elfo Negro")

        val choice = readLine()?.toIntOrNull()

        return when (choice) {
            1 -> HighElf()
            2 -> WoodElf()
            3 -> DarkElf()
            else -> {
                println("\nOpção inválida! Escolha um personagem presente no menu.")
                continue
            }
        }
    }
}

fun chooseDwarf(): iRace {
    while (true) {
        println("\n---- Escolha um tipo de Anão: ----")
        println("1. Anão das Colinas")
        println("2. Anão das Montanhas")

        val choice = readLine()?.toIntOrNull()

        return when (choice) {
            1 -> HillDwarf()
            2 -> MountainDwarf()
            else -> {
                println("\nOpção inválida! Escolha um personagem presente no menu.")
                continue
            }
        }
    }
}

fun chooseHalfling(): iRace {
    while (true) {
        println("\n---- Escolha um tipo de Halfling: ----")
        println("1. Halfling Pés Leves")
        println("2. Halfling Robusto")

        val choice = readLine()?.toIntOrNull()

        return when (choice) {
            1 -> LightFoot()
            2 -> StoutHalfling()
            else -> {
                println("\nOpção inválida! Escolha um personagem presente no menu.")
                continue
            }
        }
    }
}

fun chooseGnome(): iRace {
    while (true) {
        println("\n---- Escolha um tipo de Gnomo: ----")
        println("1. Gnomo da Floresta")
        println("2. Gnomo das Rochas")

        val choice = readLine()?.toIntOrNull()

        return when (choice) {
            1 -> ForestGnome()
            2 -> RockGnome()
            else -> {
                println("\nOpção inválida! Escolha um personagem presente no menu.")
                continue
            }
        }
    }
}
