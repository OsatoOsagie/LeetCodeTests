import com.sun.source.tree.Tree
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class LeetCodeSolvedTest {


@Test
fun maximumCount(){
//    given
    val nums = intArrayOf(-2,-1,-1,1,2,3)

//    when
    val result:Int = LeetCodeSolved().maximumCount(nums)
//    then
    val expectation=3

    assertEquals(expectation,result)
}

}

