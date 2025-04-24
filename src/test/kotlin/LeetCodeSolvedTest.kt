import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class LeetCodeSolvedTest {


   @Test
   fun targetIndices(){
//       given
       val nums= intArrayOf(1,2,5,2,3)
       val target=5

//       when

       val result:List<Int> = LeetCodeSolved().targetIndices(nums,target)

//       then
       val expectation = listOf(4)

       assertEquals(expectation,result)
   }
}

