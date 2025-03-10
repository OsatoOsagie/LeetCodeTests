import kotlin.math.min
import kotlin.math.sqrt

class LeetCodeSolved {
    fun maximumUnits(boxTypes: Array<IntArray>, truckSize: Int): Int {

        val sortedList= boxTypes.sortedWith(
            compareByDescending<IntArray> { it[1] }
                .thenBy { it[0] }
        )


        var ans= 0
        var sum=0



            for (i in sortedList){
                if (i[0] +ans < truckSize){
                    ans+=i[0]
                    sum += i[0]*i[1]

                    println(sum)
                }else{
                    val v= truckSize-ans
                    sum += v * i[1]
                    ans +=v
                    break
                }
            }


        return sum

    }


}