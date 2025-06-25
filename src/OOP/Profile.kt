package OOP

fun main() {
    val first = Person()
    val second = Person()
    print("Input 1st name: ")
    first.name = readln()

    print("Input 2nd name: ")
    second.name = readln()

    print("Input 1st age: ")
    first.age = readln().toInt()

    print("Input 2nd age: ")
    second.age = readln().toInt()

    println("1. Name: ${first.name}\nAge: ${first.age}")
    println("2. Name: ${second.name}\nAge: ${second.age}")
}