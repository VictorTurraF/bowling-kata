import org.example.application.entity.NormalFrame
import org.example.application.entity.exceptions.RollingIsExceedingTotalPinsException
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue
import kotlin.test.assertFailsWith

class NormalFrameTest {

    @Test
    fun testTrue() {
        assertTrue(true)
    }

    @Test
    fun testNormalFrameShouldThrowOnce() {
        val frame = NormalFrame()

        frame.roll(4)

        assertEquals(frame.sum(), 4)
    }

    @Test
    fun testNormalFrameShouldThrowTwice() {
        val frame = NormalFrame()

        frame.roll(3)
        frame.roll(4)

        assertEquals(frame.sum(), 7)
    }

    @Test
    fun shouldNotRollTenPinsInTheFirstThrow() {
        val frame = NormalFrame()

        val exception = assertFailsWith<RollingIsExceedingTotalPinsException> {
            frame.roll(11)
        }

        assertEquals("The total pins amount should not be greater then 10 pins", exception.message)
    }
}