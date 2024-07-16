/**
 * This is a documentation-style comment.
 * You can reference things here, like the [main] function.
 * You can reference parameters, like the [arguments].
 * String arguments passed through the run panel as [arguments].
 * */

fun main(arguments: Array<String>) {
    val rangeFromZeroToTen = 0 .. 10
    println(rangeFromZeroToTen)

    val exclusiveRange = 0 until 10
    println(exclusiveRange)

    for (index in rangeFromZeroToTen step 2) {
        print(index)
    }

    println("")

    for (index in 10 downTo  0) {
        print(index)
    }

    println("")
}