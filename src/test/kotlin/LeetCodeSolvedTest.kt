import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class LeetCodeSolvedTest {


    @Test
    fun countSubarrays(){
//        given
      val nums = intArrayOf(1,4,2,1)
        val k=3

//        when
        val result:Long = LeetCodeSolved().countSubarrays(nums,k)


//        then
        val expectation = 0L

        assertEquals(expectation,result)


    }
}

