import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class LeetCodeSolvedTest {


    @Test
    fun countDigits(){
//        gven
        val num =1248

//        when

        val result:Int = LeetCodeSolved().countDigits(num)

//        then
        val expectation = 4

        assertEquals(expectation,result)

    }


}

