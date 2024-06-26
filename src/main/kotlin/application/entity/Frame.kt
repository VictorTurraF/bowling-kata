package org.example.application.entity

interface Frame {

    fun sum(): Int

    fun isSpare(): Boolean

    fun isStrike(): Boolean

    fun roll(pins: Int)

    fun hasEnded(): Boolean

    fun getFirstThrow(): Int
}