import org.example.application.entity.NormalFrame
import org.example.application.entity.Player
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class PlayerTest {

    @Test
    fun testPlayerShouldHaveAName() {
        val player = Player("Victor")

        assertEquals(player.getName(), "Victor")
    }

    @Test
    fun testPlayerShouldHaveNineNormalFrames() {
        val player = Player("Victor")

        val frames = player.getFrames()
        assertEquals(9, frames.size)
        assertTrue(frames.all { it is NormalFrame })
    }
}