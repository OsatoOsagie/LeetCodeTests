import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class LeetCodeSolvedTest {


    @Test
    fun minProcessingTime(){
//        given
        val processorTime = listOf(121,99)
        val tasks = listOf(287,315,293,260,333,362,69,233)

//        when
        val result:Int = LeetCodeSolved().minProcessingTime(processorTime,tasks)

//        then
        val expectation= 461

        assertEquals(expectation,result)
    }


}

