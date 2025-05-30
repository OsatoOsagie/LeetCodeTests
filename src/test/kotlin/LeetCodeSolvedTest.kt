import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class LeetCodeSolvedTest {

    @Test
    fun next(){
//        given
        val size= 3
        val obj= LeetCodeSolved.MovingAverage(size)

//        when
        obj.next(1)
        obj.next(10)
        obj.next(3)
        val result:Double=obj.next(5)




//        then

        val expectation = 6.0

        assertEquals(expectation,result)
    }






}

