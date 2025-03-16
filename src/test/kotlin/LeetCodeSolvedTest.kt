import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class LeetCodeSolvedTest {

  @Test
  fun percentageLetter(){
//      given
      val s = "jjjj"
      val letter = "k"

//      when
     val result:Int = LeetCodeSolved().percentageLetter(s,letter)

//      then
      val expectation = 0

      assertEquals(expectation,result)

  }
}

