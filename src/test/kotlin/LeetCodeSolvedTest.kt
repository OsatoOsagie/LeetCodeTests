import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class LeetCodeSolvedTest {

  @Test
  fun maximum69Number(){

//      given
      val num= 669

//      when
      val result:Int = LeetCodeSolved().maximum69Number(num)

//      then
      val expectation = 969

      assertEquals(expectation,result)

  }


}