import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class LeetCodeSolvedTest {

  @Test
  fun numRescueBoats(){
//      given
      val people = intArrayOf(3,2,1,2)
      val limit = 6

//      when
      val result:Int = LeetCodeSolved().numRescueBoats(people,limit)

//      then
      val expectation = 2


      assertEquals(expectation,result)
  }


}