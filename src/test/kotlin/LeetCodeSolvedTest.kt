import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class LeetCodeSolvedTest {


    @Test
    fun minimumRecolors(){
//        given
        val blocks= "WBWBBBW"
        val k= 2

//        when

        val result:Int = LeetCodeSolved().minimumRecolors(blocks,k)

//        then
        val expectation = 0

        assertEquals(expectation,result)
    }


}

