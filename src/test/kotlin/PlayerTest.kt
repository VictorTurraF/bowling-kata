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

    @Test
    fun testPlayerScoresShouldAccumulateFramesSums() {
        val player = Player("Victor")

        player.roll(2)
        assertEquals(2, player.getScores()[0])

        player.roll(3)
        assertEquals(5, player.getScores()[0])

        player.roll(3)
        assertEquals(8, player.getScores()[1])

        player.roll(4)
        assertEquals(5, player.getScores()[0])
        assertEquals(12, player.getScores()[1])
    }

    @Test
    fun testPlayersRollsShouldComputeSpareBonus() {
        val player = Player("Victor")

        player.roll(3)
        player.roll(4) // First frame score should be 7
        assertEquals(7, player.getScores()[0])

        player.roll(5)
        player.roll(5) // spare // Second Frame score should be 17 till here
        assertEquals(17, player.getScores()[1])

        player.roll(2) // Second frame score should be 12 at this point
        assertEquals(19, player.getScores()[1])
        assertEquals(21, player.getScores()[2])

        player.roll(3) // Third frame score should be 24 at this point
        assertEquals(24, player.getScores()[2])

        // Checking others scores
        assertEquals(19, player.getScores()[1])
        assertEquals(7, player.getScores()[0])
    }
}