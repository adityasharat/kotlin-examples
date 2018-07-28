package lessons

/**
 * The `is` operator checks if an expression is an instance of a type and more.
 * If we is-checked an immutable local variable or property, there's no need
 * to cast it explicitly to the is-checked type.
 * See this pages for details:
 * http://kotlinlang.org/docs/reference/classes.html#classes-and-inheritance
 * http://kotlinlang.org/docs/reference/typecasts.html#smart-casts
 */
fun main(args: Array<String>) {
    println(getStringLength("aaa"))
    try {
        println(getStringLength(1))
    } catch (e: Exception) {
        e.printStackTrace()
    }
}

@Throws(IllegalArgumentException::class)
fun getStringLength(obj: Any): Int? {
    if (obj is String) {
        return obj.length // no cast to String is needed
    }
    throw IllegalArgumentException("$obj is not a String")
}