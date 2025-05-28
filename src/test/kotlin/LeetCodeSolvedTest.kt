import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class LeetCodeSolvedTest {

    @Test
    fun frequencySort(){
//        given
        val s = "tree"

//        when
        val result:String = LeetCodeSolved().frequencySort(s)


//        then
        val expectation = "eert"

        assertEquals(expectation,result)

    }






}

