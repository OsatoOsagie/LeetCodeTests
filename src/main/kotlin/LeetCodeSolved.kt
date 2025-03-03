import java.util.*
import kotlin.math.abs


class LeetCodeSolved {
    class SmallestInfiniteSet {

        val pq= PriorityQueue<Int>()

        var range= 1..1000

        init {
            pq.addAll( range )
        }

        fun addback(i: Int) {


            if (!pq.contains(i) ){
                pq.offer(i)
            }

        }

        fun popSmallest(): Int {
            return pq.poll()

        }

    }


}