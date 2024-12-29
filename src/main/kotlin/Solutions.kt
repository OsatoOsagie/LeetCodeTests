import kotlin.math.max
import kotlin.math.min

class Solutions {
    fun runningSum(num: IntArray): IntArray{
        val prefixSum = IntArray(num.size)
        prefixSum[0]= num[0]
        for(i in 1 until num.size){
            println(num[i] + prefixSum[prefixSum.size-1])
            prefixSum[i]= num[i] + prefixSum[i-1]
        }
        return prefixSum
    }

    fun twoPointer(nums: IntArray, target: Int): IntArray {
        var left =0
        var right = nums.last()
        val answer = IntArray(2)

        println(right)
        while (left < right){
            val sum = nums[left] + nums[right]
            if (sum > target){
                right--
            }else if (sum< target){
                left++
            }else{

                answer[0]=left
                answer[1]= right
                break
            }

        }
        return answer
    }

    fun PlusOne(digits: IntArray): IntArray {
// convert arrray to digits

        var tempDigits = digits.joinToString(separator = "").toInt()
        tempDigits +=1


        return tempDigits.toString().map { it.toString().toInt() }.toIntArray()

    }

    fun moveZeroes(nums: IntArray): IntArray {
        var left=0
        var right = 1

        while(right < nums.size){

            when{
                nums[left] == 0 && nums[right] !=0 ->{
                    val temp= nums[left]
                    nums[left]= nums[right]
                    nums[right]=temp
                    left++
                    right++
                }
                nums[left] != 0 -> {
                    left++;
                }
                else ->{
                    right++;
                }
            }

        }
        return nums

    }

    fun containsDuplicates(nums: IntArray): Boolean {

        nums.sort()
        for(i in 0 until nums.size -1){
            if (nums[i] == nums[i+1]){
                return true
            }
        }
        return false
    }

    fun singleNumber(nums: IntArray): Int {

        nums.sort()
        println(nums.contentToString())

        for(i in 0 until nums.size -1){
            if (nums[i] != nums[i+1]){
                return nums[i+1]
            }
        }
        return -1
    }

    fun checkIfPanagram(sentence: String): Boolean {

        val alphabet= ('a'..'z').toList()

        val map= hashMapOf<Char,Int>()

        sentence.map { map.getOrPut(it){0}+1 }

        for (letter in alphabet){
            if (!map.containsKey(letter)){
                return false
            }
        }
    return true
    }

    fun missingNumber(nums: List<Int>): Int {

       val range = (0..nums.size)
        var ans=0
        println(nums.size)

        for (num in range){
            if (!nums.contains(num)){
                ans=num
            }
        }

     return ans

    }

    fun countElements(arr: IntArray): Int {
        var count = 0
        for( x in arr){
            if( x + 1 in arr)
            count += 1
        }

        return count
    }

    fun reversTring(s: Array<Char>): Array<Char> {
        var left=0;
        var right= s.size-1

        while(left < right){
            val temp= s[left]
            s[left]=s[right]
            s[right]=temp

            left++
            right--
        }

        return s


    }

    fun isAnagram(s: String, t: String): Boolean {
      val y=s.toCharArray()
        y.sort()
       val z= t.toCharArray()
        z.sort()

        return y.contentEquals(z)

    }

    fun isPalindrome(s: String): Boolean {

       val y= s.lowercase().toCharArray()
        val x= mutableListOf<Char>()

        for (c in y ){
            if (c in 'a'..'z' || c in '0'..'9'){
                x.add(c)
            }
        }
        val comp=x.toMutableList()
        x.reverse()


        return  x.toCharArray().contentEquals(comp.toCharArray())

    }

