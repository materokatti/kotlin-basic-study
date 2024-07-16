/**
 * This is a documentation-style comment.
 * You can reference things here, like the [main] function.
 * You can reference parameters, like the [arguments].
 * String arguments passed through the run panel as [arguments].
 * */

fun main(arguments: Array<String>) {
    val age = 23

    val message = when(age) {
        in 0..12 -> "Still a young human"
        in 13..19 -> "Teenager"
        in 20..29 -> "In your twenties"
        in 30..39 -> "In your thirties"
        in 40..49 -> "In your forties"
        else -> "You're a wise person :]"
    }

    println(message)

    val email = "mail@mail.com"
    val password = "iLoveKotlin!"


    when {
        email.isEmpty() -> println("You need to choose an email!")

        "@" !in email -> println("Your email is invalid :[")

        password.isEmpty() -> println("You need to choose a password!")

        password.length < 10 -> println("Password not strong enough :[")

        else -> println("Email length: ${email.length}, " +
                "Password length: ${password.length}")
    }
}