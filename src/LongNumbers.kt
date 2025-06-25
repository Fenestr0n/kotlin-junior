fun main() {
    val numbers = 0..1_000_000_000L
    var sum = 0L
    for (number in numbers) {
        sum += number
    }
    println(sum)


    val years = readln().toLong()
    val result = 365 * 24 * 60 * 60 * years
    println(result)


    val terabytes = readln().toDouble()
    val bytes = (terabytes * 1024 * 1024 * 1024 * 1024).toLong()
    println(bytes)
}