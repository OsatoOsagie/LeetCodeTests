import kotlin.math.min
import kotlin.math.sqrt

class LeetCodeSolved {

    fun search(nums: IntArray, target: Int): Int {
        var left =0
        var right= nums.size -1

        while (left < right){
            val mid= left+(right-left)/2
            println(mid)

            if (nums[mid]== target){
                return mid
            }

            if (nums[mid] > target){
                right = mid-1
            }else{
                left=mid+1
            }
        }

        return -1

    }


}