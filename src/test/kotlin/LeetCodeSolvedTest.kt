import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class LeetCodeSolvedTest {

    @Test
    fun findClosestElements(){
//        given
        val arr= intArrayOf(1,2,3,4,5)
        val k=4
        val x=3

//        when
        val result:List<Int> = LeetCodeSolved().findClosestElements(arr,k,x)


//        then
        val expectation = listOf<Int>(1,2,3,4)

        assertEquals(expectation,result)

    }
}