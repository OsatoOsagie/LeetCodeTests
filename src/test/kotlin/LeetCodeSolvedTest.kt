import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class LeetCodeSolvedTest {

    @Test
    fun makeSmallestPalindrome(){
//        given
        val s= "seven"

//        when
        val result:String= LeetCodeSolved().makeSmallestPalindrome(s)

//        then
        val expectation= "neven"

        assertEquals(expectation,result)

    }



}

