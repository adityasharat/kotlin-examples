package lessons

/**
 * "Callable References" or "Feature Literals", i.e. an ability to pass
 * named functions or properties as values. Users often ask
 * "I have a foo() function, how do I pass it as an argument?".
 * The answer is: "you prefix it with a `::`".
 */

fun isOdd(x: Int) = x % 2 != 0

fun main(args: Array<String>) {
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    println(numbers.filter(::isOdd))
}
