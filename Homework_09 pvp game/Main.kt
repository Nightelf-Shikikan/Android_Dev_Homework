import Characters.Ranger
import Characters.Rogue
import Characters.Warrior

val logo = """
    ░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░
    ░░░░████░█████░░█████░██░░░██░████░░░░
    ░░░██░██░██░░██░██░░░░███░░██░██░██░░░
    ░░██░░██░██░░██░█████░██░█░██░██░░██░░
    ░░██████░████░░░██░░░░██░░███░██████░░
    ░██░░░██░██░░██░█████░██░░███░██░░░██░
    ░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░
""".trimIndent()

fun battle(player1: GameCharacter, player2: GameCharacter) {
    println("${player1.name} and ${player2.name} enter the Arena for a Death Battle")

    var attacker = player1
    var defender = player2
    // loop until one player is dead
    while (attacker.health > 0 && defender.health > 0) {
        println("\n${attacker.name}'s turn!")
        attacker.attack(defender)

        // check if defender died
        if (defender.health <= 0) {
            println("${defender.name} has been defeated! Mighty ${attacker.name} wins the battle!")
            break
        }

        // swap attacker and defender for next round
        val temp = attacker
        attacker = defender
        defender = temp
    }


}

fun main() {


    fun welcomeScreen(): GameCharacter {
        println(logo)
        println("=====================================")
        println("        WELCOME TO THE ARENA!        ")
        println("=====================================")
        println("To enter the Arena, Player One must enter his or her name")
        print("Player One name is: ")
        val playerOneName = readln()

        println(
            """
            Which class $playerOneName will be playing? 
                    1. Warrior 
                    2. Rogue 
                    3. Ranger
                      """.trimIndent()
        )
        val choice = readln().toIntOrNull() ?: 1

        val player: GameCharacter = when (choice) {
            1 -> Warrior(playerOneName)
            2 -> Rogue(playerOneName)
            3 -> Ranger(playerOneName)
            else -> Warrior(playerOneName)

        }
        println("Player One is a ${player::class.simpleName} named ${player.name}!")
        println("Stats -> Health: ${player.health}, Armor: ${player.armor}, Attack Bonus: ${player.attack}")

        return player // return the object

    }

    fun welcomeScreen2(): GameCharacter {

        println("To enter the Arena, Player Two must enter his or her name")
        print("Player Two name is: ")
        val playerTwoName = readln()

        println(
            """
            Which class $playerTwoName will be playing? 
                    1. Warrior 
                    2. Rogue 
                    3. Ranger
                      """.trimIndent()
        )
        val choice = readln().toIntOrNull() ?: 1

        val player: GameCharacter = when (choice) {
            1 -> Warrior(playerTwoName)
            2 -> Rogue(playerTwoName)
            3 -> Ranger(playerTwoName)
            else -> Warrior(playerTwoName)

        }
        println("Player Two is a ${player::class.simpleName} named ${player.name}!")
        println("Stats -> Health: ${player.health}, Armor: ${player.armor}, Attack Bonus: ${player.attack}")

        return player // return the object


    }

    // create both players and store the objects
    val player1 = welcomeScreen()
    val player2 = welcomeScreen2()

    println("${player1.name} and ${player2.name} are ready to battle!")

    battle(player1, player2)

}

