class LeetCodeSolved {

    fun mergeAlternatively(word1: String, word2: String): String {
        var left=0
        var right=0
        val ans= StringBuilder()

        while (left < word1.length && right < word2.length){
            ans.append(word1[left])
            ans.append(word2[right])

            right++
            left++
        }

        if (left < word1.length){

            for (i in left until word1.length){
                ans.append(word1[i])
            }
        }
        if (right < word2.length){

            for (i in right until word2.length){
                ans.append(word2[i])
            }
        }

        return ans.toString()

    }

    data class TreeNode(
        var `val`: Int, var left: TreeNode? = null,
        var right: TreeNode? = null
    )





}