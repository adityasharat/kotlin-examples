/**
 * Properties stored in a map. This comes up a lot in applications like parsing JSON
 * or doing other "dynamic" stuff. Delegates take values from this map (by the string keys -
 * names of properties). Of course, you can have var's as well,
 * that will modify the map upon assignment (note that you'd need MutableMap instead of read-only Map).
 */

class Product(map: Map<String, Any?>) {
    val name: String by map
    val price: Double by map
}

fun main(args: Array<String>) {
    val map: Map<String, Any?> = mapOf(
            "name" to "Butter",
            "price" to 25.0
    )
    val product = Product(map)

    println("Product[name=${product.name},age=${product.price}]")
}