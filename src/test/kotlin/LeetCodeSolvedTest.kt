import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class LeetCodeSolvedTest {

    @Test
    fun unequalTriplets(){

//        given
        val nums= intArrayOf(4,4,2,4,3)

//        when
        val result: Int = LeetCodeSolved().unequalTriplets(nums)

//        then
        val expectation= 3

        assertEquals(expectation,result)

    }



}

