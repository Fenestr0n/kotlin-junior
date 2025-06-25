fun main() {
//    val numbers = 0..<100 step 10
//    for (number in numbers) {
//        println(number)
//    }

    val numbers = 0..1000 step 2
    print("Enter a number: ")
    val number = readln().toInt()
    val result = number in numbers
    println(result)
    println(numbers)


    val start = readln().toInt()
    val end = readln().toInt()
    for (i in start..end step 8) {
        println(i)
    }
}