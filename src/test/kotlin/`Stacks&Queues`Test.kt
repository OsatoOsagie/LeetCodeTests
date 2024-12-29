import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class StacksAndQueues{
    @Test
    fun simplifyPath(){
//        given
        val input ="/.../a/../b/c/../d/./"

        //when
        val result= `Stacks&Queues`().simplifyPath(input)
//then
        val expected= "/.../b/d"
      assertEquals(expected,result)

    }

    @Test
    fun makeGood(){
//        given
        val s= "Pp"
        val stack = mutableListOf<String>()

//        when
        val result=`Stacks&Queues`().makeGood(s)

//        then
        val expect=""

        assertEquals(expect,result)
    }


    @Test
    fun nextTest(){
//        given
        val size =3;
        val `val`=10

//            when
        val movingAvg=MovingAverage(size)

        movingAvg.next(1)
//        movingAvg.next(10)
//        movingAvg.next(3)

//        then
        val expected =5.5
        assertEquals(expected, movingAvg.next(10))

    }
}