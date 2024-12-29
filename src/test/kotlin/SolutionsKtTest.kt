
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SolutionsKtTest {



    @Test
    fun middleNode(){
//        given
        var node1=ListNode(1)
        var node2=ListNode(2)
        var node3=ListNode(3)
        var node4=ListNode(4)
        var node5=ListNode(5)


        node1.next = node2
        node2.next = node3
        node3.next = node4
        node4.next = node5

        var head=node1;



//        when
        val result= LinkedLists().reverseBetween(head,2,4)


//        then
        val expectation=head.value

        assertEquals(expectation,1)
    }


    @Test
    fun reverseWrods(){
//        given
        val input =  "Let's take LeetCode contest"

        //when
        val result=Arrays().reverseWords(input)

//        then
        val expected =  "s'teL ekat edoCteeL tsetnoc"

        assertEquals(expected,result)
    }





}