import Character.BasicAbilities
import Character.CreateCharacter
import Character.Human
import Point.CustomPointBuyStrategy
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class TestCharisma {
    val character = CreateCharacter("Teste", Human(), BasicAbilities(), CustomPointBuyStrategy())

    @Test
    fun `test`() {
        assertEquals(9, character.abilities.charisma)
    }
}