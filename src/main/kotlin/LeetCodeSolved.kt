import jdk.jfr.Frequency
import kotlin.math.abs

class LeetCodeSolved {

    fun makeSmallestPalindrome(s: String): String {

        val sChar= s.toCharArray()
        var left=0
        var right= sChar.size-1

       while (left < right){
           val c1 = sChar[left]
           val c2 = sChar[right]
           if (c1 < c2){
                   sChar[right]= sChar[left]

               }else{
                   sChar[left]=sChar[right]
               }


           left++
           right--
       }
        return String(sChar)

    }


}