/**
 * This is a documentation-style comment.
 * You can reference things here, like the [main] function.
 * You can reference parameters, like the [arguments].
 * String arguments passed through the run panel as [arguments].
 * */

fun main(arguments: Array<String>) {

    row@ for (row in 0 .. 5) {
        column@ for (column in 0 .. 5) {
            if(column == 2 && row  ==2) {
                break@row
            }
            print("x\t")
        }
        println()
    }
}