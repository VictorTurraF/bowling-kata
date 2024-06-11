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

    @Test
    fun testPlayerCanRoll() {
        val player = Player("Victor")

        player.roll(5)

        val firstFrame = player.getFrames()[0]
        assertEquals(5, firstFrame.sum())
    }

    @Test
    fun testPlayerRollShouldUpdateCurrentThrowing() {
        val player = Player("Victor")

        player.roll(5)
        player.roll(3)

        val firstFrame = player.getFrames()[0]
        assertEquals(8, firstFrame.sum())
    }

    @Test
    fun testPlayerRollShouldUpdateCurrentFrame() {
        val player = Player("Victor")

        player.roll(5)
        player.roll(3)

        player.roll(4)
        player.roll(3)

        val firstFrame = player.getFrames()[0]
        assertEquals(8, firstFrame.sum())

        val secondFrame = player.getFrames()[1]
        assertEquals(7, secondFrame.sum())
    }
}