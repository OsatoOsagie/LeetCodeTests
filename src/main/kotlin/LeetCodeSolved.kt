import java.util.ArrayList

class LeetCodeSolved {
    fun removeTrailingZeros(num: String): String {

     var ans=""
        for (i in num.length-1 downTo  0){
            if (num[i]!='0'){
                ans= num.substring(0,i+1)
                break
            }
        }

        return ans

    }


}