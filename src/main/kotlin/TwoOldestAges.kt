fun main() {
    println(twoOldestAges(listOf(1, 5, 87, 45, 8, 8)))
}

// my solution
fun twoOldestAges(ages: List<Int>): List<Int> {
    val sort = ages.sortedDescending()
    return listOf(sort[1], sort[0])
}

// best practice

fun twoOldestAges2(ages: List<Int>) = ages.sorted().takeLast(2)