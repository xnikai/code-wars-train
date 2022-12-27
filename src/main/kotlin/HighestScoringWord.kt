fun main() {
    println(high("rtijwfpzbgmlcse tzwqdnwdrolz"))
}

// my solution
fun high(str: String): String {
    val wordsList =  str.split(" ")

    val lettersScore = mutableMapOf<String, Int>()
    val alphabet = "A B C D E F G H I J K L M N O P Q R S T U V W X Y Z".lowercase().split(" ")

    alphabet.forEachIndexed { i, word ->
        lettersScore[word] = i + 1
    }

    var highestScoreMap = mutableMapOf<Int, String>()
    var highestKey = 0

    wordsList.forEach { word ->
        var middleScore = 0
        word.forEach { letter ->
            if(alphabet.contains(letter.toString())) {
                middleScore += lettersScore[letter.toString()]!!
            }
        }
        if(middleScore > highestKey) {
            highestKey = middleScore
        }
        if(!highestScoreMap.contains(middleScore)){
            highestScoreMap[middleScore] = word
        }
    }


    return highestScoreMap[highestKey]!!
}

// best practice
fun high2(str: String): String {
    return str.split(' ').maxBy{ it.sumOf { it - 'a' + 1 } }
}