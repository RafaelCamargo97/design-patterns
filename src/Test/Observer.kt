package Test

import Observer.DiscountDBObserver

class Observer: Test() {
    override fun example() {
        breakLine()
        println("Observer pattern example")
        saleDiscount.attachObserver(DiscountDBObserver())
        saleDiscount.attachObserver(emailObserver)
        invoker2.addCommand(saleDiscount)
        invoker2.executeCommands(testItem)
        saleDiscount.detachObserver(emailObserver)
        invoker2.executeCommands(testItem2)
    }
}