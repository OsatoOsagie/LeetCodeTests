import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class LeetCodeSolvedTest {

  @Test
  fun combinationSum2(){
//      given
      val candidates = intArrayOf( 10,1,2,7,6,1,5)
      val target = 8

//      when

      val result:List<List<Int>> = LeetCodeSolved().combinationSum2(candidates,target)


//      then
      val expectation = listOf(listOf(1,1,6), listOf(1,2,5), listOf(1,7), listOf(2,6))

      assertEquals(expectation,result)

  }
}

