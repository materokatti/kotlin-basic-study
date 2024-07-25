/**
 * This is a documentation-style comment.
 * You can reference things here, like the [main] function.
 * You can reference parameters, like the [arguments].
 * String arguments passed through the run panel as [arguments].
 * */

fun main(arguments: Array<String>) {
    var userIds = setOf("ID1B", "ID2C")
    println(userIds)
    println(userIds.contains("ID1B"))
    println("ID2C" in userIds)

    val mutableIds = userIds.toMutableSet()

    println(mutableIds.add("ID0Z"))
    println(mutableIds)

    println(mutableIds.add("ID1B"))
    println(mutableIds)

    println(mutableIds.remove("ID1B"))

    for (userId in userIds) {
        println(userId)
    }

    val names = arrayOf("Doyun", "Doyoung", "Taihong")
    println(names)
    val uniqueNames = names.toSet()
    println(uniqueNames)
}