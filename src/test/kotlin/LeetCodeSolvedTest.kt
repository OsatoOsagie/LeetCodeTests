import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class LeetCodeSolvedTest {


    @Test
    fun removeTrailingZeros(){
//        given
        val num = "123"

//        when
        val result:String = LeetCodeSolved().removeTrailingZeros(num)

//        then
        val expectation = "123"

        assertEquals(expectation,result)

    }

}

