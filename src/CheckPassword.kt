fun main() {
    print("Enter password: ")
    val password = readln().toCharArray()
    var containsLetter = false
    var containsDigit = false
    var containsSpecialSymbol = false
    for (symbol in password) {
        if (symbol.isLetter()) {
            containsLetter = true
        }
        if (symbol.isDigit()) {
            containsDigit = true
        }
        if (!symbol.isLetterOrDigit()) {
            containsSpecialSymbol = true
        }
    }
    if (containsDigit && containsLetter && containsSpecialSymbol && password.size >= 0) {
        println("Password is valid")
    } else {
        println("Your password is too simple")
    }


    val passwd = readln().toCharArray()
    if (passwd.contains('Ъ')) {
        println("У вас идеальный пароль!")
    } else {
        println("Опс! В вашем пароле кое-чего не хватает.")
    }
}