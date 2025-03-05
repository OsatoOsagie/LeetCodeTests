import java.util.*
import kotlin.math.abs


class LeetCodeSolved {
    fun maximum69Number(num: Int): Int {

        val numList= convertToArray(num).toMutableList()
        var max=num
        println( converToNum(numList))

        for (i in 0 until numList.size){
            when(numList[i]){
                6->{
                    numList[i]=9
                    max= maxOf(max,converToNum(numList))
                    numList[i]=6
                }
            }
        }
        return max

    }

    fun convertToArray(num:Int) : List<Int>{

        var n=num
        val list= mutableListOf<Int>()

        while (n>0){
            list.add(n%10)
            n /=10
        }

        println(list)

        return list.reversed()

    }

    fun converToNum(list: MutableList<Int>): Int{
        var n=0

        for (i in 0 until list.size){
            n+=list[i]
            if (i != list.size-1){
                n *=10
            }


        }
        return n

    }


}