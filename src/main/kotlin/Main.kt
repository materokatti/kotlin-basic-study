/**
 * This is a documentation-style comment.
 * You can reference things here, like the [main] function.
 * You can reference parameters, like the [arguments].
 * String arguments passed through the run panel as [arguments].
 * */

fun main(arguments: Array<String>) {
    val countries = arrayOf(
        "China",
        "Japan",
        "South Korea",
        "India",
        "Indonesia",
        "Thailand",
        "Vietnam",
        "Philippines",
        "Malaysia",
        "Singapore",
        "Pakistan",
        "Bangladesh",
        "Sri Lanka",
        "Nepal",
        "Saudi Arabia",
        "United Arab Emirates"
    )
    println(countries)
    println(countries.size)
    println(countries[3])

    println(countries.get(3))

//    println(countries[20])
//    println(countries[-1])

    val updatedArray = countries + "Mauritius"
    println(countries.size)

    val sizedArray = Array(10){""}
    val emptyArray = emptyArray<String>()

    val arrayOfInts = intArrayOf(2,3,4,5,6,7)
    println(arrayOfInts)

    val intArray = IntArray(10)
    println(intArray)

    println(countries.lastIndex)
    println(countries.first())
    println(countries.last())
}