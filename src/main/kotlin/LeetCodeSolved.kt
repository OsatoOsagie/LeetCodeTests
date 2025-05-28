import jdk.jfr.Frequency
import kotlin.math.abs

class LeetCodeSolved {

    fun firstUnique(s: String): Int {
        var min= Int.MAX_VALUE

       val map= mutableMapOf<Char,Int>().apply {
           s.forEach {
               this[it]=this.getOrDefault(it,0)+1
           }
       }

        val valid= map.filter { it.value < 2 }

        for (i in valid){
           min= minOf( s.indexOfFirst { it==i.key },min)
        }



        return if(min < Int.MAX_VALUE) min else -1
    }


}