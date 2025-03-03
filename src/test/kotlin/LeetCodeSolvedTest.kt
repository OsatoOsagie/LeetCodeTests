import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class LeetCodeSolvedTest {

  @Test
  fun partitionArray(){
//      given
      val nums= intArrayOf(3,6,1,2,5)
      val k= 2


//      when
      val result:Int= LeetCodeSolved().partitionArray(nums,k)

//      then
      val expectation= 2

      assertEquals(expectation,result)
  }

}