import kotlin.collections.ArrayDeque
import kotlin.collections.List
import kotlin.collections.component1
import kotlin.collections.component2
import kotlin.collections.distinct
import kotlin.collections.filter
import kotlin.collections.getOrPut
import kotlin.collections.indices
import kotlin.collections.isNotEmpty
import kotlin.collections.iterator
import kotlin.collections.joinToString
import kotlin.collections.linkedMapOf
import kotlin.collections.max
import kotlin.collections.mutableListOf
import kotlin.collections.mutableMapOf
import kotlin.collections.mutableSetOf
import kotlin.collections.set
import kotlin.collections.setOf
import kotlin.collections.sort
import kotlin.collections.toIntArray
import kotlin.collections.toList
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
            if (flowerBed[i] == 0 &&
                (i == 0 || flowerBed[i - 1] == 0) &&
                (i == flowerBed.size - 1 || flowerBed[i + 1] == 0)
            ) {

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


        val splitString = s.trim()
            .split(" ")                // Split by spaces
            .filter { it.isNotBlank() }  // Remove blank or empty parts


        val sb = StringBuilder()

        for (i in splitString.size-1 downTo 0) {

            sb.append(splitString[i])
            if (i !=0)
            sb.append(" ")

        }

        return sb.toString()
    }

    fun increasingTriplets(nums: IntArray): Boolean {
        var i=0
        var j=1
        var k= 2


        while (k < nums.size){

            if ((nums[i] < nums[j]) && (nums[j] < nums[k])){
                return true
            }
            i++
            j++
            k++
        }

        return false

    }

    fun moveZeros(nums: IntArray): Unit {

        var i=0
        var j= 0

        while (j < nums.size && i < nums.size){
            if (nums[i] !=0){
                nums[j] = nums[i]
                j++
            }
           i++
        }

        while (j< nums.size) {
            nums[j] =0
            j++
        }

    }

    fun isSubSequence(s: String, t: String): Boolean {
        var i=0
        var j=0
        var count=0

        while (i < s.length && j < t.length){



            if (s[i] == t[j]){
                count++
                i++
            }
            j++

        }
        return i == s.length

    }

    fun findMaxAverage(nums: IntArray, k: Int): Double {

        var curr:Double =0.0


        for (i in 0 until k){
            curr += nums[i]

        }


        var ans=curr/k

        for (i in k until nums.size ){
            curr += nums[i] - nums[i-k]


            ans = max(ans,curr/k)

        }
        return ans



    }

    fun findDifference(nums1: IntArray, nums2: IntArray): List<List<Int>> {

        val map1 = mutableMapOf<Int,Int>()
        val map2 = mutableMapOf<Int,Int>()

        val list1= mutableListOf<Int>()
        val list2= mutableListOf<Int>()
        val ans= mutableListOf<List<Int>>()

        for (i in nums1){
            map1[i]= map1.getOrPut(i){0}+1
        }

        for (i in nums2){
            map2[i]= map2.getOrPut(i){0}+1
        }

        for (key in map1.keys){
            if (!map2.containsKey(key)){
                println(key)
                list1.add(key)
            }
        }
        for (key in map2.keys){
            if (!map1.containsKey(key)){
                list2.add(key)
            }
        }

        ans.add(list1)
        ans.add(list2)


        return ans


    }

    fun uniqueOccurrencies(arr: IntArray): Boolean {

        val mapOfOccurencies= mutableMapOf<Int,Int>()

        for (i in arr){
            mapOfOccurencies[i] = mapOfOccurencies.getOrPut(i){0}+1
        }


       val hasDuplicateValues = mapOfOccurencies.values.size == mapOfOccurencies.values.distinct().size

        return hasDuplicateValues

    }

    fun maxVowels(s: String, k: Int): Int {
        var curr =0
        val vowels= setOf('a','e','i','o','u')

        for (i in 0 until k){
            if (s[i] in vowels){
                curr++
            }
        }
        var maxAnswer=curr

        for (i in k until s.length){

            if (s[i] in vowels){
                curr++
            }

            if (s[i-k] in vowels){
                curr--
            }
            maxAnswer= max(maxAnswer,curr)
        }
        return maxAnswer

    }

    fun longestOnes(nums: IntArray, k: Int): Int {
        var left =0
        var zeros=0
        var answer =0

        for (right in nums.indices){
            if (nums[right]==0){
                zeros++
            }
            while (zeros>k){
                if (nums[left]==0){
                    zeros--
                }
                left++
            }
            answer= max(answer,right-left+1)
        }
        return  answer

    }

    fun longestSubarray(nums: IntArray): Int {

        var left =0
        var flipped = 0
        var answer=0

        for (right in 0 until nums.size){
            if (nums[right]==0){
                flipped++

            }

            while (flipped >1){
                if (nums[left]==0){
                    flipped--
                }
                left++
            }
            answer= max(answer,right-left+1)
        }
        return answer-1
    }

    fun equalPairs(grid: Array<IntArray>): Int {

        val rows= mutableMapOf<Int,List<Int>>()
        val cols= mutableMapOf<Int,List<Int>>()
        val numCols= grid[0].size
        var count=0

        for (i in grid.indices){
            rows[i] = grid[i].toList()
        }

        for (i in 0 until numCols){

            val col= mutableListOf<Int>()
            for (row in grid){
                col.add(row[i])
            }
            cols[i]= col
        }

//        for(i in rows.values){
//            println(i.contentToString())
//        }
       for (i in rows.values){
           println(i)
           if (cols.containsValue(i)){
               count++
           }
       }
        return count

    }

    fun removeStars(s: String): String {
//        LIFO
        val stack = ArrayDeque<Char>()
        val sb=StringBuilder()

        for (i in s){
            if (i=='*'){
                stack.removeLastOrNull()
            }else{

                stack.addLast(i)
            }
        }

        for (i in stack){
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

        val magazineMap= mutableMapOf<Char,Int>()



         for (i in magazine) {
             magazineMap[i]= magazineMap.getOrPut(i){0}+1
        }

        for(i in ransomNote){
            if (!magazineMap.containsKey(i) || magazineMap[i] ==0){
                return false
            }
            magazineMap[i]= magazineMap.getOrPut(i){0}-1
        }
        return true


    }

    fun isIsomorphic(s: String, t: String): Boolean {
        val map= mutableMapOf<Char,Char>()
        val set= mutableSetOf<Char>()


      for (i in 0 until s.length){
          if (map.containsKey(s[i]) && map[s[i]] != t[i]){
              return false
          }else{
              if (set.contains(t[i])){
                  return false
              }
              set.add(t[i])
              map[s[i]]=map.getOrPut(s[i]){t[i]}
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

    fun isAnagram(s: String, t: String): Boolean {

        val sMap= mutableMapOf<Char,Int>()
        val tMap= mutableMapOf<Char,Int>()

        for (i in s){
            sMap[i]=sMap.getOrPut(i){0}+1
        }

        for (i in t){
            tMap[i]=tMap.getOrPut(i){0}+1
        }

        for ((i,v) in tMap){
            if (!sMap.containsKey(i)){
                return false
            }else{
                if (sMap.get(i) != v){
                    return false
                }
            }

        }

        for ((i,v) in sMap){
            if (!tMap.containsKey(i)){
                return false
            }else{
                if (tMap.get(i) != v){
                    return false
                }
            }

        }


        return true
    }

    fun containsNearbyDuplicates(nums: IntArray, k: Int): Boolean {
        val numsMap= mutableMapOf<Int,Int>()

        for (i in nums.indices){
            if (numsMap.containsKey(nums[i]) && i-numsMap.get(nums[i])!! <=k ){
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
        var left =0;
        var curr =0
        var answer =Int.MAX_VALUE

        for(i in nums.indices){
            curr += nums[i]

            while (curr >= target){
                answer = min(answer,i -left+1)
                curr -=nums[left]
                left++
            }

        }
        return if (answer == Int.MAX_VALUE) 0 else answer

    }

    fun lengthOfLongestSubstring(s: String): Int {
        var left = 0
        val seenChars= mutableSetOf<Char>()
        var answer = Int.MIN_VALUE

        for(i in s.indices){

            while (seenChars.contains(s[i])){

                seenChars.remove(s[left])
                left++

            }
            seenChars.add(s[i])
            answer= max(answer,i-left+1)
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

        var left =0
        var right= nums.size-1

        while(left <= right){
            var mid = left +(right-left) /2

            if(nums[mid] == target){
                return mid
            }
            if (nums[mid] > target){
                right = mid-1
            }else{
                left = mid+1
            }


        }
        return left
    }

    fun searchMatrix(matrix: Array<IntArray>, target: Int): Boolean {
        val rowSize = matrix.size
        val colSize = matrix[0].size
        var left =0
        var right = rowSize * colSize -1

        while (left <= right){
            var mid = left + (right-left)/2
            var row = mid/rowSize
            var col= mid % colSize
            var num = matrix[row][col]

            if (num==target){
                return true
            }

            if(num < target){
                left = mid +1
            }else{
                right = mid -1
            }
        }

        return false

    }

    fun findPeakElement(nums: IntArray): Int {
        var left =0
        var right = nums.size -1

        while (left < right){
            val mid = right -(right-left)/2

            if (nums[mid] > nums[mid+1]){
                right=mid
            }else{
                left = mid+1
            }
        }
        return left

    }

    fun twoSumOneIndex(numbers: IntArray, target: Int): IntArray {

        val map= mutableMapOf<Int,Int>()

        for (i in 0 until numbers.size){

            val c= target - numbers[i]

            if (map.containsKey(c)){
                return intArrayOf(map[c]!!+1,i+1)
            }
            map[numbers[i]]= map.getOrPut(numbers[i]){i}
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
        val answer=StringBuilder()

        for (i in 0 until  splitCommand.size){
            when {
                splitCommand[i] == ".." -> {
                    if (!stack.isEmpty()){
                        stack.removeLast()
                    }

                }
                splitCommand[i]=="."->{
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

        if (stack.isEmpty()){
            answer.append('/')
        }

        for (i in 0 until stack.size){

                answer.append('/')
                println("here")
                answer.append(stack[i])


        }

        return answer.toString()



    }

    fun evalRPN(tokens: Array<String>): Int {
        val stack = ArrayDeque<String>()
        val operator= setOf("+","-", "*","/" )

        for (i in tokens){
            when{
                i in operator -> {
                    if (stack.isNotEmpty()){
                        val a=stack.removeLast().toInt()
                        val b=stack.removeLast().toInt()
                        when (i) {
                            "+" -> stack.addLast((a + b).toString())
                            "-" -> stack.addLast(( b- a).toString())
                            "*" -> stack.addLast((a * b).toString())
                            "/" -> stack.addLast((b / a).toString())
                        }
                    }

                }
                else -> {stack.addLast(i)}
            }
        }
        return stack.removeLast().toInt()
    }

    fun compress(chars: CharArray): Int {
        //sort the array
        chars.sort()
        val map= mutableMapOf<Char,Int>()
        var counter=1

        for (i in 1 until chars.size){
           map[chars[i]]=map.getOrPut(chars[i]){0}+1
        }

        for (i in 1 until chars.size){
            if (chars[i] != chars[i-1]){
                val x= map.get(chars[i-1])
                if (x != null) {
                    chars[i]=x.toChar()
                }
            }

        }


        return map.size*2


    }

    fun maxOperations(nums: IntArray, k: Int): Int {
        var left =0
        var right= nums.size-1
        var count=0

        nums.sort()

        while (left<right){

            val b = nums[left] + nums[right]
            if (b==k){
                count++;
                left++
                right--
            }
            else if (b> k){
                right--

            }else{
                left++
            }


        }

        return count

    }

    fun maxArea(height: IntArray): Int {

        var left=0
        var right= height.size-1
        var ans=0


        while (left<right){
            val w = right-left
            val h = minOf(height[left],height[right])
            val a= w*h
            ans= maxOf(ans,a)

            // Move the pointer with smaller height
            if (height[left] < height[right]){
                left++

            }else{
                right--
            }
        }

        return ans



    }

    fun largestAltitude(gain: IntArray): Int {

        val prefix = IntArray(gain.size+1)
        prefix[0]=0

        for(i in 1.. gain.size){
            prefix[i]= prefix[i-1] + gain[i-1]
        }



        return prefix.max()

    }

    fun dailyTemperatures(temperatures: IntArray): IntArray {
        val stack = ArrayDeque<Int>()
        val ans= IntArray(temperatures.size)

        for (i in 0 until temperatures.size){

            while (stack.isNotEmpty() && temperatures[stack.last()]< temperatures[i]){
                val lastIndex = stack.removeLast()
                ans[lastIndex]= i-lastIndex


            }
//                println(i)
                stack.addLast(i)

        }
//        for (i in ans){
//            println(i)
//        }

        return  ans

    }

    class NumArray(nums: IntArray){
        private val prefix: IntArray=IntArray(nums.size)

        init {
            prefix[0]= nums[0]
            for (i in 1 until nums.size){
                prefix[i] = prefix[i-1] + nums[i]
            }
        }

        fun sumRange(left: Int, right: Int): Int {
            return if (left==0){
                prefix[right]
            }else{
                prefix[right] - prefix[left-1]
            }


        }
    }


    class RecentCounter(){

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

    class StockSpanner(){
        private val stack=ArrayDeque<Int>()
        private val list= mutableListOf<Int>()


        fun next(price: Int): Int {
            list.add(price)
            var count =1

            for (i in 0 until list.size){
                while (stack.isNotEmpty() && stack.last() <= price){
                    stack.removeLast()
                    count++
                }
                stack.addLast(list.get(i))
            }

            return count

        }

    }




//    private fun reverse(s: String): String {
//        val chars = s.toCharArray()
//        var left = 0
//        var right = chars.size - 1
//
//        while (right > left) {
//
//            val temp = chars[left]
//            chars[left] = chars[right]
//            chars[right] = temp
//
//            left++
//            right--
//        }
//        return chars.joinToString("")
//    }


}