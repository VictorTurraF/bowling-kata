import org.example.application.entity.Game
import org.example.application.entity.Player
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class GameTest {

    @Test
    fun gameClassShouldInitWithPlayersList() {
        val game = Game(listOf(
            Player("Victor"),
            Player("Alice")
        ))

        val gamePlayers = game.getPlayers()
        assertEquals(2, gamePlayers.size)
        assertEquals("Victor", gamePlayers[0].getName())
        assertEquals("Alice", gamePlayers[1].getName())
    }

    @Test
    fun gameShouldHaveACurrentPlayer() {
        val players = listOf(Player("Victor"), Player("Alice"))
        val game = Game(players)

        val currentPlayer = game.getCurrentPlayer()
        assertEquals("Victor", currentPlayer.getName())
    }

    @Test
    fun gameShouldRollPinsOfTheFirstPlayer() {
        val players = listOf(Player("Victor"), Player("Alice"))
        val game = Game(players)

        game.roll(5)
        // Check if the first player's frame has the roll
        assertEquals(5, players[0].getFrames()[0].sum())

        game.roll(4)
        // Check if the second player's frame has the roll
        assertEquals(8, players[0].getFrames()[0].sum())
    }
}