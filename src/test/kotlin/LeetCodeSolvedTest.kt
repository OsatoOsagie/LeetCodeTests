import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class LeetCodeSolvedTest {

    @Test
    fun lengthOfLongestSubstring(){
//        given
        val s= "au"

//        when
        val result:Int = LeetCodeSolved().lengthOfLongestSubstring(s)

//        then
        val expectation= 2

        assertEquals(expectation,result)

    }






}

