package OOP

class Assistant {
    fun bringCoffe(drinkName: String, count: Int) {
        repeat(count) {
            println("Get up")
            println("Go to the coffe machine")
            println("Press the \"$drinkName\" button")
            println("Wait for the $drinkName to be prepared")
            println("Take coffee")
            println("Bring coffee to the director")
            println("Put coffee on the table")
            println("Return to the workplace")
        }
    }
}