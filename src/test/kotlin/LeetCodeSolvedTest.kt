import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class LeetCodeSolvedTest {

    @Test
    fun search() {
//        given
        val nums = intArrayOf(-1, 0, 3, 5, 9, 12)
        val target = 9


    //        when
        val result:Int = LeetCodeSolved().search(nums, target)


//        then
        val expectation = 4

        assertEquals(expectation,result)
    }


}