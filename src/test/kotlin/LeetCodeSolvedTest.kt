import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class LeetCodeSolvedTest {

    @Test
    fun isAnagram(){
//        given
        val s= "a"
        val t= "ab"

//        when
        val result:Boolean = LeetCodeSolved().isAnagram(s,t)

//        then
        val expectation = false

        assertEquals(expectation,result)

    }






}

