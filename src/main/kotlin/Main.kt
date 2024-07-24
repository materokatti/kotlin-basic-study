/**
 * This is a documentation-style comment.
 * You can reference things here, like the [main] function.
 * You can reference parameters, like the [arguments].
 * String arguments passed through the run panel as [arguments].
 * */

fun main(arguments: Array<String>) {
    // Create a mutable map to store pet names and their types
    val pets = mutableMapOf<String, String>()

    // Adding some pet names and their types
    pets["Max"] = "German Shepard Dog"
    pets["Whiskers"] = "Tabby Cat"
    pets["Nemo"] = "Clownfish"

    // Remove a pet from the map
    pets.remove("Whiskers")

    // Iterate over the map and print the entries
    for ((name, type) in pets) {
        println("Pet name: $name, Type: $type")
    }
}