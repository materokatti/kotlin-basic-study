/**
 * This is a documentation-style comment.
 * You can reference things here, like the [main] function.
 * You can reference parameters, like the [arguments].
 * String arguments passed through the run panel as [arguments].
 * */

fun main(arguments: Array<String>) {
    var age: Int = 32
    val name: String = "Maria"
    val lastname: String = "Carranza"
    val weight: Double = 65.1
    println(name)
    println("$name is a musician")
    println(age)
    age += 1
    println(age)

    val fullName = "$lastname, $name"
    println(fullName)

    val ageAsString = age.toString()
    println(ageAsString)

    val ageFromString = "35".toInt()
    println(ageFromString)

    val nameLength = fullName.length
    println(nameLength)

    // This is a line comment.

    /*
        This is a multiline comment.
     */
}