import java.util.*

class LeetCodeSolved {
    fun countSubarrays(nums: IntArray, k: Int): Long {
        val maxNum = nums.max()

        var left=0
        var seen= 0
        var ans=0L


        for (i in 0 until nums.size){
            if (nums[i]==maxNum){
                seen++
            }

            while (seen >= k){
                ans+= nums.size -i

                if (nums[left] == maxNum){
                    seen--
                }
                left++



            }



        }


        return ans

    }



}