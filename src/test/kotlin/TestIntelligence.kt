import Character.BasicAbilities
import Character.CreateCharacter
import Character.Human
import Point.CustomPointBuyStrategy
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class TestIntelligence {
    val character = CreateCharacter("Teste", Human(), BasicAbilities(), CustomPointBuyStrategy())

    @Test
    fun `test`() {
        assertEquals(9, character.abilities.dexterity)
    }
}
