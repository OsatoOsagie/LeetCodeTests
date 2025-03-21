import java.util.*
import kotlin.math.max

class LeetCodeSolved {
    fun combinationSum(candidates: IntArray, target: Int): List<List<Int>> {

        val ans= mutableListOf<List<Int>>()
        backtrack(mutableListOf(), ans,candidates,target)
        return ans
    }

        private fun backtrack(
            curr: MutableList<Int>,
            ans: MutableList<List<Int>>,
            candidates: IntArray,
            target: Int,
        ) {
            if (target == 0) {  // Base case: when remaining sum is zero
                ans.add(ArrayList(curr))
                return
            }

            for (candidate in candidates) {
                // Skip duplicates (important for combinationSum2)
//                if (i > index && candidates[i] == candidates[i - 1]) continue

                if (candidate > target) break // Stop early (pruning)

                curr.add(candidate)
                backtrack(curr,  ans, candidates, target - candidate) // Move to next index
                curr.removeAt(curr.size - 1)  // Backtrack step
            }
        }


    data class TreeNode(
        var `val`: Int, var left: TreeNode? = null,
        var right: TreeNode? = null
    )





}