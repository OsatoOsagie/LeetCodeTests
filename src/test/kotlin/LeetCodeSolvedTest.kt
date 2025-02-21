import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class LeetCodeSolvedTest {

    @Test
    fun findPeaks(){
//        given
        val mountain= intArrayOf(1,4,3,8,5)
//        when
        val result:List<Int> = LeetCodeSolved().findPeaks(mountain)

//        then
        val expectation= listOf(1,3)

        assertEquals(expectation,result)
    }
}