import java.util.*
import kotlin.math.max

class LeetCodeSolved {
    fun letterCombinations(digits: String): List<String> {
        if (digits.isEmpty()) return emptyList() // Edge case

        val keypadMap = mapOf(
            '2' to listOf('a', 'b', 'c'),
            '3' to listOf('d', 'e', 'f'),
            '4' to listOf('g', 'h', 'i'),
            '5' to listOf('j', 'k', 'l'),
            '6' to listOf('m', 'n', 'o'),
            '7' to listOf('p', 'q', 'r', 's'),
            '8' to listOf('t', 'u', 'v'),
            '9' to listOf('w', 'x', 'y', 'z')
        )

        // Convert each digit into its corresponding list of characters
        val keyList = digits.mapNotNull { keypadMap[it] } // List of Lists (e.g. [['a','b','c'], ['d','e','f']])

        val ans = mutableListOf<String>()
        backtrack(mutableListOf(), 0, keyList, ans)

        return ans
    }

    // Backtracking function
    private fun backtrack(curr: MutableList<Char>, index: Int, keyList: List<List<Char>>, ans: MutableList<String>) {
        if (index == keyList.size) {
            ans.add(curr.joinToString(""))
            return
        }

        for (char in keyList[index]) { // Iterate over available characters for the current digit
            curr.add(char)
            backtrack(curr, index + 1, keyList, ans)
            curr.removeAt(curr.size - 1) // Remove last character after recursion
        }
    }



    data class TreeNode(
        var `val`: Int, var left: TreeNode? = null,
        var right: TreeNode? = null
    )





}