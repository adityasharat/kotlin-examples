package lessons

/**
 * Data class gets next functions, generated automatically:
 * component functions, toString(), equals(), hashCode() and copy().
 * See http://kotlinlang.org/docs/reference/data-classes.html#data-classes
 */

data class Contact(val name: String, val number: String)

fun main(args: Array<String>) {
    val contact = Contact("Vanessa", "555-12345")
    println(contact)

    val secondContact = Contact("Alex", "555-4321")
    val thirdContact = Contact("Max", "555-6789")

    println("contact == secondContact: ${contact == secondContact}")
    println("contact == thirdContact: ${contact == thirdContact}")

    // copy() function
    println(contact.copy())
    println(contact.copy(name = "John"))
    println(contact.copy(number = "555-9876"))
    println(contact.copy(name = "Jane", number = "555-9635"))
}
