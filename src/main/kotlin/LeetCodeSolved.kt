import java.util.*
import kotlin.math.abs
import kotlin.math.max
import kotlin.math.min


class LeetCodeSolved {
    fun minSetSize(arr: IntArray): Int {

        if (arr.toSet().size==1){
            return 1
        }

        val map= mutableMapOf<Int,Int>().apply {
            arr.forEach { element -> this[element]= this.getOrPut(element){0}+1  }

        }
        val size= arr.size/2

        val list = map.entries.map { Pair(it.key, it.value) }.toMutableList()
        list.sortByDescending { it.second }

        val set= mutableSetOf<Int>()
        var listSum= list.sumOf { it.second }

        for (i in list){
            set.add(i.first)
            listSum -=i.second
            println(listSum)

            if (listSum <= size){
                break
            }



        }
        return set.size
    }


}