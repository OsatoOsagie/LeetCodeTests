import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import kotlin.test.expect

class LeetCode75Test{

    @Test
    fun mergeAlternatively(){
//        given
        val word1= "ab"
        val word2= "pqrs"
//        when
        val k: String= LeetCode75().mergeAlternatively(word1, word2)

//        then
        assertEquals("apbqrs", k)
    }

    @Test
    fun kidsWithCandies(){
//        given
        val candies= intArrayOf(2,3,5,1,3)
        val extraCandies= 3

//        when
        val k: List<Boolean> = LeetCode75().kidsWithCandies(candies,extraCandies)

//        then
        assertEquals(listOf(true,true,true,false,true),k)
    }

    @Test
    fun canPlaceFlowers(){
//        given
        val flowerBed= intArrayOf(1,0,0,0,1)
        val n = 2

//        when
        val k: Boolean= LeetCode75().canPlaceFlowers(flowerBed,n)

//        then
        assertEquals(false,k)
    }

    @Test
    fun reverseVowels(){
//        given
        val s= "leetcode"

//        when
        val k: String =LeetCode75().reverseVowels(s)

//        then
        assertEquals( "leotcede",k)
    }

    @Test
    fun reverseWords(){
//        given
        val s ="a good   example"

//        when
        val result: String = LeetCode75().reverseWords(s)
//        then
        val exp= "example good a"

        assertEquals(exp,result)
    }

    @Test
    fun increasingTriplets(){
//        given
        val nums = intArrayOf(2,1,5,0,4,6)

//        when
        val result: Boolean = LeetCode75().increasingTriplets(nums)
//        then
        val expectation= true
        assertEquals(expectation,result)
    }

    @Test
    fun moveZeros(){
//        given
        val nums = intArrayOf(0,1,0,3,12)

//        when
        LeetCode75().moveZeros(nums)
//        then
        val expectation= intArrayOf(1,3,12,0,0)
        assertArrayEquals(expectation,nums)
    }

    @Test
    fun isSubSequence(){
//        given
        val s= "axc"
        val t= "ahbgdc"

//        when
        val result: Boolean = LeetCode75().isSubSequence(s,t)

//        then
        val expectation=true
        assertEquals(expectation,result)
    }

    @Test
    fun finxMaxAverage(){
//        given
        val nums= intArrayOf(1,12,-5,-6,50,3)
        val k = 4

//        when
        val result: Double = LeetCode75().findMaxAverage(nums, k)
        val expectation = 12.75000

//        then
        assertEquals(expectation,result)
    }

    @Test
    fun findDifference(){
//        given
        val nums1= intArrayOf(1,2,3,3)
        val nums2 = intArrayOf(1,1,2,2)

//        when
        val result:List<List<Int>> = LeetCode75().findDifference(nums1,nums2)
        val expectation:List<List<Int>> = listOf(listOf(1,3), listOf(4,6))


//        then
        assertEquals(expectation,result)
    }


    @Test
    fun uniqueOccurrencies(){
//        given
        val arr = intArrayOf(1,2,2,1,1,3)

//        when
        val result:Boolean = LeetCode75().uniqueOccurrencies(arr)

//        then
        val expectation= true
        assertEquals(expectation,result)
    }

    @Test
    fun maxVowels(){
//        given
        val s= "abciiidef"
        val k= 3

//        when
        val result: Int = LeetCode75().maxVowels(s,k)

//        then
        val expectation= 3
        assertEquals(expectation,result)
    }

    @Test
    fun longestOnes(){
//        given
        val nums = intArrayOf(0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1)
        val k=3
//        when
        val result:Int = LeetCode75().longestOnes(nums, k)

//        then
        val expectation= 10
        assertEquals(expectation,result)
    }

    @Test
    fun longestSubarray(){
//        given
        val nums = intArrayOf(1,1,1)

//        when
        val result:Int = LeetCode75().longestSubarray(nums)

//        then
        val expected = 2
        assertEquals(expected,result)
    }

    @Test
    fun equalPairs(){
//        given
        val grid = arrayOf(intArrayOf(3,2,1), intArrayOf(1,7,6), intArrayOf(2,7,7))
//        when
        val result:Int = LeetCode75().equalPairs(grid)

//        then
        val expectation= 1
        assertEquals(expectation,result)
    }

