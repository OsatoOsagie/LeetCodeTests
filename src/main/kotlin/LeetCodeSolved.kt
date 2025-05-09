class LeetCodeSolved {
    fun minProcessingTime(processorTime: List<Int>, tasks: List<Int>): Int {

        val sortedTasks = tasks.sortedDescending()
        var ans= Int.MIN_VALUE

        val processTimeSorted= processorTime.sorted()
        var taskIndex = 0
        for (time in processTimeSorted){

            repeat(4){
                ans= maxOf(ans, (sortedTasks[taskIndex] + time))
                taskIndex++
            }

        }

        return ans
    }


}