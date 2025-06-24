fun main() {
    val a = 10
    val b = 3
    val result = a / b
    println(result)

    val seconds = readln().toInt()
    val hours = seconds / 3600
    val secondsForMinutes = seconds % 3600
    val minutes = secondsForMinutes / 60
    val leftSeconds = secondsForMinutes % 60
    println("$hours : $minutes : $leftSeconds")

    val amount = readln().toInt()
//    Доступный номинал купюр - 100, 50, 20, 10, 5, 2, 1
    val banknote100 = amount / 100
    val banknote50 = (amount % 100) / 50
    val banknote20 = ((amount % 100) % 50) / 20
    val banknote10 = ((amount % 50) % 20) / 10
    val banknote5 = ((amount % 20) % 10) / 5
    val banknote2 = ((amount % 10) % 5) / 2
    val banknote1 = (amount % 5) % 2
    println("""
        Вам доступно:
        100$ - ${banknote100}шт
        50$ - ${banknote50}шт
        20$ - ${banknote20}шт
        10$ - ${banknote10}шт
        5$ - ${banknote5}шт
        2$ - ${banknote2}шт
        1$ - ${banknote1}шт
    """.trimIndent())
}