class LeetCodeSolved {


    fun minimumRecolors(blocks: String, k: Int): Int {

        var left=0
        var ans=Int.MAX_VALUE
        var curr=0
        var count=0

        for (i in 0 until blocks.length){
            if (blocks[i] == 'W'){
                count++

            }
                curr++


            while (curr >= k){
                ans= minOf(count,ans)
                if (blocks[left]=='W'){
                    count--
                }
                left++
                curr--

            }

        }

        return ans


    }


}