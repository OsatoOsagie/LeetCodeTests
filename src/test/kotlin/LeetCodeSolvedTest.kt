import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class LeetCodeSolvedTest {

    @Test
    fun shortestCompletingWord() {
//       given

        val licensePlate = "TE73696"
        val words = arrayOf("ten","two","better","talk","suddenly","stand","protect","collection","about","southern")

//       when
        val result:String = LeetCodeSolved().shortestCompletingWord(licensePlate,words)



//       then
        val expectation = "ten"

        assertEquals(expectation,result)



    }

}

