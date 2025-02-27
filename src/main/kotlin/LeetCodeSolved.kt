import java.util.*
import kotlin.collections.HashMap


class LeetCodeSolved {

    fun connectSticks(sticks: IntArray): Int {
        var sum = 0

        val minHeap = PriorityQueue<Int>()

        sticks.forEach { minHeap.add(it) }

        if (minHeap.size == 0) {
            return sum
        }

        while (minHeap.size > 1) {
            println(minHeap.size)

            val x = minHeap.poll()
            val y = minHeap.poll()
            val i = x + y
            minHeap.add(i)
            sum += i


        }

        return sum

    }

    fun topFrquentK(nums: IntArray, k: Int): IntArray {

        val map= HashMap<Int,Int>()
        val pq=PriorityQueue<Int>(Comparator.reverseOrder())
        val ans= mutableSetOf<Int>()

        nums.forEach {

            map[it]=map.getOrPut(it){0}+1
        }



        for (value  in map.values){
//            println("vale $value")
            pq.offer(value)
        }
//        println(pq)

        for (i in 0 until k){
            val value = pq.poll()
            val key = map.entries.firstOrNull { it.value == value }?.key
            key?.let { ans.add(it) }
            map.remove(key)


        }
        return ans.toIntArray()


    }


}