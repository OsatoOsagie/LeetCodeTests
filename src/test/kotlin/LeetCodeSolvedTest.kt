import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class LeetCodeSolvedTest {

    @Test
   fun KthLargest(){
//       given

       val k=3
        val nums= intArrayOf(4, 5, 8, 2)
       var obj= LeetCodeSolved.KthLargest(k,nums)




//       when
         obj.add(3)
         obj.add(5)
         obj.add(10)
         obj.add(9)
        val result:Int= obj.add(4)

   //       then
       val expectation = 8

       assertEquals(expectation,result)

   }
}