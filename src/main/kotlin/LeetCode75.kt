import java.util.*
import kotlin.collections.ArrayDeque
import kotlin.collections.component1
import kotlin.collections.component2
import kotlin.collections.set
import kotlin.math.abs
import kotlin.math.absoluteValue
import kotlin.math.max
import kotlin.math.min


class LeetCode75 {

    fun mergeAlternatively(word1: String, word2: String): String {
        var i = 0
        var j = 0
        val sb = StringBuilder()

        while (i < word1.length && j < word2.length) {

            sb.append(word1[i])
            sb.append(word2[j])

            i++
            j++
        }

        while (i < word1.length) {
            sb.append(word1[i])
            i++
        }

        while (j < word2.length) {
            sb.append(word2[j])
            j++
        }
        return sb.toString()

    }


    fun kidsWithCandies(candies: IntArray, extraCandies: Int): List<Boolean> {
        //max of the candiees
        val max = candies.max()
        val answer = mutableListOf<Boolean>()

        for (i in candies) {
            if ((i + extraCandies >= max)) {
                answer.add(true)
            } else {
                answer.add(false)
            }
        }
        return answer

    }

    fun canPlaceFlowers(flowerBed: IntArray, n: Int): Boolean {

        var count = 0  // Tracks the number of flowers we can place

        for (i in flowerBed.indices) {
            // Check if the current plot is empty AND
            // the left neighbor (if exists) is empty AND
            // the right neighbor (if exists) is empty
            if (flowerBed[i] == 0 && (i == 0 || flowerBed[i - 1] == 0) && (i == flowerBed.size - 1 || flowerBed[i + 1] == 0)) {

                // Place a flower here
                flowerBed[i] = 1
                count++

                // Stop early if we placed enough flowers
                if (count >= n) {
                    return true
                }
            }
        }

        // Check if we placed enough flowers
        return count >= n

    }

    fun reverseVowels(s: String): String {

        val k = setOf('A', 'a', 'e', 'E', 'I', 'i', 'o', 'O', 'U', 'u')
        var left = 0
        val chars = s.toCharArray()
        var right = s.length - 1

        while (right > left) {
//            println("here")

            while (left < right && !k.contains(chars[left])) {
                left++
            }

            while (right > left && !k.contains(chars[right])) {
                right--
            }

            if (k.contains(chars[left]) && k.contains(chars[right])) {
                val temp = chars[left]
                chars[left] = chars[right]
                chars[right] = temp
            }

            left++
            right--
        }
        return chars.joinToString("")

    }

    fun reverseWords(s: String): String {


        val splitString = s.trim().split(" ")                // Split by spaces
            .filter { it.isNotBlank() }  // Remove blank or empty parts


        val sb = StringBuilder()

        for (i in splitString.size - 1 downTo 0) {

            sb.append(splitString[i])
            if (i != 0) sb.append(" ")

        }

        return sb.toString()
    }

    fun increasingTriplets(nums: IntArray): Boolean {
        var i = 0
        var j = 1
        var k = 2


        while (k < nums.size) {

            if ((nums[i] < nums[j]) && (nums[j] < nums[k])) {
                return true
            }
            i++
            j++
            k++
        }

        return false

    }

    fun moveZeros(nums: IntArray): Unit {

        var i = 0
        var j = 0

        while (j < nums.size && i < nums.size) {
            if (nums[i] != 0) {
                nums[j] = nums[i]
                j++
            }
            i++
        }

        while (j < nums.size) {
            nums[j] = 0
            j++
        }

    }

    fun isSubSequence(s: String, t: String): Boolean {
        var i = 0
        var j = 0
        var count = 0

        while (i < s.length && j < t.length) {


            if (s[i] == t[j]) {
                count++
                i++
            }
            j++

        }
        return i == s.length

    }

    fun findMaxAverage(nums: IntArray, k: Int): Double {

        var curr: Double = 0.0


        for (i in 0 until k) {
            curr += nums[i]

        }


        var ans = curr / k

        for (i in k until nums.size) {
            curr += nums[i] - nums[i - k]


            ans = max(ans, curr / k)

        }
        return ans


    }

    fun findDifference(nums1: IntArray, nums2: IntArray): List<List<Int>> {

        val map1 = mutableMapOf<Int, Int>()
        val map2 = mutableMapOf<Int, Int>()

        val list1 = mutableListOf<Int>()
        val list2 = mutableListOf<Int>()
        val ans = mutableListOf<List<Int>>()

        for (i in nums1) {
            map1[i] = map1.getOrPut(i) { 0 } + 1
        }

        for (i in nums2) {
            map2[i] = map2.getOrPut(i) { 0 } + 1
        }

        for (key in map1.keys) {
            if (!map2.containsKey(key)) {
                println(key)
                list1.add(key)
            }
        }
        for (key in map2.keys) {
            if (!map1.containsKey(key)) {
                list2.add(key)
            }
        }

        ans.add(list1)
        ans.add(list2)


        return ans


    }

    fun uniqueOccurrencies(arr: IntArray): Boolean {

        val mapOfOccurencies = mutableMapOf<Int, Int>()

        for (i in arr) {
            mapOfOccurencies[i] = mapOfOccurencies.getOrPut(i) { 0 } + 1
        }


        val hasDuplicateValues = mapOfOccurencies.values.size == mapOfOccurencies.values.distinct().size

        return hasDuplicateValues

    }

    fun maxVowels(s: String, k: Int): Int {
        var curr = 0
        val vowels = setOf('a', 'e', 'i', 'o', 'u')

        for (i in 0 until k) {
            if (s[i] in vowels) {
                curr++
            }
        }
        var maxAnswer = curr

        for (i in k until s.length) {

            if (s[i] in vowels) {
                curr++
            }

            if (s[i - k] in vowels) {
                curr--
            }
            maxAnswer = max(maxAnswer, curr)
        }
        return maxAnswer

    }

    fun longestOnes(nums: IntArray, k: Int): Int {
        var left = 0
        var zeros = 0
        var answer = 0

        for (right in nums.indices) {
            if (nums[right] == 0) {
                zeros++
            }
            while (zeros > k) {
                if (nums[left] == 0) {
                    zeros--
                }
                left++
            }
            answer = max(answer, right - left + 1)
        }
        return answer

    }

    fun longestSubarray(nums: IntArray): Int {

        var left = 0
        var flipped = 0
        var answer = 0

        for (right in 0 until nums.size) {
            if (nums[right] == 0) {
                flipped++

            }

            while (flipped > 1) {
                if (nums[left] == 0) {
                    flipped--
                }
                left++
            }
            answer = max(answer, right - left + 1)
        }
        return answer - 1
    }

