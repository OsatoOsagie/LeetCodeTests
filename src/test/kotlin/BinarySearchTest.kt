import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class BinarySearchTest{

    @Test
    fun searchInsert(){
//        given
        val nums = intArrayOf(1,3,5,6)
        val target = 7

//        when
        val res= BinarySearch().searchInsert(nums,target)

//        then
        val exp=4

        assertEquals(exp,res)
    }

    @Test
    fun answerQueries(){
//        given
        val nums = intArrayOf(2,3,4,5)
        val queries= intArrayOf(1)

//        when
        val res= BinarySearch().answerQueries(nums,queries)

//        then
        val exp= intArrayOf(0)

        assertArrayEquals(exp,res)

    }

    @Test
    fun minEatingSpeed(){
        //given
        val piles= intArrayOf(3,6,7,11)

        val h=8

        //when
        val exp=BinarySearch().minEatingSpeed(piles,h)
        val res=4

        //then
        assertEquals(exp,res)

    }

//    @Test
//    fun singleSearch(){
////        given
//        val inp="cha"
//        //when
//        val res= BinarySearch().singleSearch(inp)
//
////        then
//
//        val banks = listOf("CHASE", "CHASE NATIONAL BANK", "CHASER")
//
//        assertEquals(banks,res)
//
//
//
//    }


}