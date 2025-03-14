import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class LeetCodeSolvedTest {

    @Test
    fun mergeAlternatively(){
//        given
        val word1= "abcd"
        val word2= "pq"

//        when

        val result:String = LeetCodeSolved().mergeAlternatively(word1,word2)

//        then
        val expectation = "apbqcd"

        assertEquals(expectation,result)
    }
}

