class LeetCode150 {
    fun romanTOInt(s: String): Int {
        var count =0

        s.forEachIndexed { index, c ->
            var nextChar ='_'
            if(index < s.length -1){
                nextChar = s[index+1]
            }
            when(c){
                'I' -> if (nextChar=='V'||nextChar=='X') count -=1 else count +=1
                'V' -> {count+=5}
                'X' -> if (nextChar=='L'||nextChar=='C') count -=10 else count +=10
                'L' -> count+=50
                'C' -> if (nextChar=='D'||nextChar=='M') count -=100 else count +=100
                'D' -> count+=500
                'M' -> count+=1000
            }

        }
        return count

    }

    fun merge(nums1: Array<Int>, nums2: Array<Int>): Unit {
        var i=0
        var j=0

        while(i < nums1.size && j < nums2.size){
            if (nums1[i] < nums2[j]){

            }else{

            }
        }




    }

    fun removeElement(num: Array<Int>, `val`: Int): Int {
        var count =0

        for(j in num.indices){
            if(num[j] == `val`){
                num[j]=101
            }
        }
        num.sort()

        for (n in num ){
            if (n==101){
                break
            }
            count++
        }
        return count

    }

    fun removeDuplicates(nums: IntArray): Int {
        if (nums.isEmpty()) return 0 // Handle empty input case

        var index = 1 // Start from the second position for tracking unique values

        for (i in 1 until nums.size) {
            // If the current element is different from the previous, it's unique
            if (nums[i] != nums[i - 1]) {
                nums[index] = nums[i] // Move the unique element to the "prefix" section
                index++ // Increment the index for the next unique element
            }
        }

        return index // Length of the unique prefix
    }

    fun removeDuplicatesII(nums: IntArray): Int {
        if (nums.isEmpty()) return 0

        var index = 1
        var count = 1 // Tracks occurrences of the current element

        for (i in 1 until nums.size) {
            if (nums[i] == nums[i - 1]) {
                count++ // Increment count for duplicates
            } else {
                count = 1 // Reset count for a new element
            }

            // If the count is within the allowed limit, copy the element to the index position
            if (count <= 2) {
                nums[index] = nums[i]
                index++
            }
        }

        return index
    }

    fun majorityElement(nums: IntArray): Int {

        var sum = Pair(Integer.MAX_VALUE,Integer.MIN_VALUE)
        val map = mutableMapOf<Int,Int>()

        for (num in nums){
            map[num]= map.getOrPut(num){0}+1
        }

        for ((key, value) in map){
            if(value > sum.second){
                sum=Pair(key,value)
            }
        }
        return sum.first

    }

    fun rotate(nums: IntArray, k: Int) {



    }

    fun lengthOfLastWord(s: String): Int {
        if (s.isEmpty()){
            return 0
        }



        val k= s.trim().split(" ")



        return k.last().length

    }

    fun longestCommonPrefix(strs: Array<String>): String {
        if(strs.isEmpty()){
            return ""
        }

        var prefix = strs[0]

        for(i in 1 until strs.size){
            while (!strs[i].startsWith(prefix)){

                if (prefix.isNotEmpty()){
                    prefix = prefix.substring(0,prefix.length-1)
                }

//                if (prefix.isEmpty()) return ""
            }
        }

        return prefix
    }

    fun strStr(haystack: String, needle: String): Int {
        //base case
        if (needle.isEmpty()) return 0

        val needleLength = needle.length
        val haystackLength = haystack.length

        // If needle is longer than haystack, it cannot be a substring
        if (needleLength > haystackLength) return -1

        // Sliding window over haystack
        for (i in 0..(haystackLength - needleLength)) {
            if (haystack.substring(i, i + needleLength) == needle) {
                return i // Return the starting index of the window
            }
        }

        return -1 // If no match is found

    }

    fun isPalindrome(s: String): Boolean {
        val k = s.lowercase().toCharArray()
        var left = 0
        var right = k.size - 1

        // Base case
        if (s.isEmpty()) {
            return true
        }

        while (left < right) {
            // Skip non-alphanumeric characters on the left
            while (left < right && !k[left].isLetterOrDigit()) {
                left++
            }

            // Skip non-alphanumeric characters on the right
            while (left < right && !k[right].isLetterOrDigit()) {
                right--
            }

            // Compare the characters
            if (k[left] != k[right]) {
                return false
            }

            // Move the pointers
            left++
            right--
        }

        return true
    }



}