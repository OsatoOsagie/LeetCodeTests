class Arrays {
    fun reverseWords(s:String): String{

        val wordsArr= s.split(" ")
       val sb= StringBuilder()



        for (i in wordsArr.indices){
            var right= wordsArr[i].length -1
            var left=0
            val charArray=wordsArr[i].toCharArray()

            while(left < right){
                val temp= charArray[left]
                 charArray[left]= wordsArr[i][right]
                charArray[right]=temp

                left++
                right--
            }
            sb.append(String(charArray))

            if(i != wordsArr.size-1){
                sb.append(" ")
            }

        }

        return sb.toString()

    }

    fun reverseOnlyLetters(s: String): String {

        var charArray= s.toCharArray()
        var left=0;
        var right =charArray.size-1

        while(left<right){

            while (left < right && !charArray[left].isLetter()){
                left++
            }

            while (left < right && !charArray[right].isLetter()){
                right--
            }

            val temp= charArray[left]
            charArray[left]= charArray[right]
            charArray[right]= temp

            left++
            right--


        }
        return String(charArray)

    }

    fun isAlphabetic(char:Char): Boolean{
        return char in 'a'..'z' || char in 'A'..'Z'
    }

    fun getCommon(nums1: Array<Int>, nums2: Array<Int>): Int {

        val  map= mutableMapOf<Int,Int>()
        var min=Int.MIN_VALUE

        for (num in nums1){
            map[num]=map.getOrPut(num){0}+1
        }

        for (num in nums2){
            if (map.containsKey(num)){
            min=num
            }
        }

    return min

    }

    fun getCommonTowPointer(nums1: Array<Int>, nums2: Array<Int>): Int {

        var first=0
        var second=0

        // Traverse through both arrays with two pointers
        // Increment the pointer with a smaller value at that index
        // Return the first common element found
        while(first < nums1.size && second< nums2.size){
            if (nums1[first] < nums2[second]){
                first++
            }else if(nums1[first] > nums2[second]){
                second++
            }else{
                return nums1[first]
            }
        }
        return -1
    }

    fun moveZeroes(nums: IntArray) {
        var i = 0  // Pointer for iterating through the array
        var j = 0  // Pointer for placing non-zero elements

        // Step 1: Move all non-zero elements to the front of the array
        while (i < nums.size && j < nums.size) {
            if (nums[i] != 0) {
                nums[j] = nums[i]  // Move non-zero element to index j
                j++  // Increment j only when placing a non-zero element
            }
            i++  // Always increment i to iterate through the array
        }

        // Step 4: Fill the remaining positions with zeros
        while (j < nums.size) {
            nums[j] = 0  // Place zeros at the end of the array
            j++
        }
    }

    fun reversePrefix(word: String, ch: Char): String{
        var left=0
        var right =0

        var wordChar = word.toCharArray()

        for ((index,value) in wordChar.withIndex()){
            if (value==ch){
                right=index
                break
            }
        }

        while (left<right){
            val temp= wordChar[left]
            wordChar[left]= wordChar[right]
            wordChar[right] = temp

            left++
            right--
        }
        return wordChar.joinToString("")

    }


}