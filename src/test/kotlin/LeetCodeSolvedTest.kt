import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class LeetCodeSolvedTest {

    @Test
    fun isValid(){
//        given

        val s = "]"

//        when
        val result:Boolean = LeetCodeSolved().isValid(s)


//        then
        val expectation = false

        assertEquals(expectation,result)


    }






}

