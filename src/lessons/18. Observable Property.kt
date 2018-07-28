package lessons

/**
 * The observable() function takes two arguments: initial value and a handler for modifications.
 * The handler gets called every time we assign to `name`, it has three parameters:
 * a property being assigned to, the old value and the new one. If you want to be able to veto
 * the assignment, use vetoable() instead of observable().
 */
import kotlin.properties.Delegates

class Counter {
    var count: Int by Delegates.observable(0) { _, old, new ->
        println("$old - $new")
    }
}

fun main(args: Array<String>) {
    val user = Counter()
    user.count++
    user.count++
}