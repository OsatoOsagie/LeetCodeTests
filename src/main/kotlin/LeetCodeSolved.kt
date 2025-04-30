import java.util.*

class LeetCodeSolved {


    fun findNumbers(nums: IntArray): Int {

        var ans=0

        for (n in nums){
            val count=helper(n)

            if (count%2==0){
                ans++
            }
        }
        return ans
    }

    private fun helper(num:Int) :Int{

        var n=num
        var count=0

        while (n>0){
            n /=10
            count++

        }
        return count
    }

}