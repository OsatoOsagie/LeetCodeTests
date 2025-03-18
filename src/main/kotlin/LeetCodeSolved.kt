import java.util.*
import kotlin.math.max

class LeetCodeSolved {
    fun combinationSum3(k: Int, n: Int): List<List<Int>> {

        val candidates= (1..9).toList()

        val ans= mutableListOf<List<Int>>()

        backtrack(mutableListOf(),0,ans,candidates,n,k)
        println(ans)

        return ans

    }

        private fun backtrack(
            curr: MutableList<Int>,
            index: Int,
            ans: MutableList<List<Int>>,
            candidates: List<Int>,
            target: Int,
            k:Int
        ) {
            if (target == 0 && curr.size==k) {  // Base case: when remaining sum is zero
                ans.add(ArrayList(curr))
                return
            }

            for (i in index until candidates.size) {
                // Skip duplicates (important for combinationSum2)
                if (i > index && candidates[i] == candidates[i - 1]) continue

                if (candidates[i] > target) break // Stop early (pruning)

                curr.add(candidates[i])
                backtrack(curr, i + 1, ans, candidates, target - candidates[i],k) // Move to next index
                curr.removeAt(curr.size - 1)  // Backtrack step
            }
        }


    data class TreeNode(
        var `val`: Int, var left: TreeNode? = null,
        var right: TreeNode? = null
    )





}