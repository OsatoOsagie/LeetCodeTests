import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class LeetCodeSolvedTest {


    @Test
    fun findComplement(){
//        given
        val num =1

//        when
        val result:Int =LeetCodeSolved().findComplement(num)

//        then
        val expectation =0

        assertEquals(expectation,result)

    }

}

