/**
 * This is a documentation-style comment.
 * You can reference things here, like the [main] function.
 * You can reference parameters, like the [arguments].
 * String arguments passed through the run panel as [arguments].
 * */

fun main(arguments: Array<String>) {
    val password: String? = "12345"
    val passwordLength = password?.length ?: 0

    val message = if (passwordLength == 0) {
        "Ehm, you need a password to keep safe!"
    } else if (passwordLength in 1..5) {
        "Weak password! Try adding a few more symbols to it!"
    } else if (passwordLength in 6..10) {
        "Medium-strength password."
    } else if (passwordLength in 11..15) {
        "No one is getting through this!"
    } else {
        "Ironclad"
    }
}