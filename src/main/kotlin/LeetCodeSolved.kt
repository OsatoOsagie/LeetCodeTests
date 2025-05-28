import jdk.jfr.Frequency
import kotlin.math.abs

class LeetCodeSolved {
    fun lengthOfLongestSubstring(s: String): Int {

        if (s.length==1){
            return 1
        }

        var ans= 0
        val curr= mutableListOf<Char>()
        var left=0

        for (i in 0 until s.length){
            if (!curr.contains(s[i])){
                curr.add(s[i])

            }else{
                while (curr.contains(s[i])){

                    curr.removeFirst()

                }
                curr.add(s[i])
            }
            ans = maxOf(curr.size,ans)

        }
        return  ans
    }


}