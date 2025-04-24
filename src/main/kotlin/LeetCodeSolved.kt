import java.util.*
import kotlin.math.pow
import kotlin.math.sqrt

class LeetCodeSolved {
    fun targetIndices(nums: IntArray, target: Int): List<Int> {

         nums.sort()
        val ans= mutableListOf<Int>()
        var left=0
        var right= nums.size-1

        while (left < right){
            val mid= left + (right - left) /2
            val element = nums[mid]

            if (nums[mid] >=target){
                right = mid
            }else{
                left = mid+1
            }
        }

       for (i in left until nums.size){
           if (nums[i]==target){
               ans.add(i)
           }
       }

        return ans


    }


}