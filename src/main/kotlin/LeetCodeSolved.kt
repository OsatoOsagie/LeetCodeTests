import java.util.*
import kotlin.math.abs
import kotlin.math.sign

class LeetCodeSolved {
    fun countGoodTriplets(arr: IntArray, a: Int, b: Int, c: Int): Int {

        var count =0

        for (i in 0 until arr.size-2){
            for (j in i+1 until arr.size-1){
                for (k in j+1 until arr.size){
                    if (checkIfGood(arr[i], arr[j], arr[k],a,b,c)){
                        count++
                    }

                }

            }
        }

        return count

    }

    fun checkIfGood(i: Int, j:Int, k:Int, a:Int,b:Int,c: Int) : Boolean{

        return (abs( i-j) <= a) && (abs( j-k) <=b) && (abs( i-k) <=c)
    }


}