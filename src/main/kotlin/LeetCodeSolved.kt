import java.util.*


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


}