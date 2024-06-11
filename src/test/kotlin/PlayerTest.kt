import org.example.application.entity.Player
import kotlin.test.Test
import kotlin.test.assertEquals

class PlayerTest {

    @Test
    fun testPlayerShouldHaveAName() {
        val player = Player("Victor")

        assertEquals(player.getName(), "Victor")
    }
}