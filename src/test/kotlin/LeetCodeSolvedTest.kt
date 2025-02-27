import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class LeetCodeSolvedTest {

    @Test
    fun topKFrequent(){
//        given
        val nums = intArrayOf(4,1,-1,2,-1,2,3)
        val k = 2
//        when

        val result:IntArray = LeetCodeSolved().topFrquentK(nums, k)

//        then
        val expectation = intArrayOf(2,-1)

        assertArrayEquals(expectation,result)
    }
}