package Base

fun main() {
    val family = listOf<String>("John", "Nick", "Helen", "Max")
    val person = family[3]
    println(person)


    val daysOfMonths = listOf<Int>(31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31)
    print("Enter index of month: ")
    val index = readln().toInt()
    if (index < 1 || index >12) {
        println("Incorrect number")
    } else {
        println(daysOfMonths[index - 1])
    }


    val months = listOf(
        "Январь", "Февраль", "Март", "Апрель", "Май", "Июнь",
        "Июль", "Август", "Сентябрь", "Октябрь", "Ноябрь", "Декабрь"
    )
    val num = readln().toInt()
    if (num in 1..12) {
        println(months[num - 1])
    } else {
        println("Некорректное значение: $num")
    }
}