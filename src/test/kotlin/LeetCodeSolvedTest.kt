import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class LeetCodeSolvedTest {

    @Test
    fun moveZeroes(){
//        given

        val nums = intArrayOf(0)

//        when
        LeetCodeSolved().moveZeros(nums)


//        then
        val expectation = intArrayOf(0)

        assertArrayEquals(expectation,nums)


    }






}

