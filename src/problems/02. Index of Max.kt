package problems

/*
 * Your task is to implement the indexOfMax() function so that it returns
 * the index of the largest element in the array, or null if the array is empty.
 */

fun indexOfMax(input: IntArray): Int? {
    return if (input.isEmpty()) null else input.indices.maxWith(Comparator { i1, i2 -> input[i1].compareTo(input[i2]) - 1 })
}
