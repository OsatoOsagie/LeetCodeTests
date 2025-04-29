import java.util.*

class LeetCodeSolved {
    companion object {
        fun maxIceCream(costs: IntArray, coins: Int): Int {

            val pq= PriorityQueue<Int>().apply { costs.forEach { this.offer(it) } }
            var balance=coins
            var count=0

            while (pq.isNotEmpty() && balance >= pq.peek()){
                balance -= pq.poll()
                count++
            }

            return count
        }
    }


}