fun main() {
    val temperature = readln().toInt()
    if (temperature > 25) {
        println("The AC is on")
    } else if (temperature < 20) {
        println("The AC is off")
    } else {
        println("The AC is idle")
    }


    val horsepower = readln().toInt()
    var taxRate = 0

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

    val taxAmount = horsepower * taxRate

    println("Вид ТС: легковой автомобиль")
    println("Мощность двигателя: $horsepower л.с.")
    println("Налоговая ставка: $taxRate руб./л.с.")
    println("Сумма налога: $taxAmount руб.")
}