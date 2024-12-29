
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ArraysTest {

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

    @Test
    fun reverseOnlyLetters(){
//        given
        val s= "Test1ng-Leet=code-Q!"

//        when
        val result = Arrays().reverseOnlyLetters(s)

//        then
        val expected = "Qedo1ct-eeLg=ntse-T!"

        assertEquals(expected,result)
    }

    @Test
    fun getCommon(){
//        given
        val nums1= arrayOf(1,2,3,6)
        val nums2= arrayOf(2,3,4,5)


//        when
        val result = Arrays().getCommonTowPointer(nums1,nums2)

//        then
        val expectation= 2

        assertEquals(expectation,result)
    }

    @Test
    fun reverPrefix(){

//        given

        val word = "abcdefd"

        val ch= 'd'

//        when

        val exp=Arrays().reversePrefix(word, ch)

        val result="dcbaefd"

        assertEquals(exp,result)
    }








}