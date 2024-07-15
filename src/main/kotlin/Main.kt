/**
 * This is a documentation-style comment.
 * You can reference things here, like the [main] function.
 * You can reference parameters, like the [arguments].
 * String arguments passed through the run panel as [arguments].
 * */

fun main(arguments: Array<String>) {
    val chrisGrade = 49
    val samGrade = 99
    val meritAwardGrade = 90
    var message: String


    val chrisHasPerfectAttendance = true
    val isChrisMeritStudent = chrisHasPerfectAttendance && chrisGrade > meritAwardGrade
    println(isChrisMeritStudent)

    message = if (isChrisMeritStudent) {
        "Cngratulations"
    } else {
        "Keep studying"
    }
    println(message)

    val betterStudent = if (samGrade > chrisGrade) {
        "Sam"
    } else if (samGrade < chrisGrade) {
        "Chris"
    } else {
        "They have equal grades!!!"
    }
    println(betterStudent)
}