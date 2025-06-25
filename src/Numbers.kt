fun main() {
    val numbers = listOf(1, 43, 22, 44, 56, 3, 12, 24, 67)
    for (number in numbers) {
        if (number % 2 == 0) {
            println(number)
        }
    }


    val brands = listOf("Toyota", "Ford", "Honda", "Nissan", "Volkswagen")
    val inputBrand = readln()
    var brandFound = false

    for (brand in brands) {
        if (inputBrand == brand) {
            brandFound = true
            break
        }
    }
    println(brandFound)
}