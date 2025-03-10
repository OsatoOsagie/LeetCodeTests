import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class LeetCodeSolvedTest {

    @Test
    fun maximumUnits() {
//      given
        val boxTypes = arrayOf(
            intArrayOf(1, 3),
            intArrayOf(5, 5),
            intArrayOf(2, 5),
            intArrayOf(4, 2),
            intArrayOf(4, 1),
            intArrayOf(3, 1),
            intArrayOf(2,2),
            intArrayOf(1,3),
            intArrayOf(2,5),
            intArrayOf(3,2),
        )

        val truckSize = 35

//      when
        val result: Int = LeetCodeSolved().maximumUnits(boxTypes, truckSize)

//      then
        val expectation = 76

        assertEquals(expectation, result)
    }

}