import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class LeetCodeSolvedTest {

    @Test
    fun checkTwoChessboards(){
//       given

        val coordinate1 = "a1"
        val coordinate2 = "h3"

//        when

        val result: Boolean = LeetCodeSolved().checkTwoChessboards(coordinate1,coordinate2)

//        then
        val expectation = false

        assertEquals(expectation,result)



    }



}

