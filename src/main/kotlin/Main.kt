/**
 * This is a documentation-style comment.
 * You can reference things here, like the [main] function.
 * You can reference parameters, like the [arguments].
 * String arguments passed through the run panel as [arguments].
 * */

fun main(arguments: Array<String>) {
    val myName = "Emmanuel"
    val nickname : String? = null
//    val lastName : String = null
    val nicknameLength = nickname!!.length

    val myNickname = nickname ?: myName
    println(myNickname)

    if (nickname?.isEmpty() == true) {
        println("You don't have a nickname! It's length is: ${nickname.length}")
    }
}