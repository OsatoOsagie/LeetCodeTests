import jdk.jfr.Frequency
import kotlin.math.abs

class LeetCodeSolved {
    fun unequalTriplets(nums: IntArray): Int {

        var count=0

        for (i in 0 until nums.size - 2) {
            var j = i + 1
            var k = j + 1
            while (j < nums.size - 1) {
                while (k < nums.size) {
                   if (isPairwiseDistict(nums[i],nums[j],nums[k])){
                      count++
                   }
                    k++
                }
                j++
                k = j + 1
            }
        }

        return count

    }

    private fun isPairwiseDistict(a:Int, b:Int, c:Int): Boolean{

        if (a !=b && a!=c && b!=c){
            return true
        }
        return false
    }


}