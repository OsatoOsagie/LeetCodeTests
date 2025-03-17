import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class LeetCodeSolvedTest {

  @Test
  fun divideArray(){
//      given
      val nums= intArrayOf(1,2,3,4)

//      when
   val result:Boolean = LeetCodeSolved().divideArray(nums)


//      then
   val expectation = false

      assertEquals(expectation,result)

  }
}

