import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class LeetCodeSolvedTest {


   @Test
   fun countInterestingSubarrays(){
//       given
       val nums = intArrayOf(3,1,9,6)
       val modulo =3
       val k=0

//       when
       val result:Long = LeetCodeSolved().countInterestingSubarrays(nums,modulo,k)

//       then
       val expectation = 2L

       assertEquals(expectation,result)


   }
}

