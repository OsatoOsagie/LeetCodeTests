import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class LeetCodeSolvedTest {

  @Test
  fun minSetSize(){

//      given
      val arr = intArrayOf(1,9)

//      when
      val result:Int = LeetCodeSolved().minSetSize(arr)


  //      then
      val expectation = 1

      assertEquals(expectation,result)
  }


}