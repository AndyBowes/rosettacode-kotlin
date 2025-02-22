
import java.io.File

fun main(args: Array<String>) {
    val file = File("unixdict.txt")
    val result = mutableListOf<String>()

    file.forEachLine {
        if (it.toCharArray().sorted().joinToString(separator = "") == it) {
            result += it
        }
    }

    result.sortByDescending { it.length }
    val max = result[0].length

    for (word in result) {
        if (word.length == max) {
            println(word)
        }
    }
}