    fun findWinners(s: Array<IntArray>): List<List<Int>> {

        val map= mutableMapOf<Int,Pair<Int,Int>>()
        val ans= mutableListOf<List<Int>>()
        var winners= mutableListOf<Int>()
        var oneLoss= mutableListOf<Int>()

        for (m in s){
            val currentWins = map.getOrPut(m[0]){Pair(0,0)}

            val newWins= Pair(currentWins.first+1,currentWins.second)

            val currentLosses=map.getOrPut(m[1]){Pair(0,0)}
            val newLosses= Pair(currentWins.first,currentLosses.second+1)


            println("got here")
            map[m[0]]= newWins
            println(m[0])
            println(newLosses)
            map[m[1]]=newLosses
        }

        for ((key, value ) in map){
            if (value.second==0){
                winners.add(key)
            }

            if (value.second==1){
                oneLoss.add(key)
            }
        }


        oneLoss.sorted()
        ans.add(winners.sorted())
        ans.add(oneLoss.sorted())


        return ans


    }

    fun largestUniqueNumber(nums: IntArray): Int {

      val map= mutableMapOf<Int,Int>()

        for (num in nums){
            map[num]=map.getOrPut(num){0}+1
        }

        val nonDupes=map.filter { it.value==1 }.keys

        return nonDupes.maxOrNull() ?: -1
    }

    fun findMaxLength(nums: IntArray): Int {
        var left=0
        var curr=0
        var ans=0
        val map= mutableMapOf<Int, Int>()


        for (right in nums.indices){
            map[nums[right]]= map.getOrPut(nums[right]){0}+1

            while (map[0] != map[1]){
                map[nums[left]]?.let { map[nums[left]] = it.minus(1) }
                left++

            }
            ans= max(ans, right-left+1)
        }
        return ans

    }

    fun maxNumnberOfBallons(text: String): Int {

        val map = mutableMapOf<Char,Int>()
        val balloon= setOf('b', 'l','l','o','o','n','a')

        for (c in text){
            map[c]= map.getOrPut(c){0}+1

        }

        for (c in balloon){
            if (!map.containsKey(c)){
                return 0
            }

        }

        val minNumBalloons= mutableListOf<Int>()

        for ((key,value ) in map){
            if ((key== 'l' || key== 'o') && value !=0){
                val element = value / 2
                println("even: $key $element")
                minNumBalloons.add(element)
            }
            if(key=='b'|| key=='n' || key=='a' ){
                println("odd: $key $value")
                minNumBalloons.add(value)
            }
        }
        println(minNumBalloons)
        return minNumBalloons.min()

    }

    fun canConstruct(rn: String, magazine: String): Boolean {
        val map= mutableMapOf<Char,Int>()

        for(c in magazine){
            map[c]= map.getOrPut(c){0}+1

        }

        for (c in  rn){
            if (!map.containsKey(c)){
                return false
            }

            map[c]= (map[c] ?:0)-1

            if(map[c]== 0){
                map.remove(c)
            }

        }



        return true

    }

    fun numJewelsInStones(jewels: String, stones: String): Int {

        val map= mutableMapOf<Char,Int>()
        var count=0

        for (j in jewels){
            map[j]= map.getOrPut(j){0}+1
        }

        for (s in stones){
            if (map.containsKey(s)){
                count++
            }
        }
        return count

    }


