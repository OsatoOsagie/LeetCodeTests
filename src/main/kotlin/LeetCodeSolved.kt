import kotlin.math.sign

class LeetCodeSolved {
    fun rearrangeArray(nums: IntArray): IntArray {

        val positive = nums.filter { it.sign == 1 }
        val negative = nums.filter { it.sign == -1 }

        var left =0
        var right =0
        var i=0


        while (left < positive.size && right < negative.size){

            nums[i]= positive[left]
            left++
            i++
            nums[i] = negative[right]
            i++
            right++

        }




        return nums
    }


}