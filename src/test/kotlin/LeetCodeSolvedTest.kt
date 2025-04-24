import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class LeetCodeSolvedTest {


    @Test
    fun corpFlightBookings(){
//        given
        val bookings = arrayOf(intArrayOf(1,2,10), intArrayOf(2,3,20), intArrayOf(2,5,25))
        val n =5

//        when
        val result:IntArray = LeetCodeSolved().corpFlightBookings(bookings,n)

//        then
        val expectation = intArrayOf(10,55,45,25,25)

        assertArrayEquals(result,expectation)
    }

}

