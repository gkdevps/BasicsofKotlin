import kotlin.random.Random

fun main(args: Array<String>) {
    feedTheFish()
}
fun feedTheFish(){
    val day=randomDay()
    val food= fishFood(day)
    println("Today is $day and fish will eat $food" )
}

fun randomDay(): String {
    val days = listOf("monday", "tuesday", "wednesday", "Friday")
    return days[Random.nextInt(4)]
}

fun fishFood(day: String): String {
    val food = "fasting"
    return when (day) {
        "monday" -> "a"
        "tuesday" -> "t"
        "wednesday" -> "w"
        "Friday" -> "f"
        else -> food
    }
}
