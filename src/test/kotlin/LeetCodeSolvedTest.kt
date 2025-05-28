import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class LeetCodeSolvedTest {

    @Test
    fun merge(){
//        given
        val nums1= intArrayOf(-1,0,0,3,3,3,0,0,0)
        val nums2= intArrayOf(1,2,2)
        val n = 3
        val m=6

//        when
        val result = LeetCodeSolved().merge(nums1,m,nums2,n)

//        then
        val expectation= intArrayOf(1,2,2,3,5,6)

        assertArrayEquals(expectation,nums1)
    }






}

