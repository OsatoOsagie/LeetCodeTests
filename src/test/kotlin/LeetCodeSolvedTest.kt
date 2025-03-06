import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class LeetCodeSolvedTest {

  @Test
  fun maxNumberOfApples(){
//      given
      val weight= intArrayOf(900,950,800,1000,700,800)

//      when
      val result:Int = LeetCodeSolved().maxNumberOfApples(weight)


//      then
      val expectation=5

      assertEquals(expectation,result)
  }

}