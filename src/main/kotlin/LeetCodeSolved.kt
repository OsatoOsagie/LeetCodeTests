import java.util.*
import kotlin.math.abs


class LeetCodeSolved {
    fun partitionArray(nums: IntArray, k: Int): Int {

        nums.sort()
        var ans=1
        var x=nums[0]

        for (i in 1 until nums.size){
            if (nums[i] - x >k){
                x=nums[i]
                ans++
            }
        }

        return ans




    }


}