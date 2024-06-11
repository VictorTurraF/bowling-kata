import org.example.application.entity.NormalFrame
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

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
}