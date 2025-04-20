import java.util.*
import kotlin.math.pow
import kotlin.math.sqrt

class LeetCodeSolved {
    fun shortestCompletingWord(licensePlate: String, words: Array<String>): String {

        var maxSoFar=Pair(0,"")
        val licensePlateNew= licensePlate.filter{it.isLetter()}.lowercase(Locale.getDefault())

        val map= licensePlateNew.groupingBy { it }.eachCount()
        for (word in words){
            val copiedMap = map.toMutableMap()
            val count=checkChars(copiedMap,word)

            if (count > maxSoFar.first || (count== maxSoFar.first && word.length <maxSoFar.second.length)){
                maxSoFar=Pair(count,word)
            }
        }

        return maxSoFar.second
    }

    fun checkChars(map: MutableMap<Char,Int>, word : String) : Int{

        var count =0
        for(c in word){
            if (map.containsKey(c) && map[c]!! > 0){

                map[c] = map.getOrDefault(c,0)-1
                count++
            }
        }

        return count
    }


}