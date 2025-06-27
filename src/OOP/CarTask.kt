package OOP

fun main() {
    val info = readln().split(" ")
    val model = info[0]
    val fuelType = info[1]
    val enginePower = info[2].toInt()
    val bodyColor = info[3]

    val car = Car()
    car.init(model, fuelType, enginePower, bodyColor)
    car.drive(enginePower)
}