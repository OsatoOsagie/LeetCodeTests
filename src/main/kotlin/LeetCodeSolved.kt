import java.util.*
import kotlin.collections.Set

class LeetCodeSolved {
    fun numEquivDominoPairs(dominoes: Array<IntArray>): Int {

        val map = mutableMapOf<List<Int>,Int>()
        var pairs=0

        for (dominoe in dominoes){
            val key=dominoe.sorted()
            if (map.containsKey(key)){
                pairs += map[key]!!
                map[key] = map.getOrDefault(key,0)+1

            }else{
                map[key]= map.getOrDefault(key,0)+1
            }


        }

        return pairs

    }


}