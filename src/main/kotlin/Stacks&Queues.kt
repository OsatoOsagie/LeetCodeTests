class `Stacks&Queues` {
    fun simplifyPath(path: String): String {


        val validPath = path.split("/").filter { it.isNotEmpty() }// Filter out empty parts from split
        val stack: MutableList<String> = mutableListOf()

        if (path[0] != '/') {
            return ""  // If the path doesn't start with '/', it's invalid
        }

        for (p in validPath) {
            when (p) {
                "." -> continue  // Skip current directory references
                ".." -> if (stack.isNotEmpty()) stack.removeAt(stack.size - 1)  // Go up one directory
                else -> stack.add(p)  // Add valid directory names to stack
            }
        }
        println(stack.toString())

        return stack.joinToString("/","/")
    }

    fun makeGood(s: String): String {
        val stack = mutableListOf<Char>()

        // If the string has only one character, just return the lowercase version of it
        if (s.length == 1) {
            return s.lowercase()
        }

        for (t in s) {
            // Check if the stack is not empty and the top element is the same letter but different case
            if (stack.isNotEmpty() && stack.last().equals(t, ignoreCase = true) && stack.last() != t) {
                stack.removeAt(stack.size - 1)  // Remove the top element from the stack
            } else {
                stack.add(t)  // Otherwise, add the current character to the stack
            }
        }

        return stack.joinToString("")  // Return the final string from the stack
    }


}

class MovingAverage(size: Int){
    private val s = size
    private val queue = ArrayDeque<Double>()

    fun next(`val`: Int): Double {
        // Add the new value to the queue
        queue.addLast(`val`.toDouble())

        // If the queue exceeds the window size, remove the oldest value
        if (queue.size > s) {
            queue.removeFirst()  // Maintain the size of the queue
        }

        // Calculate the moving average
        val movingAverage = queue.sum() / queue.size

        return movingAverage
    }

}