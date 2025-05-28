import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class LeetCodeSolvedTest {

    @Test
    fun firstUnique(){
//        given
        val s= "leetcode"

//        when
        val result: Int = LeetCodeSolved().firstUnique(s)

//        then
        val expectation = 0

        assertEquals(expectation,result)
    }






}

