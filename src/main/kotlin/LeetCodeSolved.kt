import jdk.jfr.Frequency
import kotlin.math.abs

class LeetCodeSolved {
    fun maxLengthBetweenEqualCharacters(s: String): Int {
        var lastIndx=0
        val mapOfChars= mutableMapOf<Char,Int>().apply {
            s.forEachIndexed { i,c->
               if (!this.containsKey(c)){
                  this[c]= s.lastIndexOf(c) - i -1
               }
            }
        }


       return mapOfChars.values.max()

    }


}