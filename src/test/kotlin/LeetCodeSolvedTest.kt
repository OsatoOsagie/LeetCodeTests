import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class LeetCodeSolvedTest {


@Test
fun groupAnagrams(){
//    given
    val strs = arrayOf("a")

//    when
    val result:List<List<String>> = LeetCodeSolved().groupAnagrams(strs)

//    then
    val expectation= listOf(listOf("a"))

    assertEquals(expectation,result)
}
}

