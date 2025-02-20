class LeetCodeSolved {
    fun findOcurrences(text: String, first: String, second: String): Array<String> {
        val stack = ArrayDeque<String>()
        val ans= mutableListOf<String>()

        val textList = text.split(" ")

        textList.forEach { stack.addLast(it) }


        while (stack.isNotEmpty()){
            val v =stack.take(3)


            if (( v.size ==3 ) && (v.first()==first && v[1]==second)){
                println("Got 1!")
                ans.add(v.last())
            }
            repeat(1){
                stack.removeFirst()
            }

        }
        return ans.toTypedArray()

    }


}