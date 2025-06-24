fun main() {
    println("The weather is good? true/else: ")
    val isGoodWeater = readln().toBoolean()
    println("What time is it?")
    val time = readln().toInt()
    val isDay = time < 22 && time > 5
    if (isDay && isGoodWeater) {
        println("Go for a walk")
    } else if(isDay) {
        println("Go to read book")
    } else {
        println("Go to sleep")
    }

    val isTruck = readln().toBoolean()
    val horsepower = readln().toInt()
    var taxRate = 0

    if (isTruck) {
        if (horsepower <= 100) {
            taxRate = 25
        } else if (horsepower <= 150) {
            taxRate = 40
        } else if (horsepower <= 200) {
            taxRate = 50
        } else if (horsepower <= 250) {
            taxRate = 65
        } else {
            taxRate = 85
        }
        println("Вид ТС: грузовой автомобиль")
    } else {
        if (horsepower <= 100) {
            taxRate = 10
        } else if (horsepower <= 150) {
            taxRate = 34
        } else if (horsepower <= 200) {
            taxRate = 49
        } else if (horsepower <= 250) {
            taxRate = 75
        } else {
            taxRate = 150
        }
        println("Вид ТС: легковой автомобиль")
    }

    val taxAmount = horsepower * taxRate

    println("Мощность двигателя: $horsepower л.с.")
    println("Налоговая ставка: $taxRate руб./л.с.")
    println("Сумма налога: $taxAmount руб.")
}
