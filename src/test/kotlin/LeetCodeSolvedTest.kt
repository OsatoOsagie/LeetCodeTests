import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class LeetCodeSolvedTest {

   @Test
   fun kClosest(){
//       given
val nums = arrayOf(intArrayOf(3,3), intArrayOf(5,-1), intArrayOf(-2,4) )
       val k=2

//       when
       val result:Array<IntArray> =LeetCodeSolved().kClosest(nums,k)



//       then
       val expectation= arrayOf(intArrayOf(3,3), intArrayOf(-2,4))

       assertArrayEquals(expectation,result)





   }

}

