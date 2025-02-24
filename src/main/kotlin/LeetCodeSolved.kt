import java.util.*


class LeetCodeSolved {
    fun halveArray(nums: IntArray): Int {
        var target = 0.0
        val heap = PriorityQueue(Comparator.reverseOrder<Double>())

        for (num in nums) {
            target += num
            heap.add(num.toDouble())
        }

        target /= 2.0
        var ans = 0
        while (target > 0) {
            ans++
            val x = heap.poll()
            target -= (x / 2)
            heap.add(x / 2)
        }

        return ans
    }


}