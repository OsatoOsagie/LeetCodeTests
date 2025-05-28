import jdk.jfr.Frequency
import java.util.PriorityQueue
import kotlin.math.abs

class LeetCodeSolved {

    fun frequencySort(s: String): String {

        val map=s.groupingBy { it }.eachCount()
        val sb=StringBuilder()

        val ans= map.entries.sortedWith(compareByDescending{it.value})

        for (i in ans){

            repeat(i.value){
                sb.append(i.key)
            }
        }

        return sb.toString()

//        return String(s.toCharArray().sortedWith(compareBy { it }).toCharArray())

    }


}