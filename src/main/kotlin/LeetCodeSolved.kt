import java.util.*
import kotlin.math.pow
import kotlin.math.sqrt

class LeetCodeSolved {

    fun corpFlightBookings(bookings: Array<IntArray>, n: Int): IntArray {
        val furthestFlight= bookings.maxOf { it[1] }
        fun corpFlightBookings(bookings: Array<IntArray>, n: Int): IntArray {
            val furthestFlight= bookings.maxOf { it[1] }

            val line = IntArray(n)

            for (booking in bookings){
                val first= booking[0]
                val last= booking[1]
                val seat= booking[2]

                for (i in first..last){
                    line[i-1]+=seat
                }
            }

            return line

        }
        val line = IntArray(n)

        for (booking in bookings){
            val first= booking[0]
            val last= booking[1]
            val seat= booking[2]

            for (i in first..last){
                line[i-1]+=seat
            }
        }

        return line

    }


}