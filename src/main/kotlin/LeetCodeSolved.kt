import kotlin.math.max
import kotlin.math.sign

class LeetCodeSolved {

    data class TreeNode(
        var `val`: Int, var left: TreeNode? = null,
        var right: TreeNode? = null
    )

    class MovingAverage(size: Int) {

        var s= size

        private val arr= mutableListOf<Double>()


        fun next(`val`:Int) : Double{
            var ans=0.0
            if (arr.size < s){
                arr.add(`val`.toDouble())
                ans = arr.sum()/arr.size

            }else{
                arr.removeFirst()
                arr.add(`val`.toDouble())
                ans = arr.sum()/arr.size.toDouble()
            }


            return ans

        }
    }


}