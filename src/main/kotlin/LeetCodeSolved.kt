import kotlin.math.max
import kotlin.math.min
import kotlin.math.sqrt

class LeetCodeSolved {

    data class TreeNode(var `val` : Int , var left: TreeNode? = null,
                        var right: TreeNode? = null)

    companion object {
        fun maxDepth(root: TreeNode?): Int {
            if (root == null) return 0

            val leftDepth = maxDepth(root.left)
            val rightDepth = maxDepth(root.right)


            return 1 + max(leftDepth, rightDepth)
        }
    }


}