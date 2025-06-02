import jdk.jfr.Frequency
import java.util.PriorityQueue
import kotlin.math.abs
import kotlin.math.absoluteValue
import kotlin.math.sign

class LeetCodeSolved {
    fun maxSlidingWindow(nums: IntArray, k: Int): IntArray {
        val deque = ArrayDeque<Int>() // store indices
        val ans = mutableListOf<Int>()

        for (i in nums.indices) {
            // Remove out-of-window indices
            if (deque.isNotEmpty() && deque.first() <= i - k) {
                deque.removeFirst()
            }

            // Remove all smaller elements from the end
            while (deque.isNotEmpty() && nums[deque.last()] < nums[i]) {
                deque.removeLast()
            }

            // Add current index
            deque.addLast(i)

            // Start adding results once we fill the first window
            if (i >= k - 1) {
                ans.add(nums[deque.first()]) // Max in current window
            }
        }

        return ans.toIntArray()
    }



}