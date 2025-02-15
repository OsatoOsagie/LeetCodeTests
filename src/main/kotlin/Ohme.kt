import java.io.File
import java.io.InputStream

//1.Calculate the score for a word. The score is the sum of the points for the letters that make up a word. For example: GUARDIAN = 2 + 1 + 1 + 1 + 2 + 1 + 1 + 1 = 10.
//2.Assign seven tiles chosen randomly from the English alphabet to a player's rack.


//Point(s)	Letter(s)
//1	E, A, I, O, N, R, T, L, S, U
//2	D, G
//3	B, C, M, P
//4	F, H, V, W, Y
//5	K
//8	J, X
//10	Q, Z


class Ohme {
    val wordMap = mapOf(
        "EAIONRTLSU" to 1,
        "DG" to 2,
        "BCMP" to 3,
        "FHVWY" to 4,
        "K" to 5,
        "JX" to 8,
        "QZ" to 10
    ).flatMap { (letters, score) ->
        letters.map { it to score }
    }.toMap()


    fun getWordPoints(word: String): Int {

        return word.sumOf { wordMap[it] ?: 0 }

    }

    fun drawTiles(count: Int): List<Char> {
        val tilesDrawn = mutableListOf<Char>()

        repeat(count) {
            val char = 'A'..'Z'

            tilesDrawn.add(char.random())

        }

        return tilesDrawn

    }

    fun assignTilesToRack( listOfDistribution : MutableList<Char> ) : List<Char>{

        val rack= mutableListOf<Char>()

        repeat(7){
            rack.add(listOfDistribution.last())
            listOfDistribution.removeLast()
        }

        return rack

    }

    fun loadFile(){
        val inputStream = this::class.java.getResourceAsStream("/dictionary.txt")
        val lineList = mutableListOf<String>()

        inputStream.bufferedReader().forEachLine { lineList.add(it) }
        lineList.forEach{println(">  " + it)}
    }

    //    Distribution	Letter(s)
//    12 tiles	E
//    9 tiles	A, I
//    8 tiles	O
//    6 tiles	N, R, T
//    4 tiles	L, S, U, D
//    3 tiles	G
//    2 tiles	B, C, M, P, F, H, V, W, Y
//    1 tile	K, J, X, Q, Z


}