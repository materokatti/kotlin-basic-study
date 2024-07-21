/**
 * This is a documentation-style comment.
 * You can reference things here, like the [main] function.
 * You can reference parameters, like the [arguments].
 * String arguments passed through the run panel as [arguments].
 * */

fun main(arguments: Array<String>) {
    /*
    val fullName = Pair<String, String>("Damini", "Ogulu")

    // destruction
    val(name, lastName) = fullName

     */
    val birthday = Triple(2, 7, 1991)
    val person = Pair("Damini, Ogulu", birthday)
    val nameUsingOrdering = person.first
    val birthdayUsingOrdering = person.second
    val (name, bday) = person
    val (dayOfBirth, birthMonth, yearOfBirth) = bday

    println("$name was born on $dayOfBirth/$birthMonth, year $yearOfBirth")

}