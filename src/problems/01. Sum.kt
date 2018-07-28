package problems

fun sum(input: IntArray): Int {
    return if (input.isEmpty()) 0 else input.reduce { sum, x -> sum + x }
}