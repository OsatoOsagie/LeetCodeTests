import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class LeetCodeSolvedTest {

    @Test
    fun rearrangeArray() {
//        given

        val nums = intArrayOf(3, 1, -2, -5, 2, -4)

//        when
        val result: IntArray = LeetCodeSolved().rearrangeArray(nums)


    //        then
        val expectation = intArrayOf(3,-2,1,-5,2,-4)


        assertArrayEquals(expectation,result)


    }


}

