package org.example.application.entity

class Game(
    private val players: List<Player> = listOf()
) {
    fun getPlayers(): List<Player> {
        return this.players
    }

    fun getCurrentPlayer(): Player {
        return Player("Teste")
    }
}