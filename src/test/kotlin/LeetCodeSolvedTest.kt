import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class LeetCodeSolvedTest {


    @Test
    fun largestSumAfterKNegations(){
//        given
        val nums= intArrayOf(2,-3,-1,5,-4)
        val k=2

//        when
        val result:Int = LeetCodeSolved().largestSumAfterKNegations(nums, k)

//        then
        val expectation = 13

        assertEquals(expectation,result)

    }

}

