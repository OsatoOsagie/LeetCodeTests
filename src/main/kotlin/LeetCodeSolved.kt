import jdk.jfr.Frequency
import java.util.PriorityQueue
import kotlin.math.abs
import kotlin.math.absoluteValue
import kotlin.math.sign

class LeetCodeSolved {
    fun merge(intervals: Array<IntArray>): Array<IntArray> {

        val sorted= intervals.sortedBy{it[0]}

        val ans= mutableListOf<IntArray>()

        for (s in sorted){
            val startTime = s[0]
            val endTime= s[1]
            if (ans.isNotEmpty() && startTime <= ans.last()[1]){

                ans.last()[1]= maxOf(endTime, ans.last()[1])

            }else{
                ans.add(s)
            }
        }

        return ans.toTypedArray()
    }


}