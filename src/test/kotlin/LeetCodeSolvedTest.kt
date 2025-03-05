import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class LeetCodeSolvedTest {

  @Test
  fun maxArea(){
//      given
      val height = intArrayOf(1,8,6,2,5,4,8,3,7)

//      when
      val result:Int= LeetCodeSolved().maxArea(height)

//      then
      val expectation = 49

      assertEquals(expectation,result)



  }


}