import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class LeetCodeSolvedTest {

    @Test
    fun getAverages() {
//       given
        val nums = intArrayOf(7, 4, 3, 9, 1, 8, 5, 2, 6)
        val k = 3

//       when
        val result: IntArray = LeetCodeSolved().getAverages(nums, k)


//       then
        val expectation = intArrayOf(-1, -1, -1, 5, 4, 4, -1, -1, -1)

        assertArrayEquals(expectation, result)


    }

}

