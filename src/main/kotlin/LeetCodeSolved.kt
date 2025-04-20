import java.util.*
import kotlin.math.pow
import kotlin.math.sqrt

class LeetCodeSolved {
    fun getAverages(nums: IntArray, k: Int): IntArray {

        val n=nums.size
        val prefix= LongArray(n+1)
        val ans= IntArray(n) {-1}

        if (k == 0) return nums // If k is 0, the average is the element itself
        if (2 * k + 1 > n) return ans // Not enough elements for any average

        for (i in 0 until n){
            prefix[i+1] = prefix[i] + nums[i]
        }

        println( prefix.toList())


        for (i in k until n-k){

                val length=2*k+1
                val sum = prefix[i+k+1] - prefix[i-k]
                println(sum)
                ans[i]= (sum/length).toInt()

        }

        return ans




    }


}