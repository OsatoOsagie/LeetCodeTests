


class LeetCodeSolved {
    fun maxNumberOfApples(weight: IntArray): Int {

        weight.sort()
       val MAX_SUM=5000

        var ans=0
        var count=0
        for (w in weight){

            ans +=w
            if (ans <= MAX_SUM){
                count++
            }else{
                break
            }

        }

        return count

    }


}