    @Test
    fun removeStars(){
//        given
        val s= "erase*****"

//        when
        val result:String= LeetCode75().removeStars(s)

//        then
        val expectation=""
        assertEquals(expectation,result)
    }


    @Test
    fun asteroidCollision(){
//        given
        val asteroids = intArrayOf(10,2,-5)

//        when
        val result:IntArray = LeetCode75().asteroidCollision(asteroids)

//        then
        val expectation = intArrayOf(10)
        assertArrayEquals(expectation,result)
    }

    @Test
    fun canConstruct(){
//        given
        val ransomeNote = "aa"
        val magazine = "aab"

//        when
        val result:Boolean= LeetCode75().canConstruct(ransomeNote,magazine)

//        then
        val expectation = true
        assertEquals(expectation,result)
    }

    @Test
    fun isIsomorphic(){
//        given
        val s= "badc"
        val t="baba"

//        when
        val result:Boolean= LeetCode75().isIsomorphic(s,t)

//        then
        val expectation = false
        assertEquals(expectation,result)
    }

    @Test
    fun twoSums(){
//        given
        val nums = intArrayOf(2,7,11,15)
        val target=9

//        when
        val result:IntArray = LeetCode75().twoSum(nums, target)

//        then
        val expectation = intArrayOf(0,1)
        assertArrayEquals(expectation,result)
    }

    @Test
    fun isAnagram(){
//        given
        val s= "ab"
        val t = "a"

//        when
        val result:Boolean= LeetCode75().isAnagram(s,t)

//        then
        val expectation= false
        assertEquals(expectation,result)
    }

    @Test
    fun containsNearbyDuplicates(){
//        given
        val nums= intArrayOf(1,0,1,1)
        val k = 1
//        when
        val result:Boolean = LeetCode75().containsNearbyDuplicates(nums, k)

//        then
        val expectation = true
        assertEquals(expectation,result)
    }

    @Test
    fun wordPattern(){
//        given
        val pattern =  "aaaa"
        val s= "dog cat cat dog"

//        when
        val result:Boolean= LeetCode75().wordPattern(pattern, s)
//        then
        val expectation= false
        assertEquals(expectation,result)
    }

    @Test
    fun minSubArrayLen(){
//        given
        val nums = intArrayOf(2,3,1,2,4,3)
        val target= 7

//        when
        val result:Int= LeetCode75().minSubArray(nums, target)
//        then
        val expectation= 2
        assertEquals(expectation,result)
    }

    @Test
    fun lengthOfLongestSubstring(){
//        given
        val s= "pwwkew"

//        when
        val result:Int = LeetCode75().lengthOfLongestSubstring(s)

//        then
        val expectation=3
        assertEquals(expectation,result)
    }

    @Test
    fun successfulPairs(){
//        given
        val spells= intArrayOf(5,1,3)
        val potions = intArrayOf(1,2,3,4,5)
        val success= 7

//        when
        val result:IntArray= LeetCode75().successfulPairs(spells,potions,success)

//        then
        val expectation= intArrayOf(4,0,3)
        assertArrayEquals(expectation,result)
    }

    @Test
    fun searchInsert(){
//        given
        val nums = intArrayOf(1,3,5,6)
        val target = 5

//        when
        val result:Int = LeetCode75().searchInsert(nums, target)

//        then
        val expectation=2
        assertEquals(expectation,result)

    }

    @Test
    fun searchMatrix(){//        given

        val matrix = arrayOf(intArrayOf(1,3,5,7), intArrayOf(10,11,16,20), intArrayOf(23,30,34,60))
        val target = 3

//        when
        val result:Boolean = LeetCode75().searchMatrix(matrix,target)

//        then
        val expectation = true

        assertEquals(expectation,result)
    }

    @Test
    fun findPeakElement(){
//        given
        val nums = intArrayOf(1,2,3,1)

//        when
        val result:Int = LeetCode75().findPeakElement(nums)

//        then
        val expectation = 2
        assertEquals(expectation,result)
    }

    @Test
    fun twoSum(){
//        given
        val numbers= intArrayOf(2,7,11,15)
        val target= 9

//        when
        val result:IntArray = LeetCode75().twoSumOneIndex(numbers,target)

//        then
        val expectation= intArrayOf(1,2)
        assertArrayEquals(expectation,result)
    }

