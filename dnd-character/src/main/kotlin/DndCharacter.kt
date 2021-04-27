import kotlin.math.floor

class DndCharacter {

    val strength: Int = ability()
    val dexterity: Int = ability()
    val constitution: Int = ability()
    val intelligence: Int = ability()
    val wisdom: Int = ability()
    val charisma: Int = ability()
    val hitpoints: Int = 10 + modifier(constitution)

    companion object {

        fun ability(): Int {
            val list = mutableListOf<Int>()
            for (i in 1..4) {
                val random = (1..6).random()
                list.add(random)
            }
            list.sort()
            list.removeAt(0)
            return list.sum()
        }

        fun modifier(score: Int): Int {
            val modifier = (score - 10) / 2.0
            return floor(modifier).toInt()
        }
    }

}
