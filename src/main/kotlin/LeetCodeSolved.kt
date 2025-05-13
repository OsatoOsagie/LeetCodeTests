import jdk.jfr.Frequency

class LeetCodeSolved {



    fun findEvenNumbers(digits: IntArray): IntArray {
        val validEntries= (100..999).filter { it %2==0 }
        val mapOfDigits = mutableMapOf<Int,Int>().apply {
            digits.forEach { this[it] = getOrDefault(it,0) +1 }
        }
        val ans= mutableListOf<Int>()

        for (entry in validEntries){
            if(checkEntry(entry,mapOfDigits.toMutableMap())){
                ans.add(entry)
            }
        }

        return ans.toIntArray()

    }

    private fun checkEntry( num:Int, map: MutableMap<Int,Int>): Boolean{

        var n= num

        while (n >0){

            val key = n % 10
            if (!map.containsKey(key) || map[key]!! <=0 ){
                return false
            }else{
              if (map[key]!!>0){
                 map[key]= map.getOrDefault(key,0) -1
              }
            }

            n /= 10
        }
        return true
    }


}