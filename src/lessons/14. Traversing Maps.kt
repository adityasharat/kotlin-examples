package lessons

/**
 *  Kotlin Standard Library provide component functions for Map.Entry
 */

fun main(args: Array<String>) {
    val map = hashMapOf<String, Int>()
    map["one"] = 1
    map["two"] = 2
    map["three"] = 3

    for ((key, value) in map) {
        println("key = $key, value = $value")
    }
}