import java.util.*
import kotlin.collections.Set
import kotlin.math.min

class LeetCodeSolved {
    fun sortEvenOdd(nums: IntArray): IntArray {

        var oddList= nums.withIndex().filter { it.index%2!=0 }
        var evenList= nums.withIndex().filter { it.index%2==0 }

        evenList=evenList.sortedBy { it.value }
        oddList= oddList.sortedByDescending { it.value }

        var left=0
        var right=0

        for (i in 0 until nums.size){
            if (i%2==0){
                nums[i]=evenList[left].value
                left++
            }else{
                nums[i] = oddList[right].value
                right++
            }
        }
        return nums
    }


}