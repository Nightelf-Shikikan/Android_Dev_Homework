open class GameCharacter(
    val name: String,
    var armor: Int,
    val attack: Int,
    var health: Int,
    var isDead: Boolean = false
) {
    open fun attack(target: GameCharacter) {



    }



    fun takeDamage(damage: Int) {
        var remainingDamage = damage

        if (armor == 0) {

            println("$name have no armor. And recieve full $damage of damage")
        } else if (armor in 1..24) {
            val absorbed = (damage * 25) / 100
            armor -= 20
            remainingDamage -= absorbed
            println("$name's broken armor absorbs $absorbed damage. $name's armor almost completely broken")
        } else if (armor in 25..49) {
            val absorbed = (damage * 35) / 100
            armor -= 16
            remainingDamage -= absorbed
            println("$name's poor armor absorbs $absorbed damage. $name's armor doesen't look very good")

        } else if (armor in 50..74) {
            val absorbed = (damage * 45) / 100
            armor -= 14
            remainingDamage -= absorbed
            println("$name's armor absorbs $absorbed damage. $name's armor is still holding")

        } else if (armor in 75..100) {
            val absorbed = (damage * 55) / 100
            armor -= 10
            remainingDamage -= absorbed
            println("$name's armor absorbs $absorbed damage. $name's armor look's almost as new")

        }
        // Prevent negative armor
        if (armor < 0) armor = 0

        // Apply remaining damage to health
        if (remainingDamage > 0) {
            health -= remainingDamage
            if (health < 0) health = 0
            println("$name takes $remainingDamage damage. Remaining health: $health")
        }
        // Automatically check death
        if (health <= 0 && !isDead) {
            isDead = true
            println("Sadly, $name's life has come to an end.")

        }
    }
}