import com.sun.source.tree.Tree
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class LeetCodeSolvedTest {


    @Test
    fun maxDepth() {

//        given
                val node1= LeetCodeSolved.TreeNode(9)
        val node2= LeetCodeSolved.TreeNode(15)
        val node3= LeetCodeSolved.TreeNode(7)
        val node4= LeetCodeSolved.TreeNode(20,node2,node3)
        val root= LeetCodeSolved.TreeNode(3,node1,node4)

//        when
        val result:Int = LeetCodeSolved.maxDepth(root)

//        then
        val expectation =3
        assertEquals(expectation,result)

    }


}