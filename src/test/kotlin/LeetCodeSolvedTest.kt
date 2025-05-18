import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class LeetCodeSolvedTest {


    @Test
    fun finalString(){
//        given
        val s= "string"

//        when
        val result:String= LeetCodeSolved().finalString(s)

//        then

        val expected= "rtsng"

        assertEquals(expected,result)
    }



}

