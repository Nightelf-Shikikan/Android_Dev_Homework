package Characters
import kotlin.random.Random
import GameCharacter


class Warrior(name: String) : GameCharacter(
    name = name,
    armor = 100,
    attack =15,
    health = 120,
) {
    override fun attack(target: GameCharacter) {
        // Random damage between 1 and 20
        val randomDamage = Random.nextInt(1, 21)
        // Add class-specific bonus (the attack property of this class)
        val totalDamage = randomDamage + attack

        println("$name slashes at ${target.name} with a sword for $totalDamage damage!")
        target.takeDamage(totalDamage)
    }
}