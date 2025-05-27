import jdk.jfr.Frequency
import kotlin.math.abs

class LeetCodeSolved {
    fun twoSum(nums: IntArray, target: Int): IntArray {

        val ans= IntArray(2)
        for (i in 0 until nums.size-1){

            var right=i+1

            while (right < nums.size){

                if (nums[i] + nums[right]==target){
                    ans[0]=i
                    ans[1]=right
                break
                }
                right++
            }
        }
        return ans
    }


}