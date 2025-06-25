fun main() {
    var a: Char = 'A'
    a++
    println(a)


    var letter = 'A'
    repeat(26) {
        println(letter)
        letter++
    }


    val letters = 'A'..'Z'
    for (letter in letters) {
        println(letter)
    }
}