    fun equalPairs(grid: Array<IntArray>): Int {

        val rows = mutableMapOf<Int, List<Int>>()
        val cols = mutableMapOf<Int, List<Int>>()
        val numCols = grid[0].size
        var count = 0

        for (i in grid.indices) {
            rows[i] = grid[i].toList()
        }

        for (i in 0 until numCols) {

            val col = mutableListOf<Int>()
            for (row in grid) {
                col.add(row[i])
            }
            cols[i] = col
        }

//        for(i in rows.values){
//            println(i.contentToString())
//        }
        for (i in rows.values) {
            println(i)
            if (cols.containsValue(i)) {
                count++
            }
        }
        return count

    }

    fun removeStars(s: String): String {
//        LIFO
        val stack = ArrayDeque<Char>()
        val sb = StringBuilder()

        for (i in s) {
            if (i == '*') {
                stack.removeLastOrNull()
            } else {

                stack.addLast(i)
            }
        }

        for (i in stack) {
            sb.append(i)
        }

        return sb.toString()

    }

    fun asteroidCollision(asteroids: IntArray): IntArray {
        val stack = ArrayDeque<Int>()

        for (i in asteroids) {
            if (i > 0) {
                // Asteroid moving to the right, add it to the stack
                stack.addLast(i)
            } else {
                // Asteroid moving to the left
                while (stack.isNotEmpty() && stack.last() > 0 && stack.last() < i.absoluteValue) {
                    // Top asteroid moving to the right is smaller, remove it
                    stack.removeLast()
                }

                if (stack.isEmpty() || stack.last() < 0) {
                    // Either the stack is empty, or the top asteroid is also moving left
                    stack.addLast(i)
                } else if (stack.last() == i.absoluteValue) {
                    // Top asteroid has the same size as the current one, both are destroyed
                    stack.removeLast()
                }
            }
        }

        return stack.toIntArray()
    }

    fun canConstruct(ransomNote: String, magazine: String): Boolean {

        val magazineMap = mutableMapOf<Char, Int>()



        for (i in magazine) {
            magazineMap[i] = magazineMap.getOrPut(i) { 0 } + 1
        }

        for (i in ransomNote) {
            if (!magazineMap.containsKey(i) || magazineMap[i] == 0) {
                return false
            }
            magazineMap[i] = magazineMap.getOrPut(i) { 0 } - 1
        }
        return true


    }

    fun isIsomorphic(s: String, t: String): Boolean {
        val map = mutableMapOf<Char, Char>()
        val set = mutableSetOf<Char>()


        for (i in 0 until s.length) {
            if (map.containsKey(s[i]) && map[s[i]] != t[i]) {
                return false
            } else {
                if (set.contains(t[i])) {
                    return false
                }
                set.add(t[i])
                map[s[i]] = map.getOrPut(s[i]) { t[i] }
            }
        }
        return true


    }

    fun twoSum(nums: IntArray, target: Int): IntArray {
        val numsMap = mutableMapOf<Int, Int>()

        for (i in nums.indices) {
            val complement = target - nums[i]
            if (numsMap.containsKey(complement)) {
                return intArrayOf(numsMap[complement]!!, i)
            }
            numsMap[nums[i]] = i
        }

        throw IllegalArgumentException("No two sum solution")
    }

    fun removeAnagrams(words: Array<String>): List<String> {
        val result = mutableListOf<String>()

        for (word in words) {
            if (result.isEmpty() || !isAnagram(result.last(), word)) {
                result.add(word)
            }
        }

        return result
    }

    fun isAnagram(s: String, t: String): Boolean {

        val sMap = mutableMapOf<Char, Int>()
        val tMap = mutableMapOf<Char, Int>()

        for (i in s) {
            sMap[i] = sMap.getOrPut(i) { 0 } + 1
        }

        for (i in t) {
            tMap[i] = tMap.getOrPut(i) { 0 } + 1
        }

        for ((i, v) in tMap) {
            if (!sMap.containsKey(i)) {
                return false
            } else {
                if (sMap.get(i) != v) {
                    return false
                }
            }

        }

        for ((i, v) in sMap) {
            if (!tMap.containsKey(i)) {
                return false
            } else {
                if (tMap.get(i) != v) {
                    return false
                }
            }

        }


        return true
    }

    fun containsNearbyDuplicates(nums: IntArray, k: Int): Boolean {
        val numsMap = mutableMapOf<Int, Int>()

        for (i in nums.indices) {
            if (numsMap.containsKey(nums[i]) && i - numsMap.get(nums[i])!! <= k) {
                return true
            }
            numsMap[nums[i]] = i

        }

        return false
    }

    fun wordPattern(pattern: String, s: String): Boolean {
        val words = s.split(" ")
        if (words.size != pattern.length) return false

        val matchers = mutableMapOf<Char, String>()
        val usedWords = mutableSetOf<String>()

        for (i in pattern.indices) {
            val char = pattern[i]
            val word = words[i]

            if (matchers.containsKey(char)) {
                if (matchers[char] != word) return false
            } else {
                if (word in usedWords) return false
                matchers[char] = word
                usedWords.add(word)
            }
        }

        return true
    }

    fun minSubArray(nums: IntArray, target: Int): Int {
        var left = 0;
        var curr = 0
        var answer = Int.MAX_VALUE

        for (i in nums.indices) {
            curr += nums[i]

            while (curr >= target) {
                answer = min(answer, i - left + 1)
                curr -= nums[left]
                left++
            }

        }
        return if (answer == Int.MAX_VALUE) 0 else answer

    }

    fun lengthOfLongestSubstring(s: String): Int {
        var left = 0
        val seenChars = mutableSetOf<Char>()
        var answer = Int.MIN_VALUE

        for (i in s.indices) {

            while (seenChars.contains(s[i])) {

                seenChars.remove(s[left])
                left++

            }
            seenChars.add(s[i])
            answer = max(answer, i - left + 1)
//            println(left)
            println(seenChars.size)

        }
        return answer
    }

    fun successfulPairs(spells: IntArray, potions: IntArray, success: Int): IntArray {
        // Sort potions array for binary search
        potions.sort()
        val ans = IntArray(spells.size)

        for (i in spells.indices) {
            ans[i] = countSuccessfulPairs(spells[i], potions, success)
        }

        return ans
    }

