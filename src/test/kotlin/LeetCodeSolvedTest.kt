import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class LeetCodeSolvedTest {


    @Test
    fun countCompleteSubarrays(){
//        given
        val nums= intArrayOf(1,3,1,2,2)

//        when
        val result:Int =LeetCodeSolved().countCompleteSubarrays(nums)

//        then
        val expectation = 4

        assertEquals(expectation,result)

    }
}

