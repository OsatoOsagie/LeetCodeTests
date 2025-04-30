import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class LeetCodeSolvedTest {


    @Test
    fun findNumbers() {
//        given
        val nums = intArrayOf(555,901,482,1771)



//        when
val result:Int= LeetCodeSolved().findNumbers(nums)

//        then
        val expectation=1

        assertEquals(expectation,result)




    }
}

