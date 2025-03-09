import kotlin.math.min
import kotlin.math.sqrt

class LeetCodeSolved {
    fun closestPrimes(left: Int, right: Int): IntArray {

        val range = (left..right).toList().filter {
            isPrime(it)
        }


        var min= Int.MAX_VALUE
        var ans= mutableListOf<Int>(-1,-1)

        for (i in 1 until range.size) {
            val diff = range[i] - range[i - 1]

            if ( diff<min){

                min =diff
                ans[0]=range[i - 1]
                ans[1]=range[i]
            }

        }


//        if (map.isEmpty()) {
//            return intArrayOf(-1, -1)
//        }




        return ans.toIntArray()


    }

    private fun isPrime(num: Int): Boolean {
        if (num < 2) return false
        if (num == 2) return true
        if (num % 2 == 0) return false
        val limit = kotlin.math.sqrt(num.toDouble()).toInt()
        for (i in 3..limit step 2) {
            if (num % i == 0) return false
        }
        return true
    }



}