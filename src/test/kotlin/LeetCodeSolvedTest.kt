import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class LeetCodeSolvedTest {

    @Test
    fun connectSticks() {
//       given
        val sticks= intArrayOf(2,4,3)

//        when
        val result:Int = LeetCodeSolved().connectSticks(sticks)

//        then
        val expectation =14

        assertEquals(expectation,result)

    }
}