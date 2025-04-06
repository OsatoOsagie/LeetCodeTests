import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class LeetCodeSolvedTest {

    @Test
    fun hasSameDigits(){
//        given
       val s= "139"

//        when
        val result:Boolean = LeetCodeSolved().hasSameDigits(s)


    //        then
        val expectation = false

        assertEquals(expectation,result)

//
    }


}

