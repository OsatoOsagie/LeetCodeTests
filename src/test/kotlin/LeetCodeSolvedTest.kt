import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class LeetCodeSolvedTest {

   @Test
   fun combinationSum(){
//       given
       val candidates = intArrayOf(2,3,6,7)
       val target = 7


//       when
       val result:List<List<Int>> = LeetCodeSolved().combinationSum(candidates,target)

//       then
       val expectation = listOf(listOf(2,2,3), listOf(7) )

       assertEquals(expectation,result)

   }

}

