//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    fun Task_01() {
        println("Viktar Salauyou Lesson3 Homework")
        println("exercise 01 palindrome number")
        println("Input a number to the console to check if it a palindrome number or not")
        var number = readLine()!!.toInt()
        val original = number

        var reversed = 0
        while (number > 0) {
            val digit = number % 10       // take the last digit
            reversed = reversed * 10 + digit // build reversed number
            number /= 10                  // remove the last digit
        }

        if (original == reversed) {
            println("$original is a palindrome")
        } else {
            println("$original is not a palindrome")
        }
    }

    fun Task_02() {
        println("exercise_02 Prime number")
        println("Input a number to the console to check if it a Prime Number or not")
        var number = readLine()!!.toInt()

        if (number <= 1) {
            println("$number is not a prime number")
            return
        }
        var isPrime = true
        for (i in 2 until number) {   // range from 2 to number-1
            if (number % i == 0) {    // check if i divides number evenly
                isPrime = false
                break
            }
        }

        if (isPrime) {
            println("$number is a prime number")
        } else {
            println("$number is not a prime number")
        }

    }

    fun Task_03() {
        println("exercise_03 calculating a sum of digits in a number and repeating the process until result is a single digit number")
        println("Input a number to the console to begin the calculation process")

        var number = readLine()!!.toInt()

        while (number >= 10) {   // keep going until it's a single digit
            var sum = 0
            var temp = number


            // sum all digits
            while (temp > 0) {
                sum += temp % 10   // take last digit
                temp /= 10         // remove last digit
            }
            number = sum   // update number with the sum
        }

        println("Final single digit result: $number")
    }


    fun Task_04() {

        println("exercise_01 inverted Ladder")
        println("Input value for inverted ladder height")
        val number = readLine()!!.toInt()

        for (i in number downTo 1) {          // from height down to 1
            for (j in 1..i) {                 // print i times '#'
                print("#")
            }
            println()                         // move to next line
        }


    }


    Task_01()
    Task_02()
    Task_03()
    Task_04()

}
