import java.util.*
import kotlin.math.abs


class LeetCodeSolved {
    class KthLargest(k: Int, nums: IntArray) {

        val pq = PriorityQueue<Int>()
        val k = k;

        init {

            // Add all initial numbers using the add method.
            nums.forEach { add(it) }
        }


        fun add(i: Int):Int {
            if (pq.size < k || pq.peek() < i) {
                pq.offer(i)
                if (pq.size > k){
                    pq.poll()
                }
            }

            return pq.peek()
        }

    }


    fun findKthLargest(nums: IntArray, k: Int): Int {
        val pq= PriorityQueue<Int>(Comparator.reverseOrder())

        nums.forEach { pq.offer(it) }

        var ans=0

        repeat(k){
            ans=pq.poll()
        }

        return ans

    }


}