import jdk.jfr.Frequency
import kotlin.math.abs

class LeetCodeSolved {
    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {

        var right=0
        for (i in nums1.indices){
            if (nums1[i]==0 && right < n){
                nums1[i]= nums2[right]
                right++
            }
        }
        nums1.sort()



        return
    }






}