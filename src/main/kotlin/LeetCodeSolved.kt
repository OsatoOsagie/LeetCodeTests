import java.util.*
import kotlin.math.abs


class LeetCodeSolved {
    class SeatManager(n: Int) {

        val minStack= PriorityQueue<Int>()
        val size=n

        init {
            for (i in 1..size){
                minStack.offer(i)
            }
        }
        
        fun reserve(): Int {
            return minStack.poll()

        }

        fun unReserve(seatNumber: Int) {
            minStack.offer(seatNumber)

        }

    }


}