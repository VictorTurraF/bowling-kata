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
        this.getCurrentPlayer().roll(pins)

        if (this.getCurrentPlayer().lastFrame()?.hasEnded() == true) {
            this.currentPlayerIndex ++
        }
    }
}