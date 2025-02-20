import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class LeetCodeSolvedTest{

   @Test
   fun distributeCandies(){
//       given
       val candies=10
       val num_people= 3

//       when
       val result:IntArray = LeetCodeSolved().distributeCandies(candies,num_people)

//       then
       val expectation= intArrayOf(5,2,3)

       assertArrayEquals(expectation,result)

   }
}