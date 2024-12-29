class MinStack {
    private val stack = ArrayDeque<Int>()

    fun push(i: Int){
        stack.addLast(i)
    }

    fun pop(){
        stack.removeLast()
    }

    fun top():Int {
        return stack.last()
    }

    fun getMin(): Int {
        return stack.min()

    }


}