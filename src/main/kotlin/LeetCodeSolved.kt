import jdk.jfr.Frequency
import java.util.PriorityQueue
import kotlin.math.abs
import kotlin.math.absoluteValue
import kotlin.math.sign

class LeetCodeSolved {
    fun compress(chars: CharArray): Int {
        val s= StringBuilder()

        val charsFreq= mutableMapOf<Char,Int>().apply {
            chars.forEach {
                this[it] = getOrDefault(it,0)+1
            }
        }



         chars.toSet().forEach {
             val freq = charsFreq[it]
             if (freq ==1){
                 s.append(it)
             }else if(freq!! in 2..9){
                 s.append(it)
                 s.append(freq)
             }else{
                 s.append(it)
                 val digits= spiltFrq(freq)

                 digits.forEach{ f ->
                     s.append(f)
                 }


             }
         }

        val charsNew = s.toString()

       for ( i in 0 until  charsNew.length){
           chars[i]= charsNew[i]
       }




        return s.length

    }

    private fun spiltFrq(x:Int): List<Int>{

        var n=x
        val ans= ArrayDeque<Int>()
        while (n !=0){
            ans.addFirst(n%10)
            n/=10
        }

        return ans
    }


}