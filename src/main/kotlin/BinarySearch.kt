class BinarySearch {


    fun searchInsert(nums: IntArray, target: Int): Int {

        nums.sort()
        var left=0
        var right= nums.size-1

        while (left <= right){
            val mid= left + (right-left)/2

            if (nums[mid] == target){
                return mid
            }else if (nums[mid] < target){
                left= mid+1
            } else {
                right= mid -1
            }
        }
        return left

    }

        fun answerQueries(nums: IntArray, queries: IntArray): IntArray {
            // Get the prefix sum array of the sorted 'nums'.
            nums.sort()
            for (i in 1 until nums.size) {
                nums[i] += nums[i - 1]
            }

            // For each query, find its insertion index in the prefix sum array.
            val answer = IntArray(queries.size)
            for (i in queries.indices) {
                val index = binarySearch(nums, queries[i])
                answer[i] = index
            }

            return answer
        }

        private fun binarySearch(nums: IntArray, target: Int): Int {
            var left = 0
            var right = nums.size - 1
            while (left < right) {
                val mid = (left + right) / 2
                when {
                    nums[mid] == target -> return mid + 1
                    nums[mid] < target -> left = mid + 1
                    else -> right = mid - 1
                }
            }
            return if (nums[left] > target) left else left + 1
        }
    //    Binary Search on solution spaces:
        var limit =0
    fun minEatingSpeed(piles: IntArray, h: Int):Int {
        limit=h
        var left =1
        var right =piles.max()

        while (left <= right){
            val mid= left + (right - left)/2

            if (check(mid,piles)){
                right=mid-1
            }else{
                left=mid+1
            }
        }
        return left

    }

    //how many hours will it take

    private fun check(k: Int, piles: IntArray): Boolean{
        var hours =0

        for (banana in piles){
            hours +=Math.ceil(banana.toDouble() / k).toInt()
        }
        return hours <= limit
    }

//    fun singleSearch(inp: String): List<>{
//
//    }


}





