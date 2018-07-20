/**
 * Here we have a class with a primary constructor and a member function.
 * Note that there's no `new` keyword used to create an object.
 * See http://kotlinlang.org/docs/reference/classes.html#classes
 */

class Greeter(private val name: String) {
    fun greet() {
        println("Hello, $name!")
    }
}

fun main(args: Array<String>) {
    val name = if (args.isEmpty()) "world" else args[0]
    Greeter(name).greet()
}