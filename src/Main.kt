fun main() {
    fun Task_01() {
        println("Viktar Salauyou Lesson4 Homework")
        println("exercise 01 finding min and max numbers in array of numbers and their indexes")
        println("The array of numbers is 3 36 89 56 2 44 10 8 13 97")
        val numbers = intArrayOf(3, 36, 89, 56, 2, 44, 10, 8, 13, 97)

        var minValue = numbers[0]
        var maxValue = numbers[0]
        var minIndex = 0
        var maxIndex = 0

        for (i in numbers.indices) {
            if (numbers[i] < minValue) {
                minValue = numbers[i]
                minIndex = i
            }
            if (numbers[i] > maxValue) {
                maxValue = numbers[i]
                maxIndex = i
            }
        }

        // Print results
        println("Minimum value: $minValue at index $minIndex")
        println("Maximum value: $maxValue at index $maxIndex")

    }


    fun Task_02() {
        println("exercise_02 odd and even numbers")
        println("calculating odd and even numbers")

        val numbers = intArrayOf(3, 36, 89, 56, 2, 44, 10, 8, 13, 97)

        var odd = 0
        var even = 0

        for (num in numbers) {
            if (num % 2 == 0) {
                println("$num is even")
                even += 1
            } else {
                println("$num is odd")
                odd += 1
            }
        }


        println("Odd numbers: $odd even numbers $even")

    }

    fun Task_03() {

        println("exercise_03 Reverse number in the Array")
        println("Please input the number to decide the array size ")

        val size = readln().toInt()  // user enters array size

        val numbers = IntArray(size)

        println("Enter $size numbers:")

        for (i in 0 until size) {
            numbers[i] = readln().toInt()
        }
        println("Original array: ${numbers.joinToString(", ")}")

        // Reverse array
        val reversed = numbers.reversedArray()

        println("Reversed array: ${reversed.joinToString(", ")}")


    }


    fun Task_04() {
        println("exercise_04 Checking if Array of number is a palindrom or not")
        println("Please input the number to decide the array size ")

        val size = readln().toInt()

        val numbers = IntArray(size)

        println("Enter $size numbers:")

        for (i in 0 until size) {
            numbers[i] = readln().toInt()
        }
        println("Original array: ${numbers.joinToString(", ")}")

        // Reverse array
        val reversed = numbers.reversedArray()

        println("Reversed array: ${reversed.joinToString(", ")}")

        if (numbers.contentEquals(reversed)) {
            println("Array: ${numbers.joinToString(", ")} is a palindrome")
        } else {
            println("Array: ${numbers.joinToString(", ")} is not a palindrome")
        }


    }


    Task_01()
    Task_02()
    Task_03()
    Task_04()

}





