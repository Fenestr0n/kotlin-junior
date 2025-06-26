package OOP

fun main() {
    val info = readln().split(" ")
    val stationName = info[0]
    val fuelType = info[1]
    val liters = info[2].toInt()

    val car = Car()
    car.refuel(stationName, fuelType, liters)
}