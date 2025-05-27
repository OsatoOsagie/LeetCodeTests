import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class LeetCodeSolvedTest {

    @Test
    fun twoSum(){
//        given
        val nums= intArrayOf(3,2,4)
        val target = 6


//        when
        val result: IntArray = LeetCodeSolved().twoSum(nums,target)

    //        then
        val expectation = intArrayOf(1,2)

     assertArrayEquals(expectation,result)

    }






}

