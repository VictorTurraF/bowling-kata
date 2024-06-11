package org.example.application.entity

class NormalFrame : Frame {
    private var firstThrow: Int? = null
    private var secondThrow: Int? = null

    override fun sum(): Int {
        val first = this.firstThrow ?: 0
        val second = this.secondThrow ?: 0

        return first + second
    }

    override fun isSpare(): Boolean {
        TODO("Not yet implemented")
    }

    override fun isStrike(): Boolean {
        TODO("Not yet implemented")
    }


    fun roll(pins: Int) {
        if (this.firstThrow === null)
            this.firstThrow = pins
        else
            this.secondThrow = pins
    }
}