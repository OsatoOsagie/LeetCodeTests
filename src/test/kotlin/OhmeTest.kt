import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertNotEquals
import org.junit.jupiter.api.Test

class OhmeTest {

    @Test
    fun getPoints() {
//        given
        val word = "GUARDIAN"

//        when
        val result: Int = Ohme().getWordPoints(word)

//        then
        val expectation = 10

        assertEquals(expectation, result)

    }

    @Test
    fun drawTiles() {
//        given
        val count = 7

//        when
        val result: List<Char> = Ohme().drawTiles(count)
        val resultTwo: List<Char> = Ohme().drawTiles(count)

//        then
        assertNotEquals(result, resultTwo)
    }

//    In the real game, tiles are taken at random from a 'bag' containing a fixed number of each tile.
//    Assign seven tiles to a rack using a bag containing the above distribution.

//    Distribution	Letter(s)
//    12 tiles	E
//    9 tiles	A, I
//    8 tiles	O
//    6 tiles	N, R, T
//    4 tiles	L, S, U, D
//    3 tiles	G
//    2 tiles	B, C, M, P, F, H, V, W, Y
//    1 tile	K, J, X, Q, Z

    @Test
    fun assignTiles() {
//        given
        val rack = mutableListOf<Char>()
        val listOfDistribution = ("e".flatMap { char -> List(12) { char } } +
                "ai".flatMap { char -> List(9) { char } } +
                "o".flatMap { char -> List(8) { char } } +
                "nrt".flatMap { char -> List(6) { char } } +
                "lsud".flatMap { char -> List(4) { char } } +
                "g".flatMap { char -> List(3) { char } } +
                "bcmpfhvwy".flatMap { char -> List(2) { char } } +
                "kjxqz".flatMap { char -> List(1) { char } }).shuffled().toMutableList()

        val actualSize = listOfDistribution.size

//        when
        val result: List<Char> = Ohme().assignTilesToRack( listOfDistribution)

        //smaller bag
        //

//        then
        val expectLighterBag = listOfDistribution.size

        assertEquals(actualSize-7, expectLighterBag)
    }

    @Test
    fun isRandomRack() {
//        given

        val listOfDistribution = ("e".flatMap { char -> List(12) { char } } +
                "ai".flatMap { char -> List(9) { char } } +
                "o".flatMap { char -> List(8) { char } } +
                "nrt".flatMap { char -> List(6) { char } } +
                "lsud".flatMap { char -> List(4) { char } } +
                "g".flatMap { char -> List(3) { char } } +
                "bcmpfhvwy".flatMap { char -> List(2) { char } } +
                "kjxqz".flatMap { char -> List(1) { char } }).toMutableList()


//        when
        val result: List<Char> = Ohme().assignTilesToRack(listOfDistribution)
        val resultTwo: List<Char> = Ohme().assignTilesToRack( listOfDistribution)

        //smaller bag
        //

//        then
        assertNotEquals(result,resultTwo)

    }


//    Find a valid word formed from the seven tiles. A list of valid words can be found in dictionary.txt

//    @Test
//    fun Q4(){
////        given
//
//        val rack = listOf( 'm','o','o','c','h','e', 'd').shuffled()
//
//
////        when
//        val result:String = Ohme().q4(rack)
//
////        then
//        val expectation = "mooched"
//
//        assertEquals(expectation,result)
//
//
//
//
//    }


}