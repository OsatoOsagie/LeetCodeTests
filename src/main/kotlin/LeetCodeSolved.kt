class LeetCodeSolved {


    fun hasSameDigits(s: String): Boolean {

        var current=s

        while (current.length >2){
            current=getStringValues(current)
        }

        return current[0] == current[1]
    }

    private fun getStringValues(s:String) : String{

        val sb=StringBuilder()


        for (i in 0 until s.length - 1) {
            val sum = (s[i] - '0') + (s[i + 1] - '0')
            sb.append(sum % 10)
        }

        return sb.toString()

    }




}