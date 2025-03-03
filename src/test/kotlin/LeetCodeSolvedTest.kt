import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class LeetCodeSolvedTest {

   @Test
   fun SmallestInfiniteSet(){
//       given
       var obj=LeetCodeSolved.SmallestInfiniteSet()

//       when
       obj.addback(2)
       assertEquals(1,obj.popSmallest())
       assertEquals(2,obj.popSmallest())
       assertEquals(3,obj.popSmallest())

       obj.addback(1)
       assertEquals(1,obj.popSmallest())
       assertEquals(4,obj.popSmallest())
       assertEquals(5,obj.popSmallest())

//       then
   }
}