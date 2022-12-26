fun main() {
    val a2 = arrayOf<String>("lively", "alive", "harp", "sharp", "armstrong")
    println(inArray(arrayOf<String>("live", "arp", "strong"), a2).toList())
}

// my solution
fun inArray(array1: Array<String>, array2: Array<String>): Array<String> {
    val contains = mutableListOf<String>()

    array1.forEach {a1 ->
        array2.forEach {a2 ->
            if(a2.contains(a1)) {
                contains.add(a1)
            }
        }
    }
    return contains.distinct().sorted().toTypedArray()
}
//best practice
fun inArray2(array1: Array<String>, array2: Array<String>): Array<String> {
    return array1.filter { e ->
        array2.any{
            it.contains(e)
        }
    }.distinct().sorted().toTypedArray()
}