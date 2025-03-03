import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class LeetCodeSolvedTest {

    @Test
    fun SeatManager(){
//        given
        val n= 5
        var obj = LeetCodeSolved.SeatManager(n)

//        when
        val reserveOne:Int= obj.reserve()
        val reserveTwo:Int= obj.reserve()



        assertEquals(1,reserveOne)
        assertEquals(2,reserveTwo)
        obj.unReserve(2)
        assertEquals(2,obj.reserve())
        assertEquals(3,obj.reserve())
        assertEquals(4,obj.reserve())
        assertEquals(5,obj.reserve())
        obj.unReserve(5)




//        then
    }
}