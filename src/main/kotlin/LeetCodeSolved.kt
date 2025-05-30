import jdk.jfr.Frequency
import java.util.PriorityQueue
import kotlin.math.abs
import kotlin.math.absoluteValue
import kotlin.math.sign

class LeetCodeSolved {
    class MovingAverage(size: Int) {

        private val lst = ArrayDeque<Int>(size)
        private val n=size

        fun next(`val`:Int): Double{
            if (lst.size < n){
                lst.add(`val`)
            }else{
                lst.removeFirst()
                lst.add(`val`)
            }



           return lst.sum().toDouble()/lst.size


        }
    }


}