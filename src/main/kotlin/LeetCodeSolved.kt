import java.util.*
import kotlin.collections.Set
import kotlin.math.min

class LeetCodeSolved {

    fun buildArray(nums: IntArray): IntArray {
        val ans= IntArray(nums.size)

        for (i in 0 until nums.size){
            ans[i]= nums[nums[i]]
        }

        return ans

    }


}