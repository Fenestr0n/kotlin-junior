fun main() {
    val countOfApples: Float = 10f
    val countOfPeople: Float = 4.0f
    val result = countOfApples / countOfPeople
    println(result)

    print("Enter first age: ")
    val firstAge = readln().toInt()
    print("Enter second age: ")
    val secondAge = readln().toInt()
    print("Enter third age: ")
    val thirdAge = readln().toInt()
    val average = (firstAge + secondAge + thirdAge) / 3.0
    println("Average age: $average")
}