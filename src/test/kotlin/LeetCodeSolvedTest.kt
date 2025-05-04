import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class LeetCodeSolvedTest {


    @Test
    fun numEquivDominoPairs(){
//        given

val dominoes = arrayOf(intArrayOf(1,2), intArrayOf(1,2), intArrayOf(1,1), intArrayOf(5,6))

//        when
        val result:Int = LeetCodeSolved().numEquivDominoPairs(dominoes)

//        then
        val expectation = 1

        assertEquals(expectation,result)
    }


}

