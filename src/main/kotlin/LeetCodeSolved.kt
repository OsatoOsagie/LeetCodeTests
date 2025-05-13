import jdk.jfr.Frequency

class LeetCodeSolved {

    fun countDigits(num: Int): Int {

        val listOfNums= mutableListOf<Int>()
        var n= num
        var ans=0

        while (n > 0){
            val x= n%10
            n /=10
            listOfNums.add(x)
        }


        listOfNums.forEach{
            if (num%it ==0){
                ans++
            }
        }

        return ans

    }


}