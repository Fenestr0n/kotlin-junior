fun main() {
    val index = readln().toInt()
    val month = when (index) {
        1 -> "January"
        2 -> "February"
        3 -> "March"
        4 -> "April"
        5 -> "May"
        6 -> "June"
        7 -> "July"
        8 -> "August"
        9 -> "September"
        10 -> "October"
        11 -> "November"
        12 -> "December"
        else -> "Invalid month"
    }
    if (index in 1..12) {
        println("You entered index $index which corresponds to the month of $month")
    } else {
        println("Your entered index $index. There is no month with such an index")
    }


    val weight = readln().toFloat()
    val rate = when {
        weight < 2 -> "150 руб./км."
        weight < 5 -> "200 руб./км."
        weight < 12 -> "250 руб./км."
        weight < 18 -> "300 руб./км."
        weight < 30 -> "350 руб./км."
        weight < 200 -> "1000 руб./км."
        else -> "Для расчета стоимости свяжитесь с менеджером."
    }
    println(rate)

}