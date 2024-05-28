package Test

class ChainOfResponsibility: Test() {
    override fun example() {
        breakLine()
        println("Chain of Responsibility pattern example")
        println(discountCalculator.discountCalculate(1, 1002.0, false))
        println(discountCalculator.discountCalculate(1, 100.0, false))
        println(discountCalculator.discountCalculate(15, 100.0, false))
        println(discountCalculator.discountCalculate(1, 100.0, true))
    }
}