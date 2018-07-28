package lessons

/**
 *  Data class gets component functions, one for each property declared
 *  in the primary constructor, generated automatically, same for all the
 *  other goodies common for data: toString(), equals(), hashCode() and copy().
 *  See http://kotlinlang.org/docs/reference/data-classes.html#data-classes
 */

data class User(val name: String, val id: Int)

var id = 0  // static variable

fun createUser(name: String): User {
    return User(name, ++id)
}

fun main(args: Array<String>) {
    val user = createUser("Alex")
    println("name = ${user.name}, lessons.getId = ${user.id}")

    // or

    val (name, id) = createUser("Dave")
    println("name = $name, lessons.getId = $id")

    // or

    val harry = createUser("Harry")
    println("name = ${harry.component1()}, lessons.getId = ${harry.component2()}")
}
