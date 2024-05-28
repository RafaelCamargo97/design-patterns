package Test

import Command.CustomizeCommand
import Command.OnSaleDiscountCommand

class Command: Test() {
    override fun example() {
        breakLine()
        println("Command pattern example")
        invoker.addCommand(OnSaleDiscountCommand())
        invoker.addCommand(CustomizeCommand())
        invoker.executeCommands(item4)
        invoker.executeCommands(item1)
        println("Item.Item 4: " + item4.value)
        println("Item.Item 4: " + item4.customized)
        println("Item.Item 1: " + item1.value)
        println("Item.Item 1: " + item1.customized)

        invoker.unexecuteCommands(item4)
        println("Item.Item 4: " + item4.value)
        println("Item.Item 4: " + item4.customized)
        println("Item.Item 1: " + item1.value)
        println("Item.Item 1: " + item1.customized)

    }
}