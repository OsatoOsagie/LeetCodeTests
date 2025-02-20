import java.util.LinkedList

class LeetCodeSolved {
    fun distributeCandies(candies: Int, numPeople: Int): IntArray {

        val ans= IntArray(size = numPeople)
        var count=1
        var candiesV=candies

        while (candiesV >0){
            for (i in 0 until  ans.size){
                if (candiesV <=0){
                    break
                }
                val c= candiesV-count

                if (c<=0){
                    ans[i] +=candiesV
                }else{
                    ans[i] +=count
                }

                candiesV -=count

                count++
            }
        }

        ans.forEach { println(it) }



        return ans



    }


}