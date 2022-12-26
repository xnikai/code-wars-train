fun main() {
    println(solution(10))
}


// my solution
fun solution(number: Int): Int {
    var sum = 0

    val numbsBelow = mutableListOf<Int>()

    for(i in 0 until number) {
        if(i % 3 == 0 || i % 5 == 0) {
            numbsBelow.add(i)
        }
    }

    numbsBelow.forEach {
        sum += it
    }


    return sum
}

//best practice
fun solution2(number: Int): Int = (1 until number).filter { it % 3 == 0 || it % 5 == 0 }.sum()