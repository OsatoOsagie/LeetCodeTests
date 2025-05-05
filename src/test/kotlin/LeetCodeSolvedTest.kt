import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class LeetCodeSolvedTest {


    @Test
    fun minimumSubarrayLength(){
//        given

        val nums = intArrayOf(1,2,3)
        val k=2

//        when
        val result:Int = LeetCodeSolved().minimumSubarrayLength(nums,k)

//        then
        val expectation = 1

        assertEquals(expectation,result)

    }

}

