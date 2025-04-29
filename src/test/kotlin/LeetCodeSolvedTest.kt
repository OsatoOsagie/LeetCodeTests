import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class LeetCodeSolvedTest {


    @Test
    fun maxIceCream(){
//        given
      val costs = intArrayOf(1,6,3,1,2,5)
        val coins= 20

//        when

        val result: Int = LeetCodeSolved.maxIceCream(costs, coins)

//        then
        val expectation = 6

        assertEquals(expectation,result)

    }
}

