import kotlin.random.Random

fun main() {
    val correctNumber = Random.nextInt(100)
    var isWin = false

    while (!isWin) {
        print("Enter number from 0 to 100: ")
        val number = readln().toInt()
        if (number < correctNumber) {
            println("Your number is lower")
        } else if (number > correctNumber) {
            println("Your number is highter")
        } else {
            isWin = true
            println("Your number is correct!!!")
        }
    }
}