    private fun countSuccessfulPairs(spell: Int, potions: IntArray, target: Int): Int {
        var left = 0
        var right = potions.size - 1

        // Binary search for the first potion where spell * potion >= target
        while (left <= right) {
            val mid = left + (right - left) / 2

            if (spell.toLong() * potions[mid] >= target) { // Use `toLong()` to prevent overflow
                right = mid - 1 // Narrow the search space to the left
            } else {
                left = mid + 1 // Narrow the search space to the right
            }
        }

        // All potions from `left` to the end of the array are successful
        return potions.size - left
    }

    fun searchInsert(nums: IntArray, target: Int): Int {

        var left = 0
        var right = nums.size - 1

        while (left <= right) {
            var mid = left + (right - left) / 2

            if (nums[mid] == target) {
                return mid
            }
            if (nums[mid] > target) {
                right = mid - 1
            } else {
                left = mid + 1
            }


        }
        return left
    }

    fun searchMatrix(matrix: Array<IntArray>, target: Int): Boolean {
        val rowSize = matrix.size
        val colSize = matrix[0].size
        var left = 0
        var right = rowSize * colSize - 1

        while (left <= right) {
            var mid = left + (right - left) / 2
            var row = mid / rowSize
            var col = mid % colSize
            var num = matrix[row][col]

            if (num == target) {
                return true
            }

            if (num < target) {
                left = mid + 1
            } else {
                right = mid - 1
            }
        }

        return false

    }

    fun findPeakElement(nums: IntArray): Int {
        var left = 0
        var right = nums.size - 1

        while (left < right) {
            val mid = right - (right - left) / 2

            if (nums[mid] > nums[mid + 1]) {
                right = mid
            } else {
                left = mid + 1
            }
        }
        return left

    }

    fun twoSumOneIndex(numbers: IntArray, target: Int): IntArray {

        val map = mutableMapOf<Int, Int>()

        for (i in 0 until numbers.size) {

            val c = target - numbers[i]

            if (map.containsKey(c)) {
                return intArrayOf(map[c]!! + 1, i + 1)
            }
            map[numbers[i]] = map.getOrPut(numbers[i]) { i }
        }
        throw IllegalArgumentException("Invalid input")

    }

    fun isValid(s: String): Boolean {
        val stack = ArrayDeque<Char>()
        val matchingBrackets = mapOf(')' to '(', '}' to '{', ']' to '[')
        val setOfClose = setOf(')', '}', ']')

        for (i in s) {
            when {
                i in setOfClose -> {
                    // Check if the stack is empty or the top of the stack doesn't match
                    if (stack.isEmpty() || stack.last() != matchingBrackets[i]) {
                        return false
                    }
                    stack.removeLast() // Pop the stack
                }

                else -> {
                    stack.addLast(i) // Push to stack
                }
            }
        }

        return stack.isEmpty() // If the stack is empty, all brackets are matched

    }

    fun simplifyPath(path: String): String {
        val stack = ArrayDeque<String>()
        val splitCommand = path.split('/').filter { it.isNotEmpty() }
        val answer = StringBuilder()

        for (i in 0 until splitCommand.size) {
            when {
                splitCommand[i] == ".." -> {
                    if (!stack.isEmpty()) {
                        stack.removeLast()
                    }

                }

                splitCommand[i] == "." -> {
                    continue
                }

                else -> {
//                    println("here")
//                    println(splitCommand[i])
                    stack.addLast(splitCommand[i])
                }
            }

        }
//        println(stack.size)

        if (stack.isEmpty()) {
            answer.append('/')
        }

        for (i in 0 until stack.size) {

            answer.append('/')
            println("here")
            answer.append(stack[i])


        }

        return answer.toString()


    }

    fun evalRPN(tokens: Array<String>): Int {
        val stack = ArrayDeque<String>()
        val operator = setOf("+", "-", "*", "/")

        for (i in tokens) {
            when {
                i in operator -> {
                    if (stack.isNotEmpty()) {
                        val a = stack.removeLast().toInt()
                        val b = stack.removeLast().toInt()
                        when (i) {
                            "+" -> stack.addLast((a + b).toString())
                            "-" -> stack.addLast((b - a).toString())
                            "*" -> stack.addLast((a * b).toString())
                            "/" -> stack.addLast((b / a).toString())
                        }
                    }

                }

                else -> {
                    stack.addLast(i)
                }
            }
        }
        return stack.removeLast().toInt()
    }

    fun compress(chars: CharArray): Int {
        //sort the array
        chars.sort()
        val map = mutableMapOf<Char, Int>()
        var counter = 1

        for (i in 1 until chars.size) {
            map[chars[i]] = map.getOrPut(chars[i]) { 0 } + 1
        }

        for (i in 1 until chars.size) {
            if (chars[i] != chars[i - 1]) {
                val x = map.get(chars[i - 1])
                if (x != null) {
                    chars[i] = x.toChar()
                }
            }

        }


        return map.size * 2


    }

    fun maxOperations(nums: IntArray, k: Int): Int {
        var left = 0
        var right = nums.size - 1
        var count = 0

        nums.sort()

        while (left < right) {

            val b = nums[left] + nums[right]
            if (b == k) {
                count++;
                left++
                right--
            } else if (b > k) {
                right--

            } else {
                left++
            }


        }

        return count

    }

    fun maxArea(height: IntArray): Int {

        var left = 0
        var right = height.size - 1
        var ans = 0


        while (left < right) {
            val w = right - left
            val h = minOf(height[left], height[right])
            val a = w * h
            ans = maxOf(ans, a)

            // Move the pointer with smaller height
            if (height[left] < height[right]) {
                left++

            } else {
                right--
            }
        }

        return ans


    }

    fun largestAltitude(gain: IntArray): Int {

        val prefix = IntArray(gain.size + 1)
        prefix[0] = 0

        for (i in 1..gain.size) {
            prefix[i] = prefix[i - 1] + gain[i - 1]
        }



        return prefix.max()

    }

    fun dailyTemperatures(temperatures: IntArray): IntArray {
        val stack = ArrayDeque<Int>()
        val ans = IntArray(temperatures.size)

        for (i in 0 until temperatures.size) {

            while (stack.isNotEmpty() && temperatures[stack.last()] < temperatures[i]) {
                val lastIndex = stack.removeLast()
                ans[lastIndex] = i - lastIndex


            }
//                println(i)
            stack.addLast(i)

        }
//        for (i in ans){
//            println(i)
//        }

        return ans

    }

