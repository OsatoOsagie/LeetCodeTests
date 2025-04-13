import kotlin.math.sign

class LeetCodeSolved {
    fun combinationSum(candidates: IntArray, i: Int): List<List<Int>> {

        val ans = mutableListOf<List<Int>>()
        backtrack(mutableListOf(), 0,0, ans, i,candidates)

        return ans
    }

    private fun backtrack(currPath: MutableList<Int>, startIndex: Int,currSum:Int, ans:MutableList<List<Int>>, target: Int,candidates: IntArray ){

        if (currSum==target){
            ans.add(ArrayList(currPath))
            return
        }

        for(i in startIndex until candidates.size){

            val number= candidates[i]

            if ((number + currSum) <= target){
                currPath.add(number)
                backtrack(currPath,  i, currSum+number,ans, target,candidates)
                currPath.removeAt(currPath.size - 1)
            }

        }



}


}