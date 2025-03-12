import kotlin.math.max
import kotlin.math.sign

class LeetCodeSolved {
    fun maximumCount(nums: IntArray): Int {
        var negCount = 0
        var posCount =0

        for (num in nums) {
            if (num < 0){
                negCount++
            }else if(num==0){
                continue
            }else{
                posCount++
            }
        }

        return max(posCount,negCount)

    }

    data class TreeNode(
        var `val`: Int, var left: TreeNode? = null,
        var right: TreeNode? = null
    )


}