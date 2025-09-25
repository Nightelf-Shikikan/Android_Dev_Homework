package Characters

import GameCharacter
import kotlin.random.Random


class Rogue(name: String) : GameCharacter(
    name = name,
    armor = 100,
    attack = 20,
    health = 60,
) {
    override fun attack(target: GameCharacter) {
        // Random damage between 4 and 12
        val randomDamage = Random.nextInt(5, 13)
        // Add class-specific bonus (the attack property of this class)
        val totalDamage = randomDamage + attack

        println("$name stabs ${target.name} with a dagger for $totalDamage damage!")
        target.takeDamage(totalDamage)
    }
}
