import jdk.jfr.Frequency
import java.util.PriorityQueue
import kotlin.math.abs

class LeetCodeSolved {
    fun moveZeroes(nums: IntArray):Unit {

        val num=IntArray(nums.size)

        val lst= nums.filter { it!=0 }

        var x=0
        for (i in 0 until lst.size){
            num[x] = lst[i]
            x++
        }


        for (i in 0 until nums.size){
            nums[i] = num[i]
        }




    }


}