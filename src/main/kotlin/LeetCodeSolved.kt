import jdk.jfr.Frequency
import kotlin.math.abs

class LeetCodeSolved {
    fun checkTwoChessboards(coordinate1: String, coordinate2: String): Boolean {


        return checkColour(coordinate1) == checkColour(coordinate2)

    }

    private fun checkColour(s:String) : String{

        val x= s[0] -'a'
        val y =s[1] - '0'-1

        return if ((x+y) %2==0) "black" else "white"
    }


}