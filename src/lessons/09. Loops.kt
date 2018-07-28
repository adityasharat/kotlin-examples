package lessons

/**
 * `while` and `do..while` work as usual.
 * See http://kotlinlang.org/docs/reference/control-flow.html#while-loops
 */
fun main(arg: Array<String>) {
    var array: IntArray = intArrayOf(1, 2, 3, 4, 5)

    // While loop
    var i = 0
    while (i < array.size) {
        print(array[i++])
        print("  ")
    }

    println()
    array = intArrayOf(6, 7, 8, 9, 10)
    for (int in array) {
        print(int)
        print("  ")
    }


    println()
    array = intArrayOf(11, 12, 13, 14, 15)
    for (int in array.indices) {
        print(array[int])
        print(" ")
    }
}