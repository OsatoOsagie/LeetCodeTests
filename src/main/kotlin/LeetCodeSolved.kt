import jdk.jfr.Frequency
import kotlin.math.abs

class LeetCodeSolved {
    fun isAnagram(s: String, t: String): Boolean {

       val map= mutableMapOf<Char, Int>().apply {
           s.forEach {
               this[it] = getOrDefault(it,0)+1
           }
       }

        for (c in t){
            if (map.containsKey(c)){
                val curr= map[c]
                map[c] = curr!!-1

                if (map[c]==0){
                    map.remove(c)
                }

            }else{
                return false
            }
        }

        return map.isEmpty()
    }


}