    @Test
    fun isValid(){
//        given
        val s= "()"

//        when
        val result:Boolean = LeetCode75().isValid(s)

//        then
        val expectation = true
        assertEquals(expectation,result)
    }

    @Test
    fun simplypath (){
//        given
        val path = "/.../a/../b/c/../d/./"
//        when
        val result:String = LeetCode75().simplifyPath(path)

//        then
        val expectation ="/.../b/d"
        assertEquals(expectation,result)
    }

    @Test
    fun evalRPN(){
//        given
        val tokens= arrayOf("10","6","9","3","+","-11","*","/","*","17","+","5","+")

//        when
        val result:Int= LeetCode75().evalRPN(tokens)

//        then
        val expectation = 22
        assertEquals(expectation,result)
    }

    @Test
    fun compress(){
//        given
        val chars = charArrayOf('a','a','b', 'b','c','c','c')

//        when
        val result:Int= LeetCode75().compress(chars)

//        then
        val expectation= 6
        assertEquals(expectation,result)
    }

    @Test
    fun maxOperations(){
//        given
        val nums = intArrayOf(3,1,3,4,3)
        val k = 6

//        when
        val result:Int = LeetCode75().maxOperations(nums, k)

//        then
        val expectation =1
        assertEquals(expectation,result)
    }

    @Test
    fun maxArea(){
//        given
        val height= intArrayOf(1,8,6,2,5,4,8,3,7)

//        when
        val result:Int = LeetCode75().maxArea(height)

//        then
        val expectation =49
        assertEquals(expectation,result)
    }

    @Test
    fun largestAltitude(){
//        given
        val gain = intArrayOf(-4,-3,-2,-1,4,3,2)

//        when
        val result:Int= LeetCode75().largestAltitude(gain)

//        then
        val expectation= 0
        assertEquals(expectation,result)
    }

    @Test
    fun sumRange(){
//        given
        val left= 0
        val right= 2
        val nums= intArrayOf(-2, 0, 3, -5, 2, -1)

//        when
        val result:Int = LeetCode75.NumArray(nums).sumRange(left,right)

//        then
        val expectation = 1
        assertEquals(expectation,result)
    }

    @Test
    fun dailyTemperatures(){
//        given
        val temperatures= intArrayOf(73,74,75,71,69,72,76,73)

//        when
        val result:IntArray= LeetCode75().dailyTemperatures(temperatures)

//        then
        val expectation= intArrayOf(1,1,4,2,1,1,0,0)

        assertArrayEquals(expectation,result)

    }

    @Test
    fun next(){
//        given
        val price= 100

//        when
        val stockSpanner=LeetCode75.StockSpanner()
        stockSpanner.next(100)
        stockSpanner.next(80)
        stockSpanner.next(60)
        stockSpanner.next(70)
        stockSpanner.next(60)
        val result:Int = stockSpanner.next(75)

//        then
        val expectation= 4
        assertEquals(expectation, result)
    }

    @Test
    fun finalPrices(){
//        given
        val prices= intArrayOf(10,1,1,6)

//        when
        val result:IntArray = LeetCode75().finalPrices(prices)

//        then
        val expectation = intArrayOf(9,0,1,6)

        assertArrayEquals(expectation,result)
    }

    @Test
    fun nextGreatestElement(){
//        given
        val nums1= intArrayOf(4,1,2)
        val nums2= intArrayOf(1,3,4,2)

//        when
        val result:IntArray = LeetCode75().nextGreaterElement(nums1, nums2)

//        then
        val expectation = intArrayOf(-1,3,-1)
        assertArrayEquals(expectation,result)
    }

    @Test
    fun deleteMiddleNode(){
//    given
        var node1= LeetCode75.ListNode(1)
        var node2= LeetCode75.ListNode(3)
        var node3 = LeetCode75.ListNode(4)
        var node4 = LeetCode75.ListNode(7)
        var node5 = LeetCode75.ListNode(1)
        var node6 = LeetCode75.ListNode(2)
        var node7 = LeetCode75.ListNode(6)

        node1.next=node2
        node2.next=node3
        node3.next=node4
        node4.next=node5
        node5.next=node6
        node6.next=node7

//    when
        val result: LeetCode75.ListNode? = LeetCode75().deleteMiddleNode(node1)

//        then
         node1= LeetCode75.ListNode(1)
         node2= LeetCode75.ListNode(3)
         node3 = LeetCode75.ListNode(4)
         node4 = LeetCode75.ListNode(7)
         node5 = LeetCode75.ListNode(1)
         node6 = LeetCode75.ListNode(2)
         node7 = LeetCode75.ListNode(6)

        node1.next=node2
        node2.next=node3
        node3.next=node5
        node5.next=node6
        node6.next=node7

        val expectation= node1
        assertEquals(expectation.`val`, result?.`val`)
    }

