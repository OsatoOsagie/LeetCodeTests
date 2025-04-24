import java.util.*
import kotlin.math.pow
import kotlin.math.sqrt

class LeetCodeSolved {

    fun countCompleteSubarrays(nums: IntArray): Int {

        var left=0
        var curr= mutableListOf<Int>()
        var ans=0
        var k= nums.toSet().size
        var final=0

        for (i in 0 until nums.size){

            if (!curr.contains(nums[i]))
                ans++
            curr.add(nums[i])

                while (curr.toSet().size ==k){
                    final += nums.size-i
                    curr.removeFirst()
                    left++
                }



        }

        return final


    }


}