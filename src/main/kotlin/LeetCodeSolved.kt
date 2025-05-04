import java.util.*
import kotlin.collections.Set

class LeetCodeSolved {

    fun findComplement(num: Int): Int {

        val numBin= num.toString(2).toCharArray()

        for (i in 0 until  numBin.size){
            if(numBin[i]=='0'){
                numBin[i]='1'
            }else{
                numBin[i]='0'
            }
        }

        return numBin.joinToString("").toInt(2)
    }


}