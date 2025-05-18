import jdk.jfr.Frequency
import kotlin.math.abs

class LeetCodeSolved {

    fun finalString(s: String): String {

        var ans=""

        for (c in s){
            if (c=='i'){
                ans= reverseString(ans)
            }else{
                ans +=c
            }
        }

        return ans


    }

    private fun reverseString(s:String):String{

        val chars= s.toCharArray()
        var right=chars.size-1
        var left=0

        while (left < right){
            val temp= chars[right]
            chars[right]= chars[left]
            chars[left]= temp

            left++
            right--

        }

        return chars.joinToString("")



    }


}