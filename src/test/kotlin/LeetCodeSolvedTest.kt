import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class LeetCodeSolvedTest {

    @Test
    fun carPooling() {
//       given
        val trips= arrayOf(intArrayOf(2,1,5), intArrayOf(3,3,7))
        val capacity =5

//       when
        val result:Boolean = LeetCodeSolved().carPooling(trips,capacity)

//       then
        val expectation = true

        assertEquals(expectation,result)




    }

}

