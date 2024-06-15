package org.example.application.entity

class Player (
    private var name: String,
) {
    private var frames: List<Frame> = List(9) { NormalFrame() }
    private var scores: MutableList<Int> = MutableList(9) { 0 }
    private var currentFrameIndex: Int = 0

    fun getFrames(): List<Frame> {
        return this.frames
    }

    fun getName(): String {
        return this.name
    }

    fun getScores(): List<Int> {
        return this.scores
    }

    fun roll(pins: Int, onFrameEnd: () -> Unit = {}) {
        this.currentFrame().roll(pins)
        this.computeScores()

        if (this.currentFrame().hasEnded()) {
            this.currentFrameIndex ++

            onFrameEnd()
        }
    }

    private fun computeScores() {
        for ((i, frame) in this.frames.withIndex()) {
            var score = this.scores.elementAtOrElse(i - 1) { 0 } + frame.sum()

            this.scores[i] = score
        }
    }

    private fun currentFrame(): Frame {
        return this.frames[this.currentFrameIndex]
    }
}