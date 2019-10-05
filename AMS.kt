import java.util.*

fun main(args: Array<String>) {
    println("hello ${args[0]}")
    dayOfWeek()

    val temp = 10
    val msg = "yoy are ${if (temp > 50) "fried" else "safe"} fish"
    println(msg)
    println("you fortune is ${getFortuneCookie()}")
    var fortune: String
    for (i in 1..10) {
        fortune = getFortuneCookie()
        println("your kimat is : $fortune")
        if (fortune.contains("Take it easy")) break
    }
}

fun dayOfWeek() {
    println("what day is today?")
    val day = Calendar.getInstance().get(Calendar.DAY_OF_WEEK)
    println(
        when (day) {
            1 -> "Sunday"
            2 -> "Monday"
            3 -> "Tuesday"
            4 -> "Wednesday"
            5 -> "Thursday"
            6 -> "Friday"
            7 -> "Saturday"
            else -> "Time has stopped"
        }
    )
}

fun getFortuneCookie(): String {
    val wishes = listOf(
        "You will have a great day!",
        "Things will go well for you today.",
        "Enjoy a wonderful day of success.",
        "Be humble and all will turn out well.",
        "Today is a good day for exercising restraint.",
        "Take it easy and enjoy life!",
        "Treasure your friends, because they are your greatest fortune."
    )
    print("\nenter your birthday")
    val birthday = readLine()?.toIntOrNull() ?: 1
    return wishes[birthday.rem(wishes.size)]
}







