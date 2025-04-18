import java.util.*
import kotlin.math.abs
import kotlin.math.sign

class LeetCodeSolved {
    fun countPairs(nums: IntArray, k: Int): Int {

        var count=0

        for (i in 0 until nums.size-1){
            for (j in i+1 until nums.size){
                if (nums[i]==nums[j] && ((i*j) %k ==0)){
                    count++

                }
            }
        }

        return count
    }

//    nums[0] == nums[6], and 0 * 6 == 0, which is divisible by 2.
//    - nums[2] == nums[3], and 2 * 3 == 6, which is divisible by 2.
//    - nums[2] == nums[4], and 2 * 4 == 8, which is divisible by 2.
//    - nums[3] == nums[4], and 3 * 4 == 12, which is divisible by 2.


}