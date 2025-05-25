import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class LeetCodeSolvedTest {


    @Test
    fun checkDistances(){
//        given
        val s= "abaccb"
        val distance = intArrayOf(1,3,0,5,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)
//        when

        val result: Boolean = LeetCodeSolved().checkDistances(s,distance)

//        then
        val expectation = true

        assertEquals(expectation, result)

    }



}

