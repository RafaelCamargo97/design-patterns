package Test

import Log.Logger

class Singleton: Test() {
    override fun example() {
        breakLine()
        println("Singleton pattern example")
        println(Logger.getInstance().getEvents())
    }
}