    fun finalPrices(prices: IntArray): IntArray {
        val ans = IntArray(prices.size)
        val stack = ArrayDeque<Int>()

        for (num in prices.indices) {
//            println(num)

            while (stack.isNotEmpty() && prices[stack.last()] >= prices[num]) {
                val lastIndex = stack.removeLast()
                ans[lastIndex] = prices[lastIndex] - prices[num]
            }
            stack.addLast(num)
            println(stack.last())
        }

        if (stack.isNotEmpty()) {
            for (i in stack) {
                ans[i] = prices[i]
            }
        }
        return ans


    }

    fun nextGreaterElement(nums1: IntArray, nums2: IntArray): IntArray {
        val stack = ArrayDeque<Int>() // Monotonic decreasing stack
        val nextGreaterMap = mutableMapOf<Int, Int>() // Map to store next greater element for nums2 elements

        // Traverse nums2 from right to left
        for (num in nums2.reversed()) {
            // Remove elements from stack that are smaller than or equal to current number
            while (stack.isNotEmpty() && stack.last() <= num) {
                stack.removeLast()
            }

            // If stack is not empty, the top of the stack is the next greater element
            nextGreaterMap[num] = if (stack.isNotEmpty()) stack.last() else -1

            // Push the current number onto the stack
            stack.addLast(num)
        }

        // Build the result for nums1 using the precomputed map
        return nums1.map { nextGreaterMap[it] ?: -1 }.toIntArray()


    }

    fun deleteMiddleNode(head: ListNode?): ListNode? {
        // Edge case: if the list is empty or has only one node
        if (head == null || head.next == null) return null

        var slow = head
        var fast = head
        var prev: ListNode? = null


        while (fast?.next != null) {
            prev = slow
            slow = slow?.next
            fast = fast.next?.next
        }

        prev?.next = prev?.next?.next

        return head

    }

    fun deleteDuplicates(head: LeetCode75.ListNode): LeetCode75.ListNode? {
        var x: LeetCode75.ListNode? = head

        while (x?.next != null) {
            if (x.`val` == x.next?.`val`) {
                x.next = x.next?.next
            } else {
                x = x.next
            }


        }

        return head

    }

    fun deleteDuplicatesII(head: LeetCode75.ListNode): LeetCode75.ListNode {
        var x: LeetCode75.ListNode = head
        val set = mutableSetOf<Int>()

        while (x.next != null) {

            if (x.`val` == x.next?.`val`) {
                x.next = x.next?.next
                set.add(x.`val`)
            } else {
                x = x.next!!
            }
        }

        return head
    }

    fun reverseList(head: LeetCode75.ListNode?): LeetCode75.ListNode? {
        var prev: ListNode? = null
        var cur: ListNode? = head


        while (cur != null) {
            val nextNode = cur.next
            cur.next = prev
            prev = cur
            cur = nextNode

        }

        return prev

    }

    fun pairSum(head: LeetCode75.ListNode?): Int {
        if (head == null || head.next == null) return 0

        // Step 1: Find the middle of the list using fast and slow pointers
        var slow = head
        var fast = head
        while (fast != null && fast.next != null) {
            slow = slow?.next
            fast = fast.next?.next
        }

        // Step 2: Reverse the second half of the list
        var reversedSecondHalf = reverseList(slow)

        // Step 3: Find maximum pair sum
        var maxSum = 0
        var firstHalf = head
        var secondHalf = reversedSecondHalf

        while (secondHalf != null) {
            val pairSum = firstHalf?.`val`!! + secondHalf.`val`
            maxSum = maxOf(maxSum, pairSum)
            firstHalf = firstHalf.next
            secondHalf = secondHalf.next
        }

        return maxSum

    }

    fun oddEvenList(head: LeetCode75.ListNode?): LeetCode75.ListNode? {

        var odd = head
        var even = head?.next
        var evenHead = even

        while (even != null && even.next != null) {

            odd?.next = odd?.next?.next
            even.next = even.next?.next

            odd = odd?.next
            even = even.next
        }
        odd?.next = evenHead

        return head

    }

    fun hasCycle(head: LeetCode75.ListNode?): Boolean {

        if (head == null || head.next == null) {
            return false
        }

        var slow = head
        var fast = head

        while (fast != null && fast.next != null) {
            slow = slow?.next
            fast = fast.next?.next

            if (fast == slow) {
                return true
            }


        }
        return false

    }

    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode {


        return ListNode(1)
    }


    private fun getDigits(num: Long): List<Int> {
        val digits = mutableListOf<Int>()
        var n = num

        while (n > 0) {
            digits.add((num % 10).toInt())
            n /= 10
        }

        return digits
    }

    fun mergeTwoLists(l1: LeetCode75.ListNode?, l2: LeetCode75.ListNode?): LeetCode75.ListNode? {
        var head1 = l1
        var head2 = l2

        // Initialize the answer list's head
        val ansHead = ListNode(0) // Dummy node
        var current = ansHead

        // Merge the two lists
        while (head1 != null && head2 != null) {
            if (head1.`val` <= head2.`val`) {
                current.next = head1
                head1 = head1.next
            } else {
                current.next = head2
                head2 = head2.next
            }
            current = current.next!! // Move the pointer to the newly added node
        }

        // Attach the remaining nodes
        current.next = head1 ?: head2

        return ansHead.next // Return the merged list, skipping the dummy node

    }

    fun minDepth(root: TreeNode<Int>?): Int {
        if (root == null) {
            return 0
        }

        val left = minDepth(root.left)
        val right = minDepth(root.right)

        // If one child is null, return the depth of the other child + 1
        if (root.left == null || root.right == null) {
            return left + right + 1
        }

        return min(left, right) + 1

    }

    fun leafSimilar(root1: TreeNode<Int>?, root2: TreeNode<Int>?): Boolean {
        // Helper function to collect leaf values
        fun getLeafValues(root: TreeNode<Int>?): List<Int> {
            val leafValues = mutableListOf<Int>()

            fun dfs(node: TreeNode<Int>?) {
                if (node == null) return

                // If it's a leaf node, add its value
                if (node.left == null && node.right == null) {
                    leafValues.add(node.`val`)
                    return
                }

                // Recur for left and right subtrees
                dfs(node.left)
                dfs(node.right)
            }

            dfs(root)
            return leafValues
        }

        // Get leaf sequences for both trees
        val leaves1 = getLeafValues(root1)
        val leaves2 = getLeafValues(root2)

        // Compare the two sequences
        return leaves1 == leaves2
    }

