package lessons

/**
 * There's some new syntax: you can say `val 'property name': 'Type' by 'expression'`.
 * The expression after by is the delegate, because get() and set() methods
 * corresponding to the property will be delegated to it.
 * Property delegates don't have to implement any interface, but they have
 * to provide methods named getValue() and setValue() to be called.</price>
 */

import kotlin.reflect.KProperty

class Book {
    var price: Double by Delegate()

    override fun toString() = "lessons.Book"
}

class Delegate {
    operator fun getValue(thisRef: Any?, prop: KProperty<*>): Double {
        println("$thisRef, thank you for delegating '${prop.name}'")
        return 0.0
    }

    operator fun setValue(thisRef: Any?, prop: KProperty<*>, value: Double) {
        println("$value has been assigned to ${prop.name} in $thisRef")
    }
}

fun main(args: Array<String>) {
    val book = Book()
    println(book.price)
    book.price = 145.65
}
