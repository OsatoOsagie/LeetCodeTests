import java.util.*
import kotlin.collections.Set
import kotlin.math.min

class LeetCodeSolved {
    fun largestSumAfterKNegations(nums: IntArray, k: Int): Int {

        var ans = 0

        val pq= PriorityQueue<Int>()

        nums.forEach {
            pq.offer(it)
        }

        repeat(k){
            val value = pq.poll()
                pq.offer(-value)

        }
        for (i in 0 until pq.size){
            ans += pq.poll()

        }
        return ans
    }


}