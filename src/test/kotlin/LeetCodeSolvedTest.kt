import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class LeetCodeSolvedTest {


    @Test
    fun numOfSubarrays() {
//       given
        val arr= intArrayOf(11,13,17,23,29,31,7,5,2,3)
        val k =3
        val threshold=5

//        when
        val result:Int = LeetCodeSolved().numOfSubarrays(arr,k,threshold)

//        then
        val expectation = 6

        assertEquals(expectation,result)


    }


}

