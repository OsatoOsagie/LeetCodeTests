import java.util.*
import kotlin.math.floor


class LeetCodeSolved {
    fun minStoneSum(piles: IntArray, k: Int): Int {

        val maxHeap= PriorityQueue<Int>(Comparator.reverseOrder())

        piles.forEach { maxHeap.add(it) }

        repeat(k){
            val max= maxHeap.poll()
//            val remove= max-floor(max/2.0)
            maxHeap.add((max-floor(max/2.0)).toInt())
        }

        return maxHeap.sum()



    }


}