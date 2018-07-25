/**
 * The composition function return a composition of two functions passed to it:
 * compose(f, g) = f(g(*)).
 * Now, you can apply it to callable references.
 */

fun length(s: String) = s.length

fun isEven(x: Int) = x % 2 == 0

fun <A, B, C> compose(f: (B) -> C, g: (A) -> B): (A) -> C {
    return { x -> f(g(x)) }
}

fun main(args: Array<String>) {
    val oddLength = compose(::isEven, ::length)
    val strings = listOf("a", "ab", "abc", "abcd")
    println(strings.filter(oddLength))
}

