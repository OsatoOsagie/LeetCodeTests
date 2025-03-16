import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class LeetCodeSolvedTest {

  @Test
  fun letterCombinations(){
//      given
      val digits= "23"

//      when
      val result:List<String> = LeetCodeSolved().letterCombinations(digits)

//      then
      val expectation= listOf("ad","ae","af","bd","be","bf","cd","ce","cf")

      assertEquals(expectation,result)
  }
}

