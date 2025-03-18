import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class LeetCodeSolvedTest {

  @Test
  fun combinationSum3(){
//      given

      val k= 3
      val n=9

//      when

      val result:List<List<Int>> = LeetCodeSolved().combinationSum3(k,n)


//      then
      val expectation = listOf(listOf(1,2,6), listOf(1,3,5), listOf(2,3,4))

      assertEquals(expectation,result)

  }
}

