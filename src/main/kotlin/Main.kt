/**
 * This is a documentation-style comment.
 * You can reference things here, like the [main] function.
 * You can reference parameters, like the [arguments].
 * String arguments passed through the run panel as [arguments].
 * */

fun main(arguments: Array<String>) {
    fun printHello(name:String, isVeteran:Boolean = false) {
        if (isVeteran) println("Hello $name. Thank you for your service.")
        else println("Hello $name.")
    }

    printHello("Doyun", true)
    printHello("Doyoung")

    fun createRange(start: Int, end: Int, isHalfOpen: Boolean = false): IntRange {
        return if (isHalfOpen) {
            start until end
        } else {
            start..end
        }
    }

    fun printRange(range: IntRange) {
        for (number in range) print("$number \t")
        println()
    }

    val halfOpenRange = createRange(5, 10, true)
    printRange(halfOpenRange)

}