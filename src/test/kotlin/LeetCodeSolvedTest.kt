import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class LeetCodeSolvedTest {

   @Test
   fun halveArray(){
//       given
       val nums= intArrayOf(32,98,23,14,67,40,26,9,96,96,91,76,4,40,42,2,31,13,16,37,62,2,27,25,100,94,14,3,48,56,64,59,33,10,74,47,73,72,89,69,15,79,22,18,53,62,20,9,76,64)

//       when
       val result:Int = LeetCodeSolved().halveArray(nums)

//       then
       val expectation= 36

       assertEquals(expectation,result)
   }
}