import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class LeetCodeSolvedTest {

    @Test
    fun compress(){
//        given

        val chars = charArrayOf('a')

//        when
        val result:Int = LeetCodeSolved().compress(chars)


//        then
        val expectation = 1

        assertEquals(expectation,result)


    }






}

