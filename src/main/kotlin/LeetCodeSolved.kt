import java.util.*
import kotlin.math.abs


class LeetCodeSolved {
    fun topKFrequent(words: Array<String>, k: Int): List<String> {
        val map = mutableMapOf<String, Int>()
        // Count the frequencies of each word.
        words.forEach { word ->
            map[word] = map.getOrDefault(word, 0) + 1
        }

        // Create a min-heap with a comparator that:
        // - First orders by frequency (ascending).
        // - For equal frequencies, orders by lexicographical order descending.
        val priorityQueue = PriorityQueue<String> { a, b ->
            if (map[a]!! == map[b]!!) {
                b.compareTo(a)
            } else {
                map[a]!! - map[b]!!
            }
        }

        // Add each word into the heap, maintaining the heap size at most k.
        for (word in map.keys) {
            priorityQueue.offer(word)
            if (priorityQueue.size > k) {
                priorityQueue.poll()
            }
        }

        // Extract the words from the heap.
        val ans = mutableListOf<String>()
        repeat(k) {
            ans.add(priorityQueue.poll())
        }
        // The extracted list is in ascending order of frequency, so reverse it.
        return ans.reversed()
    }



}