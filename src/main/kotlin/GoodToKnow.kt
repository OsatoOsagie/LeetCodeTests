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


//    private fun helper(c: Char, shift:Int): Char {
//
//
//        val offset = (c - 'a' + shift).mod(26)
//        return ('a' + offset)
//    }
//    char to int
//    ( s[left] -'0') + (s[right] -'0') %10

    //difference arrays

    fun carPooling(trips: Array<IntArray>, capacity: Int): Boolean {

//        get the furthest trip
        val furthest= trips.maxOf { it[2] }

        //compute the number line of passengers
        val passengersArr= IntArray(furthest+1)

        for(trip in trips){
            val passengers= trip[0]
            val from= trip[1]
            val to= trip[2]

            passengersArr[from] += passengers
            passengersArr[to] -= passengers

        }

        var currNumOfPassengers=0
        for (num in passengersArr){
            currNumOfPassengers +=num

            if (currNumOfPassengers >capacity){
                return false
            }
        }

        return true


    }

    fun shiftingLetters(s: String, shifts: Array<IntArray>): String {
        //get the furthest shifting of chars
        val furthest= shifts.maxOf { it[1] }

        //line number of characters
        val line = IntArray(furthest+1)

        for (shift in shifts){
            val from= shift[0]
            val to= shift[1]
            val direction= shift[2]


            for (i in from..to){
                if (direction==0){
                    line[i] -=1
                }else{
                    line[i]+=1
                }

            }


        }

        val  sb =s.toCharArray()

        for (i in 0 until line.size){
            sb[i]=(helper(s[i],line[i]))
        }
        return sb.joinToString("")

    }

    private fun helper(c: Char, shift:Int): Char {


        val offset = (c - 'a' + shift).mod(26) //Subtracting 'a' from c calculates the position of the character c in the alphabet, starting from
        return ('a' + offset) // moves forward in the alphabet by offset steps and gives you the character at that new position.
    }

    fun finalString(s: String): String = buildString {
        for (c in s) if (c != 'i') append(c) else reverse()
    }

// String word = "5382";
//    char ch = word.charAt(0); // '5'
//    int num = ch - '0';       // '5' - '0' = 5
//    System.out.println(num);  // prints 5

//    String(sChar) - converts a char array to a string
}