    fun goodNodes(root: LeetCode75.TreeNode<Int>?): Int {
        fun dfs(node: TreeNode<Int>?, maxSoFar: Int): Int {
            if (node == null) {
                return 0
            }

            val left = dfs(node.left, max(maxSoFar, node.`val`))
            val right = dfs(node.right, max(maxSoFar, node.`val`))
            var ans = left + right
            if (node.`val` >= maxSoFar) {
                ans += 1
            }

            return ans
        }

        return dfs(root, Int.MIN_VALUE)

    }

    fun invertTree(root: LeetCode75.TreeNode<Int>?): LeetCode75.TreeNode<Int>? {


        if (root == null) {
            return null
        }
        val temp = root.left
        root.left = root.right
        root.right = temp

        invertTree(root.left)
        invertTree(root.right)
        return root


    }

    fun isHappy(n: Int): Boolean {
        val seen = mutableSetOf<Int>()
        var num = n




        while (!seen.contains(num)) {
            seen.add(num)
            num = squareDigits(num)

            if (num == 1) {
                return true
            }


        }

        return !seen.contains(num)


    }

    fun squareDigits(n: Int): Int {
        var num = n
        var sum = 0

        while (num != 0) {
            val x = num % 10
            num /= 10
            sum += x * x
        }
        return sum
    }


    fun summaryRanges(nums: IntArray): List<String> {

        val result = mutableListOf<String>()
        if (nums.isEmpty()) return result // Edge case: empty array

        var start = nums[0] // Start of the current range

        for (i in 1 until nums.size) {
            if (nums[i] != nums[i - 1] + 1) {
                // If current number is not consecutive, finalize the current range
                result.add(formatRange(start, nums[i - 1]))
                start = nums[i] // Start a new range
            }
        }

        // Finalize the last range
        result.add(formatRange(start, nums[nums.size - 1]))

        return result
    }

    // Helper function to format the range
    fun formatRange(start: Int, end: Int): String {
        return if (start == end) "$start" else "$start->$end"
    }

    fun rotate(nums: IntArray, k: Int) {
        val n = nums.size
        val rotations = k % n

        // Step 1: Reverse the entire array
        reverse(nums, 0, n - 1)

        // Step 2: Reverse the first 'rotations' elements
        reverse(nums, 0, rotations - 1)

        // Step 3: Reverse the remaining elements
        reverse(nums, rotations, n - 1)
    }

    // Helper function to reverse part of an array
    fun reverse(nums: IntArray, start: Int, end: Int) {
        var left = start
        var right = end

        while (left < right) {
            val temp = nums[left]
            nums[left] = nums[right]
            nums[right] = temp
            left++
            right--
        }
    }

    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        if (strs.isEmpty()) return listOf(listOf()) // Handle edge case

        val map = mutableMapOf<String, MutableList<String>>()

        for (word in strs) {
            val key = word.toCharArray().sorted().joinToString("") // Use sorted key as a String
            map.getOrPut(key) { mutableListOf() }.add(word) // Add word to the group
        }

        return map.values.toList() // Convert map values to a list
    }

    fun isPalindrome(x: Int): Boolean {

        val y = x.toString().toCharArray()
        var i = 0
        var j = y.size - 1

        while (i < j) {
            if (y[i].code != y[j].code) {
                return false
            }
            i++
            j--

        }
        return true

    }

    fun arraytoDigit(x: IntArray): Int {

        var num = 0
        for (i in x.indices) {
            num += x[i]
            if (i != x.size - 1) {
                num *= 10
            }


        }
        return num


    }

    fun plusOne(x: IntArray): IntArray {

        var num = arraytoDigit(x)
        num += 1


        val list = mutableListOf<Int>()

        while (num != 0) {
            val j = num % 10
            num /= 10

            println(j)
            list.add(j)
        }
        return list.toIntArray().reversedArray()


    }

    fun pow(x: Double, n: Int): Double {

        if (n == 0) return 1.0 // Handle x^0 case

        var ans = 1.0
        val isNegative = n < 0 // Check if the power is negative
        val exponent = abs(n) // Use the absolute value of the exponent

        for (i in 1..exponent) {
            ans *= x
        }

        return if (isNegative) 1 / ans else ans // Handle negative powers

    }

    fun mySqrt(x: Int): Int {
        if (x == 0 || x == 1) {
            return x
        }

        var low = 1
        var high = x / 2
        var ans = 0

        while (low <= high) {
            val mid = low + (high - low) / 2
            val square = mid.toLong() * mid

            if (square == x.toLong()) {
                return mid
            } else if (square < x.toLong()) {
                ans = mid // Update ans to the current mid
                low = mid + 1
            } else {
                high = mid - 1
            }
        }

        return ans
    }

    fun maximumProduct(nums: IntArray): Int {

        var curr = 1
        val k = 3

        for (i in 0 until k) {
            curr *= abs(nums[i])
        }

        var ans = curr

        for (i in k until nums.size) {
            println("got here")
            curr = (curr / nums[i - k]) * nums[i]
            ans = max(ans, curr)
        }

        return ans


    }

    fun findErrorsNums(nums: IntArray): IntArray {

        val map = mutableMapOf<Int, Int>()
        val ans = IntArray(2)

        // The full range of numbers should be 1..nums.size
        val range = (1..nums.size).toSet()

        // Populate the map with counts and find the duplicate
        for (num in nums) {
            map[num] = map.getOrPut(num) { 0 } + 1
            if (map[num]!! > 1) {
                ans[0] = num // Duplicate number
            }
        }

        // Find the missing number
        val missingNumber = range.subtract(map.keys).firstOrNull()
        if (missingNumber != null) {
            ans[1] = missingNumber
        }

        return ans
    }

    fun equalFrequency(word: String): Boolean {
        val mutableMap = mutableMapOf<Char, Int>()

        for (w in word) {
            mutableMap[w] = mutableMap.getOrPut(w) { 0 } + 1

        }

        val overTwo = mutableMap.filter { it.value >= 2 }


        if (overTwo.size > 1) {
            return false
        } else {
            val count = overTwo.values.firstOrNull()

            if (count != null) {
                if (count > 2) {
                    return false
                }
            }
        }

        return true


    }

    fun longestConsecutive(nums: IntArray): Int {
        if (nums.isEmpty()) return 0 // Handle edge case: empty array

        val numSet = nums.toSet() // Use a HashSet for O(1) lookups
        var longestStreak = 0

        for (num in numSet) {
            // Start a sequence only if the current number is the beginning of a sequence
            if (!numSet.contains(num - 1)) {
                var currentNum = num
                var currentStreak = 1

                // Expand the sequence as long as the next consecutive number exists
                while (numSet.contains(currentNum + 1)) {
                    currentNum += 1
                    currentStreak += 1
                }

                // Update the longest streak
                longestStreak = maxOf(longestStreak, currentStreak)
            }
        }

        return longestStreak

    }

