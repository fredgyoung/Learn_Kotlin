fun main() {

    // Create immutable list. Specify type.
    val myList: List<Int> = listOf(1, 2, 3, 4)

    // Print entire list
    println(myList)

    // Print size of list
    println("List has ${myList.size} elements")

    myList.forEach { print("$it - ") }
    println()

}