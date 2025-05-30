import jdk.jfr.Frequency
import java.util.PriorityQueue
import kotlin.math.abs
import kotlin.math.absoluteValue
import kotlin.math.sign

class LeetCodeSolved {
    fun isValid(s: String): Boolean {

        val closerMap= mutableMapOf<Char,Char>()

        closerMap[')'] = '('
        closerMap['}'] = '{'
        closerMap[']'] = '['


        val stack= ArrayDeque<Char>()

        for (c in s){

            if (!closerMap.contains(c)){
                stack.addLast(c)
            }else{
                if (stack.isNotEmpty()){
                    val lst=stack.removeLast()
                    if (closerMap[c] !=lst){
                        return false
                    }

                }else{
                    return false
                }
            }

        }

        return stack.isEmpty()
    }


}