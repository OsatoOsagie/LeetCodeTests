import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class LeetCodeSolvedTest {


    @Test
    fun buildArray(){
//        given
        val nums = intArrayOf(5,0,1,2,3,4)

//        when
        val result:IntArray = LeetCodeSolved().buildArray(nums)

//        then
        val expectation = intArrayOf(4,5,0,1,2,3)

        assertArrayEquals(expectation,result)
    }


}

