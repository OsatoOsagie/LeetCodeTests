import java.util.*
import kotlin.collections.HashMap
import kotlin.math.abs

class GoodToKnow {

    fun isAnagram(s: String, t: String): Boolean {
        if (s.length != t.length) return false // Step 1: Check if lengths are equal

        val charCount = IntArray(26) // Step 2: Array to count occurrences of each character

        for (char in s) { // Step 3: Count characters in the first string
            charCount[char - 'a']++ // Increment the count for the character
        }

        for (char in t) { // Step 4: Subtract counts for characters in the second string
            charCount[char - 'a']-- // Decrement the count for the character
            if (charCount[char - 'a'] < 0) { // Step 5: If count goes negative, it's not an anagram
                return false
            }
        }

        return true // Step 6: If no negative counts, the strings are anagrams
    }

    fun minimizedStringLength(s: String): Int {
        val arr = IntArray(26)
        for (c in s) {
            arr[c - 'a']++
        }

        return arr.count { it > 0 }
    }

    private fun twoLargestNums(set:List<Int>): Pair<Int,Int>{
        var max1 = Int.MIN_VALUE
        var max2 = Int.MIN_VALUE
        if (set.size > 1) {
            for (num in set) {
                if (num >= max1) {
                    max2 = max1
                    max1 = num
                } else if (num > max2) {
                    max2 = num
                }
            }

        }
        return Pair(max1,max2)
    }

    fun topKFrequent(nums: IntArray, k: Int): IntArray {

        val map = HashMap<Int, Int>()

        nums.forEach {
            map.put(it, map.getOrDefault(it, 0) +1)
        }

        val list = map.entries.map { Pair(it.key, it.value) }.toMutableList()
        list.sortByDescending { it.second }

        return list.take(k).map { it.first }.toIntArray()
    }

    fun findClosestElements(arr: IntArray, k: Int, x: Int): List<Int> {
        val heap = PriorityQueue<Int> { n1, n2 ->
            if (abs(n1 - x) == abs(n2 - x)) {
                n2 - n1
            } else {
                abs(n2 - x) - abs(n1 - x)
            }
        }

        for (num in arr) {
            heap.add(num)
            if (heap.size > k) {
                heap.remove()
            }
        }



        return heap.sorted()
    }

//    val map= licensePlateNew.groupingBy { it }.eachCount()


//    char to int
//    ( s[left] -'0') + (s[right] -'0') %10
}