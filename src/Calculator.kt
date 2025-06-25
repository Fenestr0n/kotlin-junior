fun main() {
    print("Enter first number: ")
    val firstNumber = readln().toDouble()
    print("Enter symbol (* / + -): ")
    val symbol = readln()
    print("Enter second number: ")
    val secondNumber = readln().toDouble()

    var result = 0.0
    if (symbol == "/") {
        result = firstNumber / secondNumber
    } else if (symbol == "*") {
        result = firstNumber * secondNumber
    } else if (symbol == "+") {
        result = firstNumber + secondNumber
    } else if (symbol == "-") {
        result = firstNumber - secondNumber
    }
    println("$firstNumber $symbol $secondNumber = $result")


    val radius = readln().toDouble()
    val pi = 3.14
    println("Радиус: $radius")
    println("Длина окружности: ${2 * pi * radius}")
    println("Площадь круга: ${pi * radius * radius}")
}