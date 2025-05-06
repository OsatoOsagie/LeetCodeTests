import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class LeetCodeSolvedTest {


    @Test
    fun sortEvenOdd(){
//        given
        val nums= intArrayOf(2,1)
//        when
        val result:IntArray = LeetCodeSolved().sortEvenOdd(nums)

//        then
        val expectation = intArrayOf(2,1)

        assertArrayEquals(expectation,result)
    }

}

