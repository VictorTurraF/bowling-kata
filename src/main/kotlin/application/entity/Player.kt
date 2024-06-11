package org.example.application.entity

class Player (
    private var name: String,
    private var frames: List<Frame> = List(9) { NormalFrame() }
) {

    fun getFrames(): List<Frame> {
        return this.frames
    }

    fun getName(): String {
        return this.name
    }

    fun roll(pins: Int) {

    }
}