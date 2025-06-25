fun main() {
    print("How old are you?: ")
    var age = readln().toInt()
    while (age < 18) {
        println("We are waiting for one year")
        age++
    }
    println("You can go to the cinema")


    val n = readln().toInt()
    val sum = (1..n).sum()
    println("Сумма чисел от 1 до $n равна $sum")
}