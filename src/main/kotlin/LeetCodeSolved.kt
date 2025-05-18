import jdk.jfr.Frequency
import kotlin.math.abs

class LeetCodeSolved {

    fun numOfSubarrays(arr: IntArray, k: Int, threshold: Int): Int {

        var left=0
        var ans=0
        var curr=0
        var count=0

        for (i in 0 until arr.size){
            curr += arr[i]
            count++

            while (count>=k){
                if(curr/k >= threshold){
                    ans++
                }
                curr-=arr[left]
                left++
                count--
            }
        }

        return ans


    }




}