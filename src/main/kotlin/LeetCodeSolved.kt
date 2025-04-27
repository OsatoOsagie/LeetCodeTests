import java.util.*
import kotlin.math.pow
import kotlin.math.sqrt

class LeetCodeSolved {
    fun countInterestingSubarrays(nums: IntArray, modulo: Int, k: Int): Long {

        var left=0
        var cnt=0
        var ans=0

        for (i in 0 until nums.size){

            if (nums[i] % modulo==k){
                cnt++
            }

            if (cnt%modulo==k){
                ans++
            }

            while (cnt%modulo !=k){
                cnt-=1

            }
        }

        return ans.toLong()

    }


}