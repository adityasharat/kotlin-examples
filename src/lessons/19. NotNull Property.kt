package lessons

/**
 * Users frequently ask what to do when you have a non-null var, but you don't have an
 * appropriate value to assign to it in constructor (i.e. it must be assigned later)?
 * You can't have an uninitialized non-abstract property in Kotlin. You could initialize it
 * with null, but then you'd have to check every time you access it. Now you have a delegate
 * to handle this. If you read from this property before writing to it, it throws an exception,
 * after the first assignment it works as expected.
 */

import kotlin.properties.Delegates

class Timer {
    private var start: Long by Delegates.notNull()

    fun start() {
        this.start = System.currentTimeMillis()
    }

    fun stop(): Long = System.currentTimeMillis() - start
}

fun main(args: Array<String>) {
    val timer = Timer()
    //timer.stop() -> IllegalStateException
    timer.start()
    Thread.sleep(5_000)
    println(timer.stop())
}
