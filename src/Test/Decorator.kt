package Test

import Item.ExtendedWarrantyDecorator
import Item.FloorModelDecorator
import Item.InsuranceDecorator

class Decorator: Test() {
    override fun example() {
        breakLine()
        println("Decorator pattern example")
        println("Item: ${item2.details} Value: $${item2.value}")

        InsuranceDecorator(item2).add()
        println("After Insured Item: ${item2.details} Value: $${item2.value}")

        FloorModelDecorator(item2).add()
        println("After Floor Model Item: ${item2.details} Value: $${item2.value}")

        ExtendedWarrantyDecorator(item2).add()
        println("After Extended Warranty Item: ${item2.details} Value: $${item2.value}")
    }
}