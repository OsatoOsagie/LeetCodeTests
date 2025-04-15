import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class LeetCodeSolvedTest {

   @Test
   fun countGoodTriplets(){
//       given
     val arr = intArrayOf(1,1,2,2,3)
       val a= 0
       val b = 0
       val c = 1

//       when
       val result:Int = LeetCodeSolved().countGoodTriplets(arr,a,b,c)

       val expectation= 0


       assertEquals(expectation,result)


//       then



   }

}

