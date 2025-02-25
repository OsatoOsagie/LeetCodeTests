import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class LeetCodeSolvedTest {

   @Test
   fun minStoneSum(){
//       given

       val piles= intArrayOf(5,4,9)
       val k=2
//       when
       val result:Int = LeetCodeSolved().minStoneSum(piles,k)

//       then
       val expectation = 12

       assertEquals(expectation,result)
   }
}