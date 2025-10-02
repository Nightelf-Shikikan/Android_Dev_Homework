import Node
import LinkedList

fun ReturnSum() {
    println("Task 01 input numbers and calculate their sum")

    println("Please enter numbers in line using spase as divider")
    val arrayofnumbers = readln()
        .split(" ")
        .map { it.toInt() }

    val result = arrayofnumbers.sum()
    println("Sum of all numbers is: $result")


}

fun PeopleList() {
    class Person(val name: String, val age: Int, val sex: String)

    val person01 = Person("Bob", 23, "male")
    val person02 = Person("Jack", 18, "male")
    val person03 = Person("Tom", 11, "male")
    val person04 = Person("Samantha", 33, "female")
    val person05 = Person("Lidia", 21, "female")
    val person06 = Person("Monica", 12, "female")


    val listOfPersons = listOf(
        person01, person02, person03, person04, person05, person06

    )
    val under18 = listOfPersons.filter { it.age < 18 }

    println("People under 18:")
    for (p in under18) {
        println("${p.name}, age ${p.age}")
    }
    val adults = listOfPersons.filter { it.age >= 18 }
    // 🔹 Sort them by age (ascending)
    val sortedAdults = adults.sortedBy { it.age }



    println("People 18 and older, sorted by age:")
    //   sortedAdults.let { list ->
    //      list.forEach { println("${it.name} is ${it.age} years old") }
    //  }
    sortedAdults.apply {
        forEach { println("${it.name} is ${it.age} years old") }
    }

}

fun CalculatingNumbers() {
    val numbers = List(size = 1000001, { it.toLong() })
    val filterNumbers = numbers.asSequence().filter { it % 2L == 0L }.map { it * it }.sum()

    println(filterNumbers)

}


fun main() {
    ReturnSum()
    PeopleList()
    CalculatingNumbers()
}



