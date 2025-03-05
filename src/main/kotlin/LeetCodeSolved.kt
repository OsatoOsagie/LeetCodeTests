import java.util.*
import kotlin.math.abs


class LeetCodeSolved {
    fun numRescueBoats(people: IntArray, limit: Int): Int {
        var ans= 0;
        var i=0
        var j= people.size-1

        people.sort()

        while (i <=j){
            if (people[i] + people[j] <= limit){
                i++
            }

            j--
            ans++
        }

        return ans


    }


}