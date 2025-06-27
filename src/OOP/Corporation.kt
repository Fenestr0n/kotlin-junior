package OOP

fun main() {
//    val assistant = Assistant()
//    assistant.bringCoffe("Cappuccino", 5)

    print("Enter name: ")
    val name = readln()
    print("Enter brand: ")
    val brand = readln()
    print("Enter size: ")
    val size = readln().toFloat()
    print("Enter price: ")
    val price = readln().toInt()
    val productCard = ProductCard()
    productCard.init(name = name, brand = brand, size = size, price = price)
    productCard.printInfo()
}