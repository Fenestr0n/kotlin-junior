package Base

fun main() {

    print("How many apples does John have? ")
    val john = readln().toInt()
    val nick = john + 7
    val sum = john + nick
    println("John and Nick have $sum apples")

    val first = readln().toInt()
    val second= readln().toInt()
    val result = first * second
    println(result)
}