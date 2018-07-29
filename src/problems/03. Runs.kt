package problems

fun runs(input: IntArray): Int {
    if (input.isEmpty()) {
        return 0
    } else {
        var runs = 1
        for (index in 0 until input.size - 1) {
            println(index)
            if (input[index] != input[index + 1]) {
                runs += 1
            }
        }
        return runs
    }
}