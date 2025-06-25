package Base

fun main() {
    val names = listOf("John", "Mike", "Nick", "Helen", "Alex", "Emma")
    print("Enter name: ")
    val searchName = readln()
    var nameFound = false
//    var index = 0
//    while (index < names.size) {
//        println(names[index])
//        if (searchName == names[index]) {
//            nameFound = true
//            break
//        }
//        index++
//    }
    println("Name found: $nameFound")

    for (name in names) {
        println(name)
        if (searchName == name) {
            nameFound = true
            break
        }
    }
    println("Name found: $nameFound")
}