//    fun getSum(a: Int, b: Int): Int {
//        val lst= mutableListOf<Int>()
//        var x=a
//        var y=b
//
//
//
//        sum(x, lst)
//
//
//
//        if (lst.isEmpty()){
//            return 0
//        }
//
//        return lst.size
//
//    }

//    private fun sum(x: Int, lst: MutableList<Int>):Int {
//        var x1 = x
//        if (x1 > 0) {
//            for (i in 1..x1) {
//                lst.add(1)
//                println(lst.size)
//            }
//        } else {
//            println("got  here")
//            while (x1 != 0) {
//                lst.removeLastOrNull()
//                x1 += 1
//
//            }
//        }
//    }

    fun longestPalindrome(s: String): Int {
        val map = mutableMapOf<Char, Int>()
        var length = 0
        var hasOdd = false

        for (char in s) {
            map[char] = map.getOrPut(char) { 0 } + 1
        }

        map.values.forEach {
            length += (it / 2) * 2
            if (it % 2 == 1) {
                hasOdd = true // Track if there's an odd frequency
            }
        }

        return if (hasOdd) length + 1 else length

    }

    fun getSneakyNumbers(nums: IntArray): IntArray {

        val map = mutableMapOf<Int, Int>()
        val list = IntArray(2)
        var count = 0

        for (num in nums) {
            map[num] = map.getOrPut(num) { 0 } + 1

            if (map[num]!! > 1) {
                list[count] = num
                count++
            }
        }

        return list


    }

    fun numberOfPairs(nums1: IntArray, nums2: IntArray, k: Int): Int {

        val numsPower = nums2.map { it * k }
        val map = mutableMapOf<Int, Int>()
        var count = 0

        for (num in nums1) {
            map[num] = map.getOrPut(num) { 0 } + 1
        }

        for (n in numsPower) {
            println(n)
            for (key in map.keys) {
                println("$key")
                if ((n != 0 && (key % n) == 0)) {

                    count += map[key]!!
                }
            }
        }

        return count


    }

    fun findIntersectionValues(nums1: IntArray, nums2: IntArray): IntArray {

        val map1 = HashMap<Int, Int>()
        val map2 = HashMap<Int, Int>()

        var ans1 = 0
        var ans2 = 0

        for (num in nums1) {
            map1[num] = map1.getOrDefault(num, 0) + 1
        }
        for (num in nums2) {
            map2[num] = map2.getOrDefault(num, 0) + 1
        }

        for (key in map1.keys) {
            println(key)
            if (map2.containsKey(key)) {

                ans1 += map1[key]!!
                ans2 += map2[key]!!
            }
        }



        return intArrayOf(ans1, ans2)

    }

    fun minimizedStringLength(s: String): Int {

        val set = HashSet<Char>()

        s.forEach { set.add(it) }

        return set.size

    }

    fun maxFrequency(nums: IntArray): Int {
        val map = HashMap<Int, Int>()

        nums.forEach { map[it] = map.getOrDefault(it, 0) + 1 }

        val max = map.maxByOrNull { it.value }

        return map.filter { it.value == (max?.value ?: 0) }.values.sum()

    }

    fun uncommonFromSentences(s1: String, s2: String): Array<String> {

        val map1 = HashMap<String, Int>()
        val map2 = HashMap<String, Int>()
        val ans = mutableListOf<String>()

        val s3 = s1.split(" ")
        val s4 = s2.split(" ")

        s3.forEach { map1[it] = map1.getOrDefault(it, 0) + 1 }
        s4.forEach { map2[it] = map2.getOrDefault(it, 0) + 1 }


        for ((key, value) in map1) {
            if (!map2.containsKey(key) && value == 1) {
                println(key)
                ans.add(key)
            }
        }


        for ((key, value) in map2) {
            if (!map1.containsKey(key) && value == 1) {
                println(key)
                ans.add(key)
            }
        }



        return ans.toTypedArray()


    }

    fun twoOutOfThree(nums1: IntArray, nums2: IntArray, nums3: IntArray): List<Int> {

        val map = HashMap<Int, Int>()
        val set = HashSet<Int>()
        nums1.forEach {
            map[it] = map.getOrDefault(it, 0) + 1
        }

        nums2.toSet().forEach {
            if (map.containsKey(it)) {
                set.add(it)
            } else {
                map[it] = map.getOrDefault(it, 0) + 1
            }


        }

        nums3.toSet().forEach {
            if (map.containsKey(it)) {
                set.add(it)
            } else {
                map[it] = map.getOrDefault(it, 0) + 1
            }

        }

        return set.toList()

    }

    fun findMissingAndRepeatedValues(grid: Array<IntArray>): IntArray {
        val maps = HashMap<Int, Int>()
        val ans = IntArray(2)

        for (i in 0 until grid.size) {
            for (j in 0 until grid[i].size) {
                maps[grid[i][j]] = maps.getOrDefault(grid[i][j], 0) + 1

                if (maps[grid[i][j]] == 2) {
                    ans[0] = grid[i][j]
                }
            }
        }

        val gridSize = grid.size * grid.size


        for (i in gridSize downTo 1) {
            if (!maps.containsKey(i)) {
                ans[1] = i
            }
        }

        return ans


    }

    fun countBalls(lowLimit: Int, highLimit: Int): Int {
        val map = HashMap<Int, Int>()

        val range = lowLimit..highLimit

        for (i in range) {

            if (i < 10) {
                map[i] = map.getOrDefault(i, 0) + 1
            } else {
                val boxNum = getBoxNum(i)
                map[boxNum] = map.getOrDefault(boxNum, 0) + 1
            }
        }



        return map.maxOf { it.value }

    }

    private fun getBoxNum(ballNum: Int): Int {
        var x = ballNum
        var sum = 0

        while (x > 0) {

            sum += x % 10
            x /= 10
        }
        return sum
    }

    fun duplicateNumbersXOR(nums: IntArray): Int {


        val map = HashMap<Int, Int>()
        val lst = ArrayList<Int>()

        for (num in nums) {

            map[num] = map.getOrDefault(num, 0) + 1

            if (map[num] == 2) {
                lst.add(num)
            }
        }

        if (lst.size == 0) {
            return 0
        } else {
            return lst.reduce { acc, num -> acc xor num }
        }


    }

    fun isArraySpecial(nums: IntArray): Boolean {

        if (nums.size == 1) {
            return true
        }

        var j: Int = 1

        for (i in 0 until nums.size - 1) {
            if (isEven(nums[i]) == isEven(nums[j])) {
                return false
            }
            j++
        }
        return true
    }

    private fun isEven(num: Int): String {

        if (num % 2 == 0) {
            return "Even"
        } else {
            return "Odd"
        }
    }

    fun check(nums: IntArray): Boolean {
        val numsSorted = nums.sorted()
        var x = 0

        for (i in 0 until numsSorted.size) {
            if (nums[i] == numsSorted[(i + x) % nums.size]) {
                return true
            }
            x++
        }

        return false

    }

    fun longestMonotonicSubarray(nums: IntArray): Int {
        return maxOf(strictlyIncreasing(nums), strictlyDecreasing(nums))


    }

    fun strictlyIncreasing(nums: IntArray): Int {
        if (nums.isEmpty()) return 0

        var left = 0
        var answer = 1

        for (right in 1 until nums.size) {
            // Use a while loop to adjust the left pointer if the sequence is not strictly increasing
            while (left < right && nums[right] <= nums[right - 1]) {
                left = right
            }
            // Update the answer with the maximum length found so far
            answer = max(answer, right - left + 1)
        }

        return answer
    }

    fun strictlyDecreasing(nums: IntArray): Int {
        if (nums.isEmpty()) return 0

        var left = 0
        var answer = 1

        for (right in 1 until nums.size) {
            // Use a while loop to adjust the left pointer if the sequence is not strictly increasing
            while (left < right && nums[right] >= nums[right - 1]) {
                left = right
            }
            // Update the answer with the maximum length found so far
            answer = max(answer, right - left + 1)
        }

        return answer
    }

    fun maxAcendingSum(nums: IntArray): Int {

        if (nums.isEmpty()) return 0

        var left = 0
        var answer = 0
        var curr = 0

        for (right in 0 until nums.size) {
            curr += nums[right]

            while (left < right && nums[right] < nums[right - 1]) {
                curr -= nums[left]
                left++
            }
            curr += nums[right]
            answer = max(answer, curr)

        }
        return answer


    }

    fun merge(intervals: Array<IntArray>): Array<IntArray> {

        intervals.sortWith(compareBy { it[0] })

        val ans = LinkedList<IntArray>()

        for (interval in intervals) {
            val start = interval[0]
            val end = interval[1]

            if (ans.isNotEmpty() && start <= ans.last[1]) {
                ans.last[1] = max(ans.last[1], end)
            } else {
                ans.add(interval)
            }
        }

        return ans.toTypedArray()

    }

    fun insert(intervals: Array<IntArray>, newInterval: IntArray): Array<IntArray> {


        val newIntervals = Array(intervals.size + 1) { i ->
            if (i < intervals.size) intervals[i].copyOf() else intArrayOf() // Copy existing elements, empty for new one
        }

        newIntervals.sortWith(compareBy { it[0] })

        val ans = LinkedList<IntArray>()

        for (i in newIntervals) {
            val start = i[0]
            val end = i[1]
            if (ans.isNotEmpty() && start <= ans.last[1]) {
                ans.last[1] = max(end, ans.last[1])

            } else {
                ans.add(i)
            }
        }

        return ans.toTypedArray()

    }

    fun areAlmostEqual(s1: String, s2: String): Boolean {
        var count = 0
        val map1 = HashMap<Char, Int>()
        val map2 = HashMap<Char, Int>()

        s1.forEach { map1[it] = map1.getOrDefault(it, 0) + 1 }
        s2.forEach { map2[it] = map2.getOrDefault(it, 0) + 1 }

        for ((key, value) in map1) {

            if (!map2.containsKey(key)) {
                return false
            } else if (map2.containsKey(key)) {
                if (map2[key] != value) {
                    return false
                }
            }
        }

        for (i in 0 until s1.length) {
            if (s1[i] != s2[i]) {
                count++
            }
        }

        if (count == 0 || count == 2) {
            return true
        }

        return false


    }

    fun separateDigits(nums: IntArray): IntArray {
        val ans = ArrayList<Int>()

        for (i in nums) {
            if (i < 10) {
                ans.add(i)
            } else {
                var n = i
                var digits = ArrayDeque<Int>()
                while (n > 0) {
                    digits.addFirst((n % 10))
                    n /= 10
                }


                while (digits.isNotEmpty()) {
                    ans.add(digits.removeFirst())
                }


            }
        }

//        ans.forEach { println(it) }
        return ans.toIntArray()
    }

    fun findRelativeRanks(score: IntArray): Array<String> {
        val ans = Array<String>(score.size) { "" }

        val sortedScores = score.sortedArrayDescending()

        val map = mutableMapOf<Int, Int>()

        for (i in 0 until sortedScores.size) {
            map[sortedScores[i]] = map.getOrDefault(sortedScores[i], i)
        }

        for (i in 0 until score.size) {

            if (map[score[i]] == 0) {
                ans[i] = "Gold Medal"
            } else if (map[score[i]] == 1) {
                ans[i] = "Silver Medal"
            } else if (map[score[i]] == 2) {
                ans[i] = "Bronze Medal"
            } else {
                ans[i] = map[score[i]]?.plus(1).toString()
            }

        }

        return ans

    }

    fun countBadPairs(nums: IntArray): Long {
        val mutableMap = mutableMapOf<Int, Int>()
        var count = 0

        for (i in 0 until nums.size) {

            mutableMap[i] = mutableMap.getOrDefault(i, nums[i] - i)
        }

        for (j in 0 until nums.size) {
            val sub = mutableMap.filter { it.key < j }.filter { it.value != nums[j] - j }
            println("keys ${sub.keys}")
            println("values ${sub.values}")
            println("j $j")
            count += sub.size


        }
        return count.toLong()

    }

    fun sumIndicesWithKSetBits(nums: List<Int>, k: Int): Int {

        var count = 0
        for (i in 0 until nums.size) {
            var setBits = i.countOneBits()
            if (setBits == k) {

                count += nums[i]
            }

        }

        return count


    }

    fun stringSequence(target: String): List<String> {
        val stack = ArrayDeque<Char>()
        val ans = mutableListOf<String>()

        for (i in target) {

            stack.addLast('a')
//            println(i)

            while (stack.last() != i) {
                println("current $i")
                ans.add(stack.joinToString(""))
                val char = stack.removeLast() + 1
//                println("New char $char")
                stack.addLast(char)

            }
            ans.add(stack.joinToString(""))


        }
        return ans
    }

    class NumberContainers() {

        private val container = mutableMapOf<Int, Int>()

        fun change(index: Int, number: Int) {
            println(number)
            container[index] = number

            container.forEach { (key, value) ->
                println("key:$key: $value") // ✅ Correct (same as println(value))
            }

        }


        fun find(number: Int): Int {
            val firstKey = container.filter { it.value == number }.keys.firstOrNull()

            if (firstKey == null) {
                return -1
            } else {
                return firstKey
            }
        }

    }


    val memo = mutableMapOf<Int, Int>()

    fun minCostClimbingStairs(cost: IntArray): Int {
        return dp(cost.size, cost);

    }

    fun dp(i: Int, cost: IntArray): Int {
        if (i <= 1) {
            // 3. Base cases
            return 0
        }

        if (memo.containsKey(i)) {
            return memo[i]!!
        }


        // 2. Recurrence relation
        memo[i] = min((dp(i - 1, cost) + cost[i - 1]).toDouble(), (dp(i - 2, cost) + cost[i - 2]).toDouble()).toInt()
        return memo[i]!!
    }

    fun clearDigits(s: String): String {
        val stack = ArrayDeque<Char>()

        for (i in s) {
            if (stack.isNotEmpty()) {
                if (i.isDigit() && !stack.last().isDigit()) {
                    stack.removeLast()
                } else {
                    stack.addLast(i)
                }
            } else {
                stack.addLast(i)
            }
        }



        return if (stack.isEmpty()) "" else stack.joinToString("")

    }

    fun removeOccurrences(s: String, part: String): String {
        val partSize = part.length
        val result = StringBuilder()

        for (i in s) {
            result.append(i)

            if (result.length >= part.length && result.substring(result.length - part.length) == part) {
                result.setLength(result.length - part.length)
            }
        }
        return result.toString()


    }

    fun carFleet(target: Int, position: IntArray, speed: IntArray): Int {

        val stack = ArrayDeque<Int>()
        val arr = mutableListOf<Pair<Int, Int>>()

        for (i in 0 until position.size) {
            arr.add(Pair(position[i], speed[i]))
        }

        arr.sortWith(compareBy { it.first })

        for (t in arr.size - 1 downTo 0) {
            val time = (target - arr[t].first) / arr[t].second
            println(time)
            if (stack.isNotEmpty() && time > stack.last()) {
                stack.addLast(time)
            }

            if (stack.isEmpty()) {
                stack.addLast(time)
            }
        }
        return stack.size

    }

    fun maximumSum(nums: IntArray): Int {
        val mutableMap = HashMap<Int, MutableList<Int>>()
        var maxSum = -1

        for (i in nums) {
            val sum = sumDigits(i)
            mutableMap.getOrPut(sum) { mutableListOf() }.add(i)
        }

        mutableMap.values.forEach {
            if (it.size > 1) {
                val pair = sortIt(it)
                val a = pair.first
                val b = pair.second
                maxSum = maxOf((a + b), maxSum)
            }
        }

        return maxSum

    }

    private fun sortIt(set: List<Int>): Pair<Int, Int> {
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
        return Pair(max1, max2)
    }

    private fun sumDigits(digit: Int): Int {
        var num = digit
        var sum = 0

        while (num > 0) {

            sum += num % 10
            num /= 10
        }

        return sum

    }

    fun minOperations(nums: IntArray, k: Int): Int {
        val pq = PriorityQueue<Long>(nums.map { it.toLong() })
        var count = 0



        while (pq.isNotEmpty() && pq.peek() < k) {
            val x = pq.poll()
            val y = pq.poll()

            val newValue = (x * 2) + y // Avoid recomputation of x*2
            pq.add(newValue)
            count++
        }

        return count

    }

    fun twoSmallestNums(list: List<Long>): Pair<Long, Long> {
        var max1 = Long.MAX_VALUE
        var max2 = Long.MAX_VALUE
        if (list.size > 1) {
            for (num in list) {
                if (num <= max1) {
                    max2 = max1
                    max1 = num.toLong()
                } else if (num < max2) {
                    max2 = num.toLong()
                }
            }

        }
        return Pair(max1, max2)
    }


