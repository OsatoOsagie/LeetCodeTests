import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class LeetCodeSolvedTest {

  @Test
  fun closestPrimes(){
//      given
      val left=4
      val right= 6


//      when
      val result:IntArray = LeetCodeSolved().closestPrimes(left, right)

//      then
      val expectation = intArrayOf(-1,-1)

      assertArrayEquals(expectation,result)
  }

}