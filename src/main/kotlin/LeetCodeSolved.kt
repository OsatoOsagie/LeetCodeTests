import java.util.*
import kotlin.math.pow
import kotlin.math.sqrt

class LeetCodeSolved {

    fun carPooling(trips: Array<IntArray>, capacity: Int): Boolean {

//        get the furthest trip
        val furthest= trips.maxOf { it[2] }

        //compute the number line of passengers
        val passengersArr= IntArray(furthest+1)

        for(trip in trips){
            val passengers= trip[0]
            val from= trip[1]
            val to= trip[2]

            passengersArr[from] += passengers
            passengersArr[to] -= passengers

        }

        var currNumOfPassengers=0
        for (num in passengersArr){
            currNumOfPassengers +=num

            if (currNumOfPassengers >capacity){
                return false
            }
        }

        return true


    }


}