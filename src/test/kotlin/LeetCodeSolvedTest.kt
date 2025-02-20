import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class LeetCodeSolvedTest {

    @Test
    fun findOcurrences() {
//       given
        val text= "alice is a good girl she is a good student"
        val first = "a"
        val second = "good"

        //       when
        val result:Array<String> = LeetCodeSolved().findOcurrences(text,first,second)

//       then
        val expectation = arrayOf("girl","student")

        assertArrayEquals(expectation,result)


    }
}