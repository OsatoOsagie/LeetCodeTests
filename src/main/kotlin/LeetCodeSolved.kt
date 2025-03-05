import java.util.*
import kotlin.math.abs
import kotlin.math.max
import kotlin.math.min


class LeetCodeSolved {
    fun maxArea(height: IntArray): Int {
        var i=0
        var j= height.size-1
        var maxWater=0

        while (i<j){
            val distance= j-i
            val length= min(height[i],height[j])

            maxWater = max(distance*length, maxWater)

            if (height[i] < height[j]){
                i++
            }else{
                j--
            }


        }
        return maxWater

    }


}