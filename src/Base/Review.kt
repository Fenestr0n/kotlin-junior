package Base

fun main() {
    print("How was your expirience with us? (enter a number from 1 to 5): ")
    val rating = readln()
    println("Please leave a comment: ")
    val comment = readln()
    print("Thank you for your opinion\nYou left us a rating of $rating\nThe text of your comment: $comment")


    val name = readln()
    val date = readln()
    val place = readln()
    val father = readln()
    val mother = readln()
    val brother = readln()
    val wife = readln()

    println("Имя: $name\nДата рождения: $date\nМесто рождения: $place\nОтец: $father\nМать: $mother\nБрат: $brother\nЖена: $wife")
}