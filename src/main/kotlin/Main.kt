/**
 * This is a documentation-style comment.
 * You can reference things here, like the [main] function.
 * You can reference parameters, like the [arguments].
 * String arguments passed through the run panel as [arguments].
 * */

fun main(arguments: Array<String>) {
    val countries = listOf("Benin", "Burkina Faso", "Cape Verde")
    val mutableList = countries.toMutableList()

    // add : O(1)
    mutableList.add("Nigeria")
    // add : O(n)
    mutableList.add(1, "Ghana")

    println(countries)
    println(mutableList)

    // remove : O(n)
    mutableList.remove("Ghana")

    println(mutableList)

}