import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class LeetCodeSolvedTest {

    @Test
    fun merge(){
//        given
        val intervals = arrayOf(intArrayOf(1,3), intArrayOf(2,6), intArrayOf(8,10), intArrayOf(15,18))

//        when
        val result:Array<IntArray> = LeetCodeSolved().merge(intervals)

//        then
        val expectation = arrayOf(intArrayOf(1,6), intArrayOf(8,10), intArrayOf(15,18))

        assertTrue(expectation.contentDeepEquals(result), "The nested arrays are not equal.")

    }







}