    @Test
    fun deleteDuplicates(){
//        given
        var node1= LeetCode75.ListNode(1)
        var node2= LeetCode75.ListNode(1)
        var node3= LeetCode75.ListNode(2)

        node1.next=node2
        node2.next= node3

//        when
        val result:LeetCode75.ListNode?= LeetCode75().deleteDuplicates(node1)

//        then
         node1= LeetCode75.ListNode(1)
         node3= LeetCode75.ListNode(2)

        node1.next=node3

        val expectation = node1
        assertEquals(expectation.`val`,result?.`val`)
    }

    @Test
    fun reverseList(){
//        given
        var node1= LeetCode75.ListNode(1)
        var node2= LeetCode75.ListNode(1)
        var node3= LeetCode75.ListNode(2)
        var node4= LeetCode75.ListNode(2)
        var node5= LeetCode75.ListNode(2)

        node1.next = node2
        node2.next=node3
        node3.next=node4
        node4.next=node5



//        when
        val result:LeetCode75.ListNode?= LeetCode75().reverseList(node1)

//        then
        node5.next = node4
        node4.next=node3
        node2.next = node1

        val expectation = node5
        assertEquals(expectation.`val`, result?.`val`)
    }

    @Test
    fun pairSum(){
//        given
        var node1= LeetCode75.ListNode(5)
        var node2= LeetCode75.ListNode(4)
        var node3= LeetCode75.ListNode(2)
        var node4= LeetCode75.ListNode(1)

        node1.next = node2
        node2.next=node3
        node3.next=node4
//        when
        val result:Int= LeetCode75().pairSum(node1)

//        then
        val expectation= 6
        assertEquals(expectation,result)

    }

    @Test
    fun oddEvenList() {
        // Given
        val node1 = LeetCode75.ListNode(1)
        val node2 = LeetCode75.ListNode(2)
        val node3 = LeetCode75.ListNode(3)
        val node4 = LeetCode75.ListNode(4)
        val node5 = LeetCode75.ListNode(5)

        node1.next = node2
        node2.next = node3
        node3.next = node4
        node4.next = node5

        // When
        val result: LeetCode75.ListNode? = LeetCode75().oddEvenList(node1)

        // Then - Construct the expected result
        val expectedNode1 = LeetCode75.ListNode(1)
        val expectedNode2 = LeetCode75.ListNode(3)
        val expectedNode3 = LeetCode75.ListNode(5)
        val expectedNode4 = LeetCode75.ListNode(2)
        val expectedNode5 = LeetCode75.ListNode(4)

        expectedNode1.next = expectedNode2
        expectedNode2.next = expectedNode3
        expectedNode3.next = expectedNode4
        expectedNode4.next = expectedNode5

        val expectation = expectedNode1

        // Helper function to assert equality of linked lists
        fun assertListEquals(expected: LeetCode75.ListNode?, actual: LeetCode75.ListNode?) {
            var exp = expected
            var act = actual

            while (exp != null && act != null) {
                assertEquals(exp.`val`, act.`val`)
                exp = exp.next
                act = act.next
            }

            // Ensure both lists have the same length
            assertNull(exp)
            assertNull(act)
        }

        assertListEquals(expectation, result)
    }

    @Test
    fun hasCycle(){
//        given
        val node1 = LeetCode75.ListNode(3)
        val node2 = LeetCode75.ListNode(2)
        val node3 = LeetCode75.ListNode(0)
        val node4 = LeetCode75.ListNode(-4)

        node1.next = node2
        node2.next = node3
        node3.next = node4

//        when
        val result:Boolean = LeetCode75().hasCycle(node1)

//        then



        val expectation = true
            assertEquals(expectation,result)
    }








}