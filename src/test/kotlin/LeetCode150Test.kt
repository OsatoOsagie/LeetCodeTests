import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class LeetCode150Test{


    @Test
    fun romanToInt(){
//        given
        val s= "III"
//        when
        val ans= LeetCode150().romanTOInt(s)
//        then
        assertEquals(3,ans)
    }

    @Test
    fun merge(){
//        given
        val nums1= arrayOf(1,2,3,0,0,0)
        val nums2 = arrayOf(2,5,6)

//        when
        LeetCode150().merge(nums1, nums2)

//        then
        val expected= arrayOf(1,2,2,3,5,6)
        assertArrayEquals(expected,nums1)
    }

    @Test
    fun removeElement(){
        //given
        val num = arrayOf(3,2,2,3)
        val `val`= 3
//        when
        val ans:Int =LeetCode150().removeElement(num, `val`)

//        then
        assertEquals(2,ans)

    }

    @Test
    fun removeDuplicates(){
//        given
         val nums = intArrayOf(1,1,2)

//        when
        val k:Int = LeetCode150().removeDuplicates(nums)

//        then
        assertEquals(2,k)
    }

    @Test
    fun removeDuplicatesII(){
//        given
        val nums = intArrayOf(1,1,1,2,2,3)

//        when
        val k:Int= LeetCode150().removeDuplicatesII(nums)

//        then
        val expectation= intArrayOf(1,1,2,2,3,0)
        assertEquals(5,k)
        for (i in 0 until k){
            assertEquals(nums[i],expectation[i])
        }
    }

    @Test
    fun majorityElement(){
//        given
        val nums= intArrayOf(3,2,3)

//        when
        val k: Int =LeetCode150().majorityElement(nums)

        assertEquals(3,k)
    }

    @Test
    fun rotate(){
//        given
        val nums = intArrayOf(1,2,3,4,5,6,7)
        val k: Int=0
//        when
        LeetCode150().rotate(nums,k)

//        then
        val expectation = intArrayOf(1,2,3,4,5,6,7)
        assertEquals(expectation,nums)
    }

    @Test
    fun lengthOfLastWord(){
//        given
        val s = "   fly me   to   the moon  "

//        when
        val exp= LeetCode150().lengthOfLastWord(s)

//        then
        assertEquals(4,exp)
    }

    @Test
    fun longestCommonPrefix(){
//        given
//        val s= arrayOf("flower","flow","flight")
        val s= arrayOf("dog","racecar","car")
//        val s= emptyArray<String>()


//        when
        val k= LeetCode150().longestCommonPrefix(s)

//        then
        assertEquals("",k)
    }

    @Test
    fun strStr(){
//        given
        val h= "sadbutsad"
        val n= ""

//        when
       val ans= LeetCode150().strStr(h,n)

//        then
        assertEquals(-1,ans)
    }

    @Test
    fun isPalindrome(){
//        given
        val s= "race a car"

//        when
        val k = LeetCode150().isPalindrome(s)

        assertEquals(false,k)
    }
}