//    class ProductOfNumbers() {
//        private val stack = mutableListOf<Int>()
//
//        fun add(num: Int) {
//            stack.addLast(num)
//
//        }
//
//        fun getProduct(k: Int): Int {
//            var product = 1
//            val size = stack.size
//
//            if (k > size) return 1  // If `k` is greater than stack size, return 1
//
//            for (i in size - k until size) {  // Correctly access last `k` elements
//                product *= stack.elementAt(i)
//            }
//
//            return product
//        }
//
//
//    }


    class NumArray(nums: IntArray) {
        private val prefix: IntArray = IntArray(nums.size)

        init {
            prefix[0] = nums[0]
            for (i in 1 until nums.size) {
                prefix[i] = prefix[i - 1] + nums[i]
            }
        }

        fun sumRange(left: Int, right: Int): Int {
            return if (left == 0) {
                prefix[right]
            } else {
                prefix[right] - prefix[left - 1]
            }


        }
    }


    class RecentCounter() {

        private val queue: ArrayDeque<Int> = ArrayDeque()

        fun ping(t: Int): Int {
            // Remove all elements that are out of the 3000ms range
            while (queue.isNotEmpty() && queue.first() < t - 3000) {
                queue.removeFirst()
            }

            // Add the new request timestamp
            queue.addLast(t)

            // Return the number of requests within the range
            return queue.size
        }
    }


    class StockSpanner() {
        private val stack = ArrayDeque<Int>()
        private val list = mutableListOf<Int>()


        fun next(price: Int): Int {
            val currentIndex = list.size
            list.add(price)

            while (stack.isNotEmpty() && list[stack.last()] <= price) {
                stack.removeLast()
            }

            val ans = if (stack.isNotEmpty()) {
                currentIndex - stack.last()
            } else {
                currentIndex + 1 // All previous prices are smaller
            }

            // Add the current index to the stack
            stack.addLast(currentIndex)

            return ans

        }

    }


    data class ListNode(
        var `val`: Int, var next: ListNode? = null
    )


    data class TreeNode<T>(
        val `val`: T, var left: TreeNode<T>? = null, var right: TreeNode<T>? = null
    )


}