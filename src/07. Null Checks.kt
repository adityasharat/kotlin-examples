import org.jetbrains.annotations.Nullable

/**
 * A reference must be explicitly marked as nullable to be able hold a null.
 * See http://kotlinlang.org/docs/reference/null-safety.html#null-safety
 */

// Return null if str does not hold a number
@Nullable
fun parseInt(str: String): Int? {
    try {
        return str.toInt()
    } catch (e: NumberFormatException) {
        println("'$str' is not an integer!")
    }
    return null
}

fun main(args: Array<String>) {
    if (args.size < 2) {
        println("No number supplied")
    } else {
        val x = parseInt(args[0])
        val y = parseInt(args[1])

        // We cannot say 'x * y' now because they may hold nulls
        if (x != null && y != null) {
            print(x * y) // Now we can
        }
    }
}