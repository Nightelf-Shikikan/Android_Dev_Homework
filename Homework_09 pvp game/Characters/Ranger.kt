package Characters

import GameCharacter
import kotlin.random.Random


class Ranger(name: String) : GameCharacter(
    name = name,
    armor = 100,
    attack = 25,
    health = 80,
) {
    override fun attack(target: GameCharacter) {
        // Random damage between 6 and 16
        val randomDamage = Random.nextInt(7, 17)
        // Add class-specific bonus (the attack property of this class)
        val totalDamage = randomDamage + attack

        println("$name shoot ${target.name} with an arrow for $totalDamage damage!")
        target.takeDamage(totalDamage)
    }
}