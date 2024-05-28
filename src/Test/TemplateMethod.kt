package Test

import Tax.LocalTax
import Tax.StateTax

class TemplateMethod: Test() {
    override fun example() {
        breakLine()
        println("Template Method pattern example")
        println(taxCalculator.calculate(testItem, StateTax()))
        testItem.isImported = false
        testItem.value = 100.0
        println(taxCalculator.calculate(testItem, LocalTax()))
    }
}