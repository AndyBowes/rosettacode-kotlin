import java.util.Comparator

val SORTER = Comparator<Int> { x, y ->
    val xy = (x.toString() + y).toInt()
    val yx = (y.toString() + x).toInt()
    xy.compareTo(yx)
}

fun maxCat() {
    fun findLargestSequence(array: IntArray): String {
        return array.sortedWith(SORTER).reversed().map { it.toString() }.joinToString("")
    }
    val source1 = intArrayOf(1, 34, 3, 98, 9, 76, 45, 4)
    println(findLargestSequence(source1))

    val source2 = intArrayOf(54, 546, 548, 60)
    println(findLargestSequence(source2))
}