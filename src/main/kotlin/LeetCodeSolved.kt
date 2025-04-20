import java.util.*
import kotlin.math.abs
import kotlin.math.pow
import kotlin.math.sign
import kotlin.math.sqrt

class LeetCodeSolved {
    fun kClosest(nums: Array<IntArray>, k: Int): Array<IntArray> {

        val pq = PriorityQueue<Pair<Int, Double>>(compareBy { it.second })

        for (i in 0 until nums.size){
            val sqrRoot=  sqrt(nums[i][0].toDouble().pow(2.0) + nums[i][1].toDouble().pow(2.0))
            pq.offer(Pair(i,sqrRoot))
        }

        val ans= mutableListOf<IntArray>()

        for (i in 0 until k){
            println()
            ans.add(nums[pq.poll().first])
        }

        return ans.toTypedArray()



    }


}