    companion object {
        fun firstUniqChar(s: String): Int {

            val map = mutableMapOf<Char, Pair<Int, Int>>()
            var ans = Int.MAX_VALUE

            s.forEachIndexed { index, c ->
                val currentPair = map.getOrPut(c) { Pair(0, 0) }

                val newPair = Pair(index, currentPair.second + 1)
                map[c] = newPair
            }

            for ((key, value) in map) {
                if (value.second == 1) {
                    ans = min(value.first, ans)
                }
            }
            if (ans == Int.MAX_VALUE) {
                ans = -1
            }
            return ans
        }

        fun lengthOfLongest(s: String): Int {
            val map = mutableMapOf<Char, Int>()  // Stores the last seen index of characters
            var left = 0  // Left pointer of the sliding window
            var ans = 0   // To store the length of the longest substring

            for ((index, value) in s.withIndex()) {
                // If the character has been seen before and is within the current window
                if (map.containsKey(value) && map[value]!! >= left) {
                    // Move the left pointer just past the last occurrence of the repeated character
                    left = map[value]!! + 1
                }

                // Update the character's last seen index in the map
                map[value] = index

                // Update the length of the longest substring found so far
                ans = maxOf(ans, index - left + 1)
            }

            return ans
        }

        fun minimumCardPickUp(cards: IntArray): Int {

            var ans = Integer.MAX_VALUE
            val map = mutableMapOf<Int, Int>()

            for ((index, value) in cards.withIndex()) {
                if (map.containsKey(value)) {
                    ans = min(ans, index - map[value]!! + 1)
                }
                map[value] = index

            }

            if (ans == Integer.MAX_VALUE) {
                return -1
            }

            return ans


        }

        fun minimumCardPickUpSlidingWindow(cards: IntArray): Int {
            val map = mutableMapOf<Int, Int>()
            var ans = Int.MAX_VALUE
            var left = 0

            // Iterate through the array with index and value
            for ((index, value) in cards.withIndex()) {
                // If the value has been seen before and its last seen position is within the current window
                if (map.containsKey(value) && map[value]!! >= left) {
                    // Calculate the subarray length from the previous occurrence of the duplicate
                    ans = min(ans, index - map[value]!! + 1)
                    // Move the left pointer to one after the last occurrence of the duplicate
                    left = map[value]!! + 1
                }
                // Update the last seen index of the current value
                map[value] = index
            }

            // If no subarray with a duplicate was found, return -1; otherwise return the shortest length
            return if (ans == Int.MAX_VALUE) -1 else ans
        }

        fun maximumSum(nums: IntArray): Int {
            val map = mutableMapOf<Int, MutableList<Int>>()
            var max = Integer.MIN_VALUE

            for ((index, value) in nums.withIndex()) {
                var key = getDigitSum(value)
                map.computeIfAbsent(key) { mutableListOf() }.add(value)
            }

            for ((key, value) in map) {
                if (value.size >= 2) {
                    val sorted = value.sortedDescending()
                    max = max(max, sorted[0] + sorted[1])

                }
            }
            return if (max == Int.MIN_VALUE) -1 else max


        }

        fun getDigitSum(num: Int): Int {
            var sum = 0
            var nums = num

            while (nums != 0) {
                sum += nums % 10
                nums /= 10
            }

            return sum

        }

        fun equalPairs(grid: Array<IntArray>): Int {
            // Function to convert an array to a key (similar to using a tuple in Python)
            fun convertToKey(arr: IntArray): List<Int> {
                return arr.toList()
            }

            // Using Kotlin's mutableMapOf with default values
            val rowCount = mutableMapOf<List<Int>, Int>()
            for (row in grid) {
                val key = convertToKey(row)
                rowCount[key] = rowCount.getOrDefault(key, 0) + 1
            }

            val colCount = mutableMapOf<List<Int>, Int>()
            for (col in 0 until grid[0].size) {
                val currentCol = mutableListOf<Int>()
                for (row in grid.indices) {
                    currentCol.add(grid[row][col])
                }
                val key = currentCol
                colCount[key] = colCount.getOrDefault(key, 0) + 1
            }

            // Calculate the number of equal pairs
            var ans = 0
            for (arr in rowCount.keys) {
                ans += rowCount[arr]!! * colCount.getOrDefault(arr, 0)
            }

            return ans
        }

        fun findMaxLength(nums: IntArray): Int {
            val map = mutableMapOf<Int, Int>()
            var count = 0
            var maxLength = 0

            // Initialize the map to handle the case where the subarray starts from the beginning
            map[0] = -1

            for (i in nums.indices) {
                // Increment count for 1 and decrement for 0
                count += if (nums[i] == 1) 1 else -1

                // If the same count has been seen before, update maxLength
                if (map.containsKey(count)) {
                    maxLength = Math.max(maxLength, i - map[count]!!)
                } else {
                    // Store the first occurrence of this count
                    map[count] = i
                }
            }

            return maxLength
        }

    }


}



