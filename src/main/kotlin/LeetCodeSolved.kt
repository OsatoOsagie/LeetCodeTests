import jdk.jfr.Frequency
import kotlin.math.abs

class LeetCodeSolved {
    fun checkDistances(s: String, distance: IntArray): Boolean {


        val distanceMap = mutableMapOf<Char, Int>().apply {

            s.withIndex().forEach() {

                    val ans=(it.index-this.getOrDefault(it.value,0))-1
                    this[it.value] = ans }

        }

        val sSet= s.toSet()

        println(distanceMap)

        sSet.forEach{
            if (distanceMap[it]!=distance[it-'a']){
                return false
            }
        }

        return true
    }




}