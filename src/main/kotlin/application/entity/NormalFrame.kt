package org.example.application.entity

class NormalFrame : Frame {
    private var firstThrow: Int? = null
    private val secondThrow: Int? = null

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
        this.firstThrow = pins
    }
}