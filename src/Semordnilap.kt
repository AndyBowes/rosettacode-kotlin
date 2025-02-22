import java.io.File

fun semordnilap() {
    val words = File("unixdict.txt").readLines().toSet()
    val pairs = words.asSequence().map { it to it.reversed() } // Pair(word, reversed word)
            .filter { it.first < it.second && it.second in words }.toList() // avoid dupes+palindromes, find matches
    println("Found ${pairs.size} semordnilap pairs")
    println(pairs.take(5))
}