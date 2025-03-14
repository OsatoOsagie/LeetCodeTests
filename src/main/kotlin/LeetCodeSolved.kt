import kotlin.math.max
import kotlin.math.sign

class LeetCodeSolved {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {

        val map= mutableMapOf<String, MutableList<String>>().apply {


        }

        strs.forEach {
            val sorted=it.toCharArray().sorted().joinToString("")

            //check if its already in the map

            map.getOrPut(sorted){ mutableListOf() }.add(it)

        }



        val v= map.values.toList().sortedBy { it.size }
        return v
    }

    data class TreeNode(
        var `val`: Int, var left: TreeNode? = null,
        var right: TreeNode? = null
    )



}