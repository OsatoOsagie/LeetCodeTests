import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class LeetCodeSolvedTest {

    @Test
    fun maxSlidingWindow(){
//        given
        val nums = intArrayOf(1)
        val k = 1

//        when
        val result:IntArray = LeetCodeSolved().maxSlidingWindow(nums, k)

//        then

        val expectation = intArrayOf(1)

        assertArrayEquals(expectation,result)

    }







}

