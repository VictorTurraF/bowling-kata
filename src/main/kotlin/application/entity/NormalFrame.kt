package org.example.application.entity

import org.example.application.entity.exceptions.RollingIsExceedingTotalPinsException

class NormalFrame : Frame {
    private var firstThrow: Int? = null
    private var secondThrow: Int? = null

    override fun sum(): Int {
        val first = this.firstThrow ?: 0
        val second = this.secondThrow ?: 0

        return first + second
    }

    override fun isSpare(): Boolean {
        val first = this.firstThrow ?: return false
        val second = this.secondThrow ?: return false

        return first + second == 10 && first != 10

    }

    override fun isStrike(): Boolean {
        return this.firstThrow == 10
    }


    fun roll(pins: Int) {
        if (pins > 10)
            throw RollingIsExceedingTotalPinsException()

        if (this.firstThrow === null)
            this.firstThrow = pins
        else {
            if ((this.firstThrow ?: 0) + pins > 10)
                throw RollingIsExceedingTotalPinsException()

            this.secondThrow = pins
        }
    }
}