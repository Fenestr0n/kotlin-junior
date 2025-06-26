package OOP

class Car {
    var brand: String = ""
    var model: String = ""
    var enginePower: Int = 0
    var bodyColor: String = ""

    fun drive() {
        println("Еду на автомобиле")
    }

    fun refuel(stationName: String, fuelType: String, liters: Int) {
        println("Произведена заправка на АЗС \"${stationName}\"")
        println("Марка бензина: $fuelType")
        println("Кол-во литров: $liters")
    }
}