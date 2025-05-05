import java.util.*
import kotlin.collections.Set
import kotlin.math.min

class LeetCodeSolved {
    fun minimumSubarrayLength(nums: IntArray, k: Int): Int {
        var left =0
        var ans= Int.MAX_VALUE
        var xor=0

        for (i in 0 until nums.size){
            xor = xor xor nums[i]

            while (xor >=k){
                ans= min(ans,i-left+1)
                left++
                xor= recomputeOr(nums,left,i)

            }



        }

        return if (ans == Int.MAX_VALUE) -1 else ans
    }

    fun recomputeOr(nums: IntArray, start: Int, end: Int): Int {
        var orValue = 0
        for (i in start..end) {
            orValue = orValue xor nums[i]
        }
        return orValue
    }



}