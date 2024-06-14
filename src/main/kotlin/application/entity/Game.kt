package org.example.application.entity

class Game(
    private val players: List<Player> = listOf()
) {
    private var currentPlayerIndex: Int = 0

    fun getPlayers(): List<Player> {
        return this.players
    }

    fun getCurrentPlayer(): Player {
        return this.players[this.currentPlayerIndex]
    }

    fun roll(pins: Int) {
        this.getCurrentPlayer().roll(pins) {
            this.currentPlayerIndex = (currentPlayerIndex + 1) % players.size
        }
    }

    /**
     * It is also possible to implement in another way
     * For example
     *
     * fun roll(pins: Int) {
     *      this.currentPlayer().roll()
     *
     *      if (this.currentPlayer().currentFrame().hasEnded()) {
     *          this.currentPlayer().nextFrame()
     *          this.nextPlayer()
     *      }
     * }
     */
}