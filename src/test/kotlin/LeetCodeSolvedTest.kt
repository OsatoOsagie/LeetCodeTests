import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class LeetCodeSolvedTest {

    @Test
    fun maxLengthBetweenEqualCharacters(){
//       given
        val s="mgntdygtxrvxjnwksqhxuxtrv"

//        when
        val result:Int = LeetCodeSolved().maxLengthBetweenEqualCharacters(s)

//        then

        val expectation = 18

        assertEquals(expectation,result)

    }



}

