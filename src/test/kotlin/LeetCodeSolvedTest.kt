import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class LeetCodeSolvedTest {

    @Test
    fun topKFrequent(){
//        given
        val words= arrayOf("i","love","leetcode","i","love","coding")
        val k= 3

//        when
        val result:List<String> =LeetCodeSolved().topKFrequent(words,k)

//        then
        val expectation = listOf("i","love","coding")

        assertEquals(expectation,result)
    }
}