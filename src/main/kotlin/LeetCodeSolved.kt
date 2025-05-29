import jdk.jfr.Frequency
import java.util.PriorityQueue
import kotlin.math.abs
import kotlin.math.absoluteValue
import kotlin.math.sign

class LeetCodeSolved {

    fun reverse(x: Int): Int {

        var n=x
        var ans=0L
        val sb=StringBuilder()
        if(n.sign==-1){
            sb.append('-')

        }
        while (n!=0){

           ans = (ans* 10)+(n%10)
               if (ans > Int.MAX_VALUE || ans < Int.MIN_VALUE)  return 0

            n/=10
        }




        return  ans.